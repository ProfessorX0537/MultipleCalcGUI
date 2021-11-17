import java.math.BigDecimal;
import java.math.MathContext;

public class BigDecimalConversionTest {
    public static void main(String[] args) {
        String decimalValue = "1";
        BigDecimal dec = new BigDecimal(decimalValue);

        BigDecimal dec2 = new BigDecimal("3");

        System.out.println(dec.divide(dec2, new MathContext(20)));

    }
}
