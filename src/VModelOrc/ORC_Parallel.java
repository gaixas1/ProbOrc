package VModelOrc;

import java.util.ArrayList;

public class ORC_Parallel extends ORC_Expression {
    //A | B
    private ORC_Expression A;
    private ORC_Expression B;
    
    ORC_Parallel(ORC_Expression _A, ORC_Expression _B) {
        A = _A; B = _B;
    }
    
    @Override
    public String toString() {
        return "("+A+" | "+B+")";
    }
    
    @Override
    ArrayList Ex(ORC_Context context) throws Exception {
        ArrayList ret = A.Ex(context);
        ArrayList retB = B.Ex(context);
        ret.addAll(retB);
        return ret;
    }
}