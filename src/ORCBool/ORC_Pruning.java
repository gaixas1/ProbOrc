package ORCBool;

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
    public BigFraction E(ORC_Context c, Boolean r) throws Exception {
        BigFraction pbF = B.P(c, BigFraction.ONE, BigFraction.ZERO);
        BigFraction pbT = B.P(c, BigFraction.ZERO, BigFraction.ONE);
        
        if(pbF.equals(BigFraction.ZERO)){
            if(pbT.equals(BigFraction.ZERO)){
                return A.E(c, r);
            } else {
                c.define(var, true);
                BigFraction t = A.E(c, r).multiply(pbT);
                c.undefine(var);
                return A.E(c, r).multiply(BigFraction.ONE.subtract(pbT)).add(t);
            }
        } else {
            if(pbT.equals(BigFraction.ZERO)){
                c.define(var, false);
                BigFraction t = A.E(c, r).multiply(pbF);
                c.undefine(var);
                return A.E(c, r).multiply(BigFraction.ONE.subtract(pbF)).add(t);
            } else {
                throw new Exception("Invalid expression: non-deterministic return"); 
            }
        }
    }

    @Override
    public BigFraction P(ORC_Context c, BigFraction postF, BigFraction postT) throws Exception {
        BigFraction pbF = B.P(c, BigFraction.ONE, BigFraction.ZERO);
        BigFraction pbT = B.P(c, BigFraction.ZERO, BigFraction.ONE);
        
        if(pbF.equals(BigFraction.ZERO)){
            if(pbT.equals(BigFraction.ZERO)){
                return A.P(c, postF, postT);
            } else {
                c.define(var, true);
                BigFraction t = A.P(c, postF, postT).multiply(pbT);
                c.undefine(var);
                return A.P(c, postF, postT).multiply(BigFraction.ONE.subtract(pbT)).add(t);
            }
        } else {
            if(pbT.equals(BigFraction.ZERO)){
                c.define(var, false);
                BigFraction t = A.P(c, postF, postT).multiply(pbF);
                c.undefine(var);
                return A.P(c, postF, postT).multiply(BigFraction.ONE.subtract(pbF)).add(t);
            } else {
                throw new Exception("Invalid expression: non-deterministic return"); 
            }
        }
    }
}