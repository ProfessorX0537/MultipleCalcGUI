import java.math.BigInteger;

public class BigIntOperations extends Operations {
    /**
     *TODO also check for runtime, if runs to long terminate
     */
    public String add(BigInteger x, BigInteger y) {
        return x.add(y).toString();
    }

    public String sub(BigInteger x, BigInteger y) {
        return x.subtract(y).toString();
    }

    public String div(BigInteger x, BigInteger y) {
        //Catches divide by 0 error
        if(y.equals(BigInteger.ZERO)) {
           return "-1";
        } else {
            return x.divide(y).toString();
        }
    }

    public String mul(BigInteger x, BigInteger y) {
        return x.multiply(y).toString();
    }

    // This code snippet comes from my group member Jasper Newkirk I got stuck
    public String fac(BigInteger x) {
        BigInteger i = BigInteger.ONE;
        BigInteger product = x;
        while (i.compareTo(x) != 0) {
            product = product.multiply(i);
            i = i.add(BigInteger.ONE);
        }
        return product.toString();
    }

    public String pow(BigInteger x, BigInteger y) {
        //Catches error if pow of y = 0
        if (y.equals(BigInteger.ZERO)) {
            return "1";
        } else if (x.equals(BigInteger.ZERO) && y.equals(BigInteger.ZERO)) {
            return "0";
        } else {
            BigInteger count = BigInteger.ONE;
            BigInteger output = x;
            while(count.compareTo(y) != 0) {
                output = output.multiply(x);
                count = count.add(BigInteger.ONE);
            }
            return output.toString();
        }
    }

    public String sqr(BigInteger x) {
        return x.pow(2).toString();
    }

    public String rot(BigInteger x) {
        return x.sqrt().toString();
    }

    //Greatest Common Divisor
    public String GCD(BigInteger x, BigInteger y) {
        return x.gcd(y).toString();
    }

    //lowest possible number tha can be divisible by both numbers
    public String LCM(BigInteger x, BigInteger y) {
        return x.multiply(y).divide(x.gcd(y)).toString();
    }

    public String MOD(BigInteger x, BigInteger y) {
        return x.mod(y).toString();
    }
}
