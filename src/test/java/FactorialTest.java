import java.math.BigInteger;

public class FactorialTest {
    public static void main(String[] args) {
        BigInteger num = new BigInteger("10000");
        System.out.println(fac(num));
    }
    public static BigInteger fac(BigInteger x) {
        BigInteger i = BigInteger.ONE;
        BigInteger product = x;
        while (i.compareTo(x) != 0) {
            product = product.multiply(i);
            i = i.add(BigInteger.ONE);
        }
        return product;
    }
}
