package VModelOrc;

import java.util.ArrayList;

public class ORC_NParallel extends ORC_Expression {
    //|n A
    private int n;
    private ORC_Expression A;
    
    ORC_NParallel(int _n, ORC_Expression _A) {
        A = _A; n = _n;
    }
    
    @Override
    public String toString() {
        return "(|"+n+" "+A+")";
    }
    
    @Override
    ArrayList Ex(ORC_Context context) throws Exception {
        ArrayList ret = new ArrayList();
        for(int i = 0; i<n; i++){
            ret.addAll(A.Ex(context));
        }
        return ret;
    }
}