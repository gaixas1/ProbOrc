package VModelOrc;

import java.util.ArrayList;
import java.util.Iterator;

public class ORC_Sequential extends ORC_Expression {
    // A >> B
    private ORC_Expression A;
    private ORC_Expression B;
    
    public ORC_Sequential(ORC_Expression _A, ORC_Expression _B) {
        A = _A;
        B = _B;
    }
    
    @Override
    public String toString() {
        return "("+A+" >> "+B+")";
    }
    
    @Override
    ArrayList Ex(ORC_Context context) throws Exception {
        ArrayList retA = A.Ex(context);
        ArrayList ret = new ArrayList();
        Iterator it = retA.iterator();
        while(it.hasNext()){
            it.next();
            ret.addAll(B.Ex(context));
        }
        return ret;
    }
}