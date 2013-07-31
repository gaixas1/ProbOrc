package ORCBool;

import org.apache.commons.math3.fraction.BigFraction;

class ORC_If extends ORC_Expression {
    private IFTYPES type;
    private String a;
    private String b;

    ORC_If(IFTYPES _type, String _a, String _b) {
        type = _type; a = _a; b = _b;
    }
    
    @Override
    public String toString() {
        switch(type) {
            case EQ: return "If("+a+"="+b+")";
            case NEQ: return "If("+a+"!="+b+")";
            case G: return "If("+a+">"+b+")";
            case GEQ: return "If("+a+">="+b+")";
            case L: return "If("+a+"<"+b+")";
            case LEQ: return "If("+a+"<="+b+")";
            default:
                throw new AssertionError(type.name());
        }
    }

    @Override
    public BigFraction E(ORC_Context c, Boolean r) throws Exception {
        if(r==null || r==true){
            int va;
            int vb;
            switch (a) {
                case "true": va = 1; break;
                case "false": va = 0; break;
                default:
                    if(!c.defined(a)){ return BigFraction.ZERO;} 
                    else {
                        if(c.get(a)==true) { va = 1;} 
                        else { va = 0;} }
                    break;
            }
            switch (b) {
                case "true": vb = 1; break;
                case "false": vb = 0; break;
                default:
                    if(!c.defined(b)){ return BigFraction.ZERO;} 
                    else {
                        if(c.get(b)==true) { vb = 1;} 
                        else { vb = 0;} }
                    break;
            }
            
            switch(type) {
                case EQ: if(va==vb) {return BigFraction.ONE;}else{return BigFraction.ZERO;}
                case NEQ: if(va!=vb) {return BigFraction.ONE;}else{return BigFraction.ZERO;}
                case G: if(va>vb) {return BigFraction.ONE;}else{return BigFraction.ZERO;}
                case GEQ: if(va>=vb) {return BigFraction.ONE;}else{return BigFraction.ZERO;}
                case L: if(va<vb) {return BigFraction.ONE;}else{return BigFraction.ZERO;}
                case LEQ: if(va<=vb) {return BigFraction.ONE;}else{return BigFraction.ZERO;}
                default:
                    throw new AssertionError(type.name());
            }
        }
        return BigFraction.ZERO;
    }

    @Override
    public BigFraction P(ORC_Context c, BigFraction postF, BigFraction postT) throws Exception {
        if(!postT.equals(BigFraction.ZERO)){
            int va;
            int vb;
            switch (a) {
                case "true": va = 1; break;
                case "false": va = 0; break;
                default:
                    if(!c.defined(a)){ return BigFraction.ZERO;} 
                    else {
                        if(c.get(a)==true) { va = 1;} 
                        else { va = 0;} }
                    break;
            }
            switch (b) {
                case "true": vb = 1; break;
                case "false": vb = 0; break;
                default:
                    if(!c.defined(b)){ return BigFraction.ZERO;} 
                    else {
                        if(c.get(b)==true) { vb = 1;} 
                        else { vb = 0;} }
                    break;
            }
            
            switch(type) {
                case EQ: if(va==vb) {return postT;}else{return BigFraction.ZERO;}
                case NEQ: if(va!=vb) {return postT;}else{return BigFraction.ZERO;}
                case G: if(va>vb) {return postT;}else{return BigFraction.ZERO;}
                case GEQ: if(va>=vb) {return postT;}else{return BigFraction.ZERO;}
                case L: if(va<vb) {return postT;}else{return BigFraction.ZERO;}
                case LEQ: if(va<=vb) {return postT;}else{return BigFraction.ZERO;}
                default:
                    throw new AssertionError(type.name());
            }
        }
        return BigFraction.ZERO;
    }
}