package ORCBool;

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
    public BigFraction E(ORC_Context context, Boolean r) throws Exception {
        if(r == null){
            return A.E(context, null).add(BigFraction.ONE.subtract(A.P(context, BigFraction.ONE, BigFraction.ONE)).multiply(B.E(context, null))); 
        }else if(r==true){
            return A.E(context, true).add(BigFraction.ONE.subtract(A.P(context, BigFraction.ZERO, BigFraction.ONE)).multiply(B.E(context, true))); 
        }else {
            return A.E(context, false).add(BigFraction.ONE.subtract(A.P(context, BigFraction.ONE, BigFraction.ZERO)).multiply(B.E(context, false))); 
        }
    }

    @Override
    public BigFraction P(ORC_Context context, BigFraction postF, BigFraction postT) throws Exception {
        BigFraction pA = A.P(context, postF, postT);
        BigFraction pB = B.P(context, postF, postT);
        return pA.add(BigFraction.ONE.subtract(pA).multiply(pB));
    }
}