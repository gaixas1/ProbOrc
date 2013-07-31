package ORCBool;

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
    public BigFraction E(ORC_Context context, Boolean r) throws Exception {
        return A.E(context, r).multiply(B.P(context, BigFraction.ONE, BigFraction.ONE));
    }

    @Override
    public BigFraction P(ORC_Context context, BigFraction postF, BigFraction postT) throws Exception {
        return A.P(context,postF,postT).multiply(B.P(context, BigFraction.ONE, BigFraction.ONE));
    }
}