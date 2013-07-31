package ORCSignal;

import java.util.LinkedList;
import org.apache.commons.math3.fraction.BigFraction;

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
    BigFraction E(ORC_Context context) throws Exception {
        BigFraction ret = A.E(context);
        context.define(var, true);
        ret = ret.multiply(B.E(context));
        context.undefine(var);
        return ret;
    }

    @Override
    BigFraction P(ORC_Context context, BigFraction post) throws Exception {
        context.define(var, true);
        BigFraction ppost = B.P(context, post);
        context.undefine(var);
        return A.P(context, ppost);
    }
}
