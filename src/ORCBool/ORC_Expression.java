package ORCBool;
import org.apache.commons.math3.fraction.BigFraction;

public abstract class ORC_Expression implements Cloneable {
    abstract public BigFraction E(ORC_Context context, Boolean r) throws Exception;
    abstract public BigFraction P(ORC_Context context, BigFraction postF, BigFraction postT) throws Exception;
}