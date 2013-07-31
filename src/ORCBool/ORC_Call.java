package ORCBool;

import org.apache.commons.math3.fraction.BigFraction;

public class ORC_Call extends ORC_Expression {
    private String name;
    private String[] attr;
    
    public ORC_Call(String _name, String[] _attr) {
        name = _name; attr = _attr;
    }
    
    @Override
    public String toString(){
        String extra = "";
        if(attr!= null && attr.length>0){
            extra +=attr[0];
            for(int i = 1; i< attr.length; i++)
            extra += ","+attr[i];
        }
        return name+"("+extra+")";
    }
    
    public BigFraction E(ORC_Context context, Boolean r) throws Exception {
        if(name.equals("1")){
            for(int i = 0; i< attr.length; i++){
                if(!context.defined(attr[i])) {
                    return BigFraction.ZERO;
                }
            }
            if((attr.length == 0) || (r==null) || (r == context.get(attr[attr.length-1]))){
                return BigFraction.ONE;
            } else {
                return BigFraction.ZERO;
            }
        }else {
            ORC_EXP ex = ORC.Singleton().getEXP(name);
            if(ex.isExpression()){
                Boolean[] vals = new Boolean[attr.length];
                for(int i = 0; i< attr.length; i++){
                    if(context.defined(attr[i])){
                        vals[i] = context.get(attr[i]);
                    }
                }
                return ex.E(vals, r);
            } else {
                Boolean[] vals = new Boolean[attr.length];
                for(int i = 0; i< attr.length; i++){
                    if(!context.defined(attr[i])){
                        return BigFraction.ZERO;
                    }
                    vals[i] = context.get(attr[i]);
                }
                return ex.E(vals, r);
            }
        }
    }
    
    public BigFraction P(ORC_Context context, BigFraction postF, BigFraction postT) throws Exception {
        if(name.equals("1")){
            if(attr.length == 0) {
                return postT;
            }
            for(int i = 0; i< attr.length; i++){
                if(!context.defined(attr[i])) {
                    return BigFraction.ZERO;
                }
            }
            if(context.get(attr[attr.length-1])==true){
                return postT;
            } else {
                return postF;
            }
        }else {
            ORC_EXP ex = ORC.Singleton().getEXP(name);
            if(ex.isExpression()){
                Boolean[] vals = new Boolean[attr.length];
                for(int i = 0; i< attr.length; i++){
                    if(context.defined(attr[i])){
                        vals[i] = context.get(attr[i]);
                    } 
                }
                return ex.P(vals, postF, postT);
            } else {
                Boolean[] vals = new Boolean[attr.length];
                for(int i = 0; i< attr.length; i++){
                    if(!context.defined(attr[i])){
                        return BigFraction.ZERO;
                    }
                    vals[i] = context.get(attr[i]);
                }
                return ex.P(vals, postF, postT);
            }
        }
    }
}