package VModelOrc;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.Tree;

public class ORC {
    private Map<String, ORC_EXP> Expressions;
    private static ORC s;
    
    public static ORC Singleton() {
        if(s == null) {
            s = new ORC();
        }
        return s;
    }
    
    private ORC () {
        Expressions = new HashMap<>();
    }
    
    public void AddExpression(String code) throws Exception {
        ORCLexer lexer = new ORCLexer(new ANTLRStringStream(code));  
        CommonTokenStream tokens;
        tokens = new CommonTokenStream(lexer);
        tokens.fill();
        ORCParser parser = new ORCParser(tokens); 
        CommonTree ast;
        try {
            ast = (CommonTree) parser.expr().getTree();
        } catch (Exception ex) {
            throw new Exception("Bad Expression");
        }
        if (ast == null) {
            throw new Exception("Bad Expression");
        }
        
        String name = ast.getText();
        ORC_EXP E = new ORC_EXP(name, attr(ast.getChild(0)), read(ast.getChild(1)));
        
        Expressions.put(name, E);
    }
    
    public void AddSite(String name, Site site) throws Exception {
        if (!(site instanceof  Site)) {
            throw new Exception("Bad site");
        }
        
        ORC_EXP E = new ORC_EXP(name, site);
        Expressions.put(name, E);
    }
    
    
    private String[] attr(Tree child) {
        String[] attr = new String[child.getChildCount()];
        for(int i = 0; i<child.getChildCount(); i++){
            attr[i] = child.getChild(i).getText();
        }
        return attr;
    }
    
    private ORC_Expression read(Tree ast) throws Exception {
        switch(ast.getText()) {
            case ">" : {
                if(ast.getChildCount() == 2){
                    return new ORC_Sequential(read(ast.getChild(0)),read(ast.getChild(1)));
                } else {
                    return new ORC_Define(ast.getChild(1).getText(), read(ast.getChild(0)),read(ast.getChild(2)));
                }
            }
            case "<" : {
                Tree t = ast.getChild(1);
                if(t.getText().equals("!")){
                    return new ORC_SelPruning(read(ast.getChild(0)),read(ast.getChild(2)));
                } else {
                    return new ORC_Pruning(t.getText(), read(ast.getChild(0)),read(ast.getChild(2)));
                }
            }
            case ";" : {
                return new ORC_Other(read(ast.getChild(0)),read(ast.getChild(1)));
            }
            case "|" : {
                try{
                    int n = Integer.parseInt(ast.getChild(0).getText());
                    if(n==1) {
                        if(ast.getChild(0).getChildCount()>0){
                            return new ORC_Parallel(read(ast.getChild(0)),read(ast.getChild(1)));
                        }
                    }
                    return new ORC_NParallel(n, read(ast.getChild(1)));
                } catch (NumberFormatException e) {
                    return new ORC_Parallel(read(ast.getChild(0)),read(ast.getChild(1)));
                }
            }
            case "If" : {
                throw new Exception("Invalid site If");
            }
            case "1" : {
                return new ORC_Call("1", attr(ast.getChild(0)));
            }
            case "0" : {
                return new ORC_Call("0", null);
            }
            default : {
                Tree child = ast.getChild(0);
                String[] attr = new String[child.getChildCount()];
                for(int i = 0; i<child.getChildCount(); i++){
                    attr[i] = child.getChild(i).getText();
                }
                return new ORC_Call(ast.getText(), attr);
            }
        }
        
    }

    public List<String> ListAll() {
        return new LinkedList<>(Expressions.keySet());
    }
    
    @Override
    public String toString() {
        String ret = "Expressions :\n";
        List<String> list = ListAll();
        for (int i = 0; i<list.size(); i++) {
            if(Expressions.get(list.get(i)).isExpression()) {
                ret += "\t"+Expressions.get(list.get(i))+"\n";
            }
        }
        ret += "\nSites :\n";
        for (int i = 0; i<list.size(); i++) {
            if(Expressions.get(list.get(i)).isSite()) {
                ret += "\t"+Expressions.get(list.get(i))+"\n";
            }
        }
        return ret;
    }

    ORC_EXP getEXP(String name) {
        return Expressions.get(name);
    }
    
    public String getCode(String name) {
        ORC_EXP e = getEXP(name);
        if(e != null){
            return e.toString();
        } else {
            return null;
        }
    }
    
    public ArrayList Ex(String name) throws Exception {
        ORC_EXP e = getEXP(name);
        if(e != null) {
            return e.Ex(new Object[0]);
        } else {
            return new ArrayList();
        }
    }
    
    public ArrayList Ex(String name, Object[] pars) throws Exception {
        ORC_EXP e = getEXP(name);
        if(e != null) {
            if(e.isSite()){
                for(int i = 0; i< pars.length; i++) {
                    if(pars[i]==null){
                        return new ArrayList();
                    }
                }
            }
            return e.Ex(pars);
        } else {
            return null;
        }
    }
}