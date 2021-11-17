import java.math.BigDecimal;
import java.math.MathContext;

public class BigDecimalOperations extends Operations {
    MathContext rnd = new MathContext(20);
    /**
     *TODO makes sure to put Try catch for error handling in each methods
     *TODO also check for runtime, if runs to long terminate
     */
    public BigDecimal add(BigDecimal x, BigDecimal y) {
        return x.add(y).round(rnd);
    }

    public BigDecimal sub(BigDecimal x, BigDecimal y) { return x.subtract(y).round(rnd); }

    public BigDecimal div(BigDecimal x, BigDecimal y) { return x.divide(y, rnd); }

    public BigDecimal mul(BigDecimal x, BigDecimal y) {
        return x.multiply(y).round(rnd);
    }

    // This code snippet comes from my group member Jasper Newkirk I got stuck
    public BigDecimal fac(BigDecimal x) {
        BigDecimal i = BigDecimal.ONE;
        BigDecimal product = x;
        while (i.compareTo(x) != 0) {
            product = product.multiply(i);
            i = i.add(BigDecimal.ONE);
        }
        return product.round(rnd);
    }

    public BigDecimal pow(BigDecimal x, BigDecimal y) {
        BigDecimal count = BigDecimal.ONE;
        BigDecimal output = x;
        while(count.compareTo(y) != 0) {
            output = output.multiply(x);
            count = count.add(BigDecimal.ONE);
        }
        return output.round(rnd);
    }

    public BigDecimal sqr(BigDecimal x) {
        return x.pow(2, rnd);
    }

    public BigDecimal rot(BigDecimal x) {
        return x.sqrt(rnd);
    }

    //Greatest Common Divisor
    //Euclidean Algorithm
    public BigDecimal GCD(BigDecimal x, BigDecimal y) {
        // TODO Use euclidean Algorithm
        return null;
    }

    //lowest possible number tha can be divisible by both numbers
    public BigDecimal LCM(BigDecimal x, BigDecimal y) {
        return x.multiply(y).divide(GCD(x,y), rnd);
    }

    public BigDecimal MOD(BigDecimal x, BigDecimal y) {
        return x.remainder(y).round(rnd);
    }
}
