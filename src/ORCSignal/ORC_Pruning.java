package ORCSignal;

import org.apache.commons.math3.fraction.BigFraction;

public class ORC_Pruning extends ORC_Expression {
    // A <var< B
    private String var;
    private ORC_Expression A;
    private ORC_Expression B;
    
    public ORC_Pruning(String _var, ORC_Expression _A, ORC_Expression _B) {
        var = _var;
        A = _A;
        B = _B;
    }
    
    @Override
    public String toString() {
        return "("+A+" <"+var+"< "+B+")";
    }
    
    @Override
    BigFraction E(ORC_Context context) throws Exception {
        BigFraction pb = B.P(context, BigFraction.ONE);
        BigFraction eAu = A.E(context).multiply(BigFraction.ONE.subtract(pb));
        context.define(var,true);
        BigFraction eAd = A.E(context).multiply(pb);
        context.undefine(var);
        return eAu.add(eAd);
    }

    @Override
    BigFraction P(ORC_Context context, BigFraction post) throws Exception {
        BigFraction pb = B.P(context, BigFraction.ONE);
        BigFraction eAu = A.P(context, post).multiply(BigFraction.ONE.subtract(pb));
        context.define(var,true);
        BigFraction eAd = A.P(context, post).multiply(pb);
        context.undefine(var);
        return eAu.add(eAd);
    }
}