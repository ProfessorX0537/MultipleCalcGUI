public interface HexBigIntConversion extends ToBigInteger {
    /**
     * extends BigInteger by adding a conversion method of toHex
     * @param s user input handed to the converter
     * @return overridden method should return string converted to a hex string
     */
    String toHex(String s);
}
