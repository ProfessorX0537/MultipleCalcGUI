package model;

import model.BinaryBigIntConversion;
import model.DecimalBigIntConversion;
import model.HexBigIntConversion;
import view.BigIntCalc;

import java.math.BigInteger;

/**
 * Interface sub classed by {@link HexBigIntConversion}, {@link BinaryBigIntConversion}, and
 * {@link DecimalBigIntConversion}. As well as implemented by {@link BigIntCalc} to make proper conversion
 * of strings input by user.
 */
public interface ToBigInteger {
    BigInteger toBigInteger(String s);
}
