package ORCSignal;

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
    BigFraction E(ORC_Context context) throws Exception {
        return A.E(context).multiply(n);
    }

    @Override
    BigFraction P(ORC_Context context, BigFraction post) throws Exception {
        return BigFraction.ONE.subtract(
                (BigFraction.ONE.subtract(A.P(context, post))).pow(n)
        );
    }
}