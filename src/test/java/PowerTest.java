import java.math.BigInteger;

public class PowerTest {
    public static void main(String[] args) {
        BigInteger n1 = new BigInteger("3");
        BigInteger n2 = new BigInteger("2");

        System.out.println(pow(n2, n1));
    }
    public static BigInteger pow(BigInteger x, BigInteger y) {
        BigInteger count = BigInteger.ONE;
        BigInteger output = x;
        while(count.compareTo(y) != 0) {
            output = output.multiply(x);
            count = count.add(BigInteger.ONE);
        }
        return output;
    }

}
