package ORCBool;

import java.util.HashMap;
import java.util.Map;

public class ORC_Context {
    private Map<String, Boolean> vars;
    
    public ORC_Context() {
        vars = new HashMap<>();
    }
    
    public Boolean defined(String name) {
        if(vars.containsKey(name)) {
            return true;
        } else {
            return false;
        }
    }
    public Boolean get(String name) {
        if(vars.containsKey(name)){
            return vars.get(name);
        } else {
            return null;
        }
    }
    
    public void define(String name, boolean val) {
        vars.put(name, val);
    }
    
    public void undefine(String name) {
        vars.remove(name);
    }
}