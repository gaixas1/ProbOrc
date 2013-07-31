package ORCSignal;

import org.apache.commons.math3.fraction.BigFraction;

public class SignalSite {
    private BigFraction p;
    public SignalSite(BigFraction _p){
        p = _p;
    }

    public SignalSite(double _p){
        p = new BigFraction(_p);
    }

    public SignalSite(int a, int b) {
        p = new BigFraction(a,b);
    }
    
    @Override
    public String toString(){return " Pr:"+p;}
    
    public BigFraction P(BigFraction post){return post.multiply(p);};
    public BigFraction E(){return p;};
}
