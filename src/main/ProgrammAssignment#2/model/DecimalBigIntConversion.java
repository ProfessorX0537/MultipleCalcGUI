package model;

import java.math.BigDecimal;

/**
 * Interface specifically for conversions that need to be made in BigDecimal.
 * Doesn't inherit from {@link ToBigInteger} because BigDecimal and BigInteger
 * are separate data types.
 */
public interface DecimalBigIntConversion {
    /**
     * Will take a given string and convert t BigDecimal
     * @param s is handed a string from user input
     * @return returns BigDecimal
     */
    BigDecimal toBigDecimal(String s);

    /**
     * @param s handed a BigDecimal string
     * @return String representation of BigDecimal String
     */
    String toDecimalString(String s);
}
