package ORCBool;

import org.apache.commons.math3.fraction.BigFraction;

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
    public BigFraction E(ORC_Context context, Boolean r) throws Exception {
        return A.E(context, null).multiply(B.E(context, r));
    }

    @Override
    public BigFraction P(ORC_Context context, BigFraction postF, BigFraction postT) throws Exception {
        BigFraction pB = B.P(context, postF, postT);
        return A.P(context, pB, pB);
    }
}