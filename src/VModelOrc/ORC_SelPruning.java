package VModelOrc;

import java.util.ArrayList;

public class ORC_SelPruning extends ORC_Expression {
    // A <var< B
    private ORC_Expression A;
    private ORC_Expression B;
    
    public ORC_SelPruning(ORC_Expression _A, ORC_Expression _B) {
        A = _A;
        B = _B;
    }
    
    @Override
    public String toString() {
        return "("+A+" <| "+B+")";
    }
    
    @Override
    ArrayList Ex(ORC_Context context) throws Exception {
        ArrayList retB = B.Ex(context);
        if(!retB.isEmpty()) {
            return A.Ex(context);
        } 
        return new ArrayList();
    }
}