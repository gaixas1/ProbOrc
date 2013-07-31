package ORCSignal;

import org.apache.commons.math3.fraction.BigFraction;

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
    BigFraction E(ORC_Context context) throws Exception {
        return A.E(context).multiply(B.P(context, BigFraction.ONE));
    }

    @Override
    BigFraction P(ORC_Context context, BigFraction post) throws Exception {
        return A.P(context,post).multiply(B.P(context, BigFraction.ONE));
    }
}