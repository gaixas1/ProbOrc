package ORCBool;

import org.apache.commons.math3.fraction.BigFraction;

public abstract class BoolSite {
    
    abstract public BigFraction P(Boolean[] vals, BigFraction postF, BigFraction postT);
    abstract public BigFraction E(Boolean[] vals,Boolean r);
}