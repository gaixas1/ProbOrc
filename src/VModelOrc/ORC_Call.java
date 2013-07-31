package VModelOrc;

import java.util.ArrayList;

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
    
    @Override
    ArrayList Ex(ORC_Context context) throws Exception {
        if(name.equals("1")){
            ArrayList ret = new ArrayList();
            for(int i = 0; i< attr.length; i++){
                if(!context.defined(attr[i])){
                    return ret;
                }
            }
            if(attr.length==0){
                ret.add(true);
            } else {
                ret.add(context.get(attr[attr.length-1]));
            }
            return ret;
        }else {
            ORC_EXP ex = ORC.Singleton().getEXP(name);
            if(ex.isExpression()){
                Object[] vals = new Boolean[attr.length];
                for(int i = 0; i< attr.length; i++){
                    if(context.defined(attr[i])){
                        vals[i] = context.get(attr[i]);
                    }
                }
                return ex.Ex(vals);
            } else {
                
                Object[] vals = new Boolean[attr.length];
                for(int i = 0; i< attr.length; i++){
                    if(!context.defined(attr[i])){
                        return new ArrayList();
                    }
                    vals[i] = context.get(attr[i]);
                }
                return ex.Ex(vals);
            }
        }
    }
}