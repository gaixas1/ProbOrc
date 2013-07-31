package VModelOrc;

import java.util.ArrayList;

public class ORC_Pruning extends ORC_Expression {
    // A <var< B
    private String var;
    private ORC_Expression A;
    private ORC_Expression B;
    
    public ORC_Pruning(String _var, ORC_Expression _A, ORC_Expression _B) {
        var = _var;
        A = _A;
        B = _B;
    }
    
    @Override
    public String toString() {
        return "("+A+" <"+var+"< "+B+")";
    }
    
    @Override
    ArrayList Ex(ORC_Context context) throws Exception {
        ArrayList retB = B.Ex(context);
        if(retB.isEmpty()) {
            return A.Ex(context);
        } else {
            context.define(var, retB.get(0));
            ArrayList ret = A.Ex(context);
            context.undefine(var);
            return ret;
        }
    }
}