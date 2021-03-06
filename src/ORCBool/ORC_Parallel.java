package ORCBool;

import org.apache.commons.math3.fraction.BigFraction;

public class ORC_Parallel extends ORC_Expression {
    //A | B
    private ORC_Expression A;
    private ORC_Expression B;
    
    ORC_Parallel(ORC_Expression _A, ORC_Expression _B) {
        A = _A; B = _B;
    }
    
    @Override
    public String toString() {
        return "("+A+" | "+B+")";
    }
    
    @Override
    public BigFraction E(ORC_Context context, Boolean r) throws Exception {
        return A.E(context,r).add(B.E(context,r));
    }

    @Override
    public BigFraction P(ORC_Context context, BigFraction postF, BigFraction postT) throws Exception {
        return BigFraction.ONE.subtract(
            BigFraction.ONE.subtract(A.P(context, postF, postT)).multiply( 
                BigFraction.ONE.subtract(B.P(context, postF, postT))
            )
        );
    }
}