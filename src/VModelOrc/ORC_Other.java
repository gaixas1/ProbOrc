package VModelOrc;

import java.util.ArrayList;

public class ORC_Other extends ORC_Expression {
    //A ; B
    private ORC_Expression A;
    private ORC_Expression B;
    
    public ORC_Other(ORC_Expression _A, ORC_Expression _B){
        A = _A; B = _B;
    }
    
    @Override
    public String toString() {
        return "("+A+" ; "+B+")";
    }
    
    @Override
    ArrayList Ex(ORC_Context context) throws Exception {
        ArrayList retA = A.Ex(context);
        if(retA.isEmpty()) {
            return B.Ex(context);
        } else {
            return retA;
        }
    }
}