package ORCBool;

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
    
    public BigFraction E(ORC_Context context, Boolean r) throws Exception {
        BigFraction retT = A.E(context, true);
        context.define(var, true);
        retT = retT.multiply(B.E(context,r));
        
        BigFraction retF = A.E(context, false);
        context.define(var, false);
        retF = retF.multiply(B.E(context,r));
        
        context.undefine(var);
        return retT.add(retF);
    }

    public BigFraction P(ORC_Context context, BigFraction postF, BigFraction postT) throws Exception {
        context.define(var, true);
        BigFraction ppostT = B.P(context, postF, postT);
        
        context.define(var, false);
        BigFraction ppostF = B.P(context, postF, postT);
        
        context.undefine(var);
        return A.P(context, ppostF, ppostT);
    }
}