package ORCSignal;

import org.apache.commons.math3.fraction.BigFraction;

public class ORC_Call extends ORC_Expression {

    private String name;
    private String[] attr;

    public ORC_Call(String _name, String[] _attr) {
        name = _name;
        attr = _attr;
    }

    @Override
    public String toString() {
        String extra = "";
        if (attr != null && attr.length > 0) {
            extra += attr[0];
            for (int i = 1; i < attr.length; i++) {
                extra += "," + attr[i];
            }
        }
        return name + "(" + extra + ")";
    }

    @Override
    BigFraction E(ORC_Context context) throws Exception {
        if (name.equals("1")) {
            for (int i = 0; i < attr.length; i++) {
                if (!context.defined(attr[i])) {
                    return BigFraction.ZERO;
                }
            }
            return BigFraction.ONE;
        } else {
            ORC_EXP ex = ORC.Singleton().getEXP(name);
            if (ex.isExpression()) {
                Boolean[] vals = new Boolean[attr.length];
                for (int i = 0; i < attr.length; i++) {
                    if (context.defined(attr[i])) {
                        vals[i] = context.get(attr[i]);
                    }
                }
                return ex.E(vals);
            } else {
                Boolean[] vals = new Boolean[attr.length];
                for (int i = 0; i < attr.length; i++) {
                    if (!context.defined(attr[i])) {
                        return BigFraction.ZERO;
                    }
                }
                return ex.E(vals);
            }
        }
    }

    @Override
    BigFraction P(ORC_Context context, BigFraction post) throws Exception {
        if (name.equals("1")) {
            for (int i = 0; i < attr.length; i++) {
                if (!context.defined(attr[i])) {
                    return BigFraction.ZERO;
                }
            }
            return post;
        } else {
            ORC_EXP ex = ORC.Singleton().getEXP(name);
            if (ex.isExpression()) {
                Boolean[] vals = new Boolean[attr.length];
                for (int i = 0; i < attr.length; i++) {
                    if (context.defined(attr[i])) {
                        vals[i] = context.get(attr[i]);
                    }
                }
                return ex.P(vals, post);
            } else {
                Boolean[] vals = new Boolean[attr.length];
                for (int i = 0; i < attr.length; i++) {
                    if (!context.defined(attr[i])) {
                        return BigFraction.ZERO;
                    }
                }
                return ex.P(vals, post);
            }
        }

    }
}
