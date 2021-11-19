import java.math.BigDecimal;
import java.math.MathContext;

public class BigDecimalOperations extends Operations {
    MathContext rnd = new MathContext(20);
    /**
     *TODO makes sure to put Try catch for error handling in each methods
     *TODO also check for runtime, if runs to long terminate
     */
    public String add(BigDecimal x, BigDecimal y) {
        return x.add(y).round(rnd).toString();
    }

    public String sub(BigDecimal x, BigDecimal y) { return x.subtract(y).round(rnd).toString(); }

    public String div(BigDecimal x, BigDecimal y) { return x.divide(y, rnd).toString(); }

    public String mul(BigDecimal x, BigDecimal y) {
        return x.multiply(y).round(rnd).toString();
    }

    // This code snippet comes from my group member Jasper Newkirk I got stuck
    public String fac(BigDecimal x) {
        BigDecimal i = BigDecimal.ONE;
        BigDecimal product = x;
        while (i.compareTo(x) != 0) {
            product = product.multiply(i);
            i = i.add(BigDecimal.ONE);
        }
        return product.round(rnd).toString();
    }

    public String pow(BigDecimal x, BigDecimal y) {
        BigDecimal count = BigDecimal.ONE;
        BigDecimal output = x;
        while(count.compareTo(y) != 0) {
            output = output.multiply(x);
            count = count.add(BigDecimal.ONE);
        }
        return output.round(rnd).toString();
    }

    public String sqr(BigDecimal x) {
        return x.pow(2, rnd).toString();
    }

    public String rot(BigDecimal x) {
        return x.sqrt(rnd).toString();
    }

    //These operations can only be performed with Integers
    public String GCD(BigDecimal x, BigDecimal y) {
        return null;
    }

    //These operations can only be performed with Integers
    public String LCM(BigDecimal x, BigDecimal y) {
        return null;
    }

    public String MOD(BigDecimal x, BigDecimal y) {
        return x.remainder(y).round(rnd).toString();
    }
}
