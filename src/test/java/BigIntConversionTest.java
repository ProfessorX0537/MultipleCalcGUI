import java.math.BigInteger;
import java.util.Locale;

public class BigIntConversionTest {
    public static void main(String[] args) {
        String hexValue = "FFF";
        System.out.println("HexaDecimal Value :"+hexValue);
        BigInteger bigint = new BigInteger(hexValue ,16);
        System.out.println("Big Int Value :"+bigint);
        BigInteger s = new BigInteger("4");
        bigint = bigint.add(s);
        System.out.println("After Addition :"+bigint);
        String hexNewValue = bigint.toString(16);
        System.out.println("HexaDecimal Value after Addition :"+hexNewValue);

        System.out.println("simple conversion binary text");
        BigInteger mm = new BigInteger("17");
        String t = "17";
        BigInteger big = new BigInteger(t);
        System.out.println(big.toString(16));
    }
}
