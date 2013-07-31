package VModelOrc;

import java.util.ArrayList;

public class ORC_EXP {
    private String name;
    private Object O;
    private Boolean tp;
    private String[] attr;

    public ORC_EXP(String _name, String[] _attr, ORC_Expression _E) {
        name = _name; attr = _attr; O = _E; tp = true;
    }
    
    public ORC_EXP(String _name, Site _site) {
        name = _name; O = _site; tp = false;
    }
    
    @Override
    public String toString(){
        String extra = "";
        if(attr!= null && attr.length>0){
            extra +=attr[0];
            for(int i = 1; i< attr.length; i++)
            extra += ","+attr[i];
        }
        if(tp){
            return name+"("+extra+") = "+O;
        } else {
            return name+" "+O.toString();
        }
    }

    public ArrayList Ex(Object[] vals) throws Exception {
        if(tp){
            if(attr.length!=vals.length) {
                throw new Exception("Bad number of parameters on call.");
            }
            ORC_Context c = new ORC_Context();
            for (int i = 0; i < attr.length; i++) {
                if(vals[i] != null){
                    c.define(attr[i],vals[i]);
                }
            }
            return ((ORC_Expression)O).Ex(c);
        } else {
            return ((Site)O).Ex(vals);
        }
    }

    boolean isExpression() {
        return tp;
    }

    boolean isSite() {
        return !tp;
    }
}