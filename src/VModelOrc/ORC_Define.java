package VModelOrc;

import java.util.ArrayList;
import java.util.Iterator;

public class ORC_Define extends ORC_Expression {
    // A >var> B
    private String var;
    private ORC_Expression A;
    private ORC_Expression B;
    
    public ORC_Define(String _var, ORC_Expression _A, ORC_Expression _B) {
        var = _var;
        A = _A;
        B = _B;
    }
    
    @Override
    public String toString() {
        return "("+A+" >"+var+"> "+B+")";
    }
    
    @Override
    ArrayList Ex(ORC_Context context) throws Exception {
        ArrayList retA = A.Ex(context);
        ArrayList ret = new ArrayList();
        Iterator it = retA.iterator();
        while(it.hasNext()){
            Object o = it.next();
            context.define(var, o);
            
            ret.addAll(B.Ex(context));
        }
        context.undefine(var);
        return ret;
    }
}