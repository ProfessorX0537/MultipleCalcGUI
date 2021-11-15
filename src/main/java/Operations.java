import java.math.BigInteger;

public class Operations {
    /**
     *TODO makes sure to put Try catch for error handling in each methods
     */
    public BigInteger add(BigInteger x, BigInteger y) {
        return x.add(y);
    }



    public BigInteger sub(BigInteger x, BigInteger y) {
        return x.subtract(y);
    }

    public BigInteger div(BigInteger x, BigInteger y) {
        return x.divide(y);
    }

    public BigInteger mul(BigInteger x, BigInteger y) {
        return x.multiply(y);
    }

    // This code snippet comes from my group member Jasper Newkirk I got stuck
    public BigInteger fac(BigInteger x) {
        BigInteger i = BigInteger.ONE;
        BigInteger product = x;
        while (i.compareTo(x) != 0) {
            product = product.multiply(i);
            i = i.add(BigInteger.ONE);
        }
        return product;
    }

    public BigInteger pow(BigInteger x, BigInteger y) {
        BigInteger count = BigInteger.ONE;
        BigInteger output = x;
        while(count.compareTo(y) != 0) {
            output = output.multiply(x);
            count = count.add(BigInteger.ONE);
        }
        return output;
    }

    public BigInteger sqr(BigInteger x) {
        return x.pow(2);
    }

    public BigInteger rot(BigInteger x) {
        return x.sqrt();
    }

    //Greatest Common Divisor
    public BigInteger GCD(BigInteger x, BigInteger y) {
        return x.gcd(y);
    }

    //lowest possible number tha can be divisible by both numbers
    public BigInteger LCM(BigInteger x, BigInteger y) {
        return x.multiply(y).divide(GCD(x,y));
    }

    public BigInteger MOD(BigInteger x, BigInteger y) {
        return x.mod(y);
    }
}
