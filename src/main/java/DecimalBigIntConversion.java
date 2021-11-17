import java.math.BigDecimal;

public interface DecimalBigIntConversion extends ToBigInteger {
    String toDecimal(String s);

    BigDecimal toBigDecimal(String s);

    String toDecimalString(String s);
}
