import java.math.BigInteger;

public class GCDLCDtest {
    public static void main(String[] args) {
        BigInteger n1 = new BigInteger("14");
        BigInteger n2 = new BigInteger("38");

        System.out.println(LCM(n1, n2));
    }

    public static BigInteger LCM(BigInteger x, BigInteger y) {
        return x.multiply(y).divide(GCD(x,y));
    }

    public static BigInteger GCD(BigInteger x, BigInteger y) {
        return x.gcd(y);
    }
}
