package ORCBool;

import org.apache.commons.math3.fraction.BigFraction;

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
    public BigFraction E(ORC_Context context, Boolean r) throws Exception {
        return A.E(context, r).multiply(n);
    }

    @Override
    public BigFraction P(ORC_Context context, BigFraction postF, BigFraction postT) throws Exception {
        return BigFraction.ONE.subtract(
                (BigFraction.ONE.subtract(A.P(context, postF, postT))).pow(n)
        );
    }
}