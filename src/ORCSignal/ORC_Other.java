package ORCSignal;

import org.apache.commons.math3.fraction.BigFraction;

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
    BigFraction E(ORC_Context context) throws Exception {
        return A.E(context).add(BigFraction.ONE.subtract(A.P(context, BigFraction.ONE)).multiply(B.E(context)));
    }

    @Override
    BigFraction P(ORC_Context context, BigFraction post) throws Exception {
        BigFraction pA = A.P(context, post);
        BigFraction pB = B.P(context, post);
        return pA.add(BigFraction.ONE.subtract(pA).multiply(pB));
    }
}