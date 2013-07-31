package ORCSignal;

import org.apache.commons.math3.fraction.BigFraction;

public abstract class ORC_Expression  {
    abstract BigFraction E(ORC_Context context) throws Exception;
    abstract BigFraction P(ORC_Context context, BigFraction post) throws Exception;
}
