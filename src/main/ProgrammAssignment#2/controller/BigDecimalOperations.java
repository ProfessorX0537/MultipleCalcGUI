package controller;


import model.Operations;
import java.math.BigDecimal;
import java.math.MathContext;

/**
 * Handles all the operations for {@link view.DecimalCalc}
 */
public class BigDecimalOperations extends Operations {
    final static MathContext rnd = new MathContext(20);

    /**
     * Takes to values passed and adds them
     * @param x first user input value
     * @param y second user input value
     * @return The sum of user values
     */
    public String add(BigDecimal x, BigDecimal y) {
        return x.add(y).round(rnd).toString();
    }

    /**\
     * Takes two values and subtracts them
     * @param x first user input value
     * @param y second user input value
     * @return The difference of the user values
     */
    public String sub(BigDecimal x, BigDecimal y) {
        return x.subtract(y).round(rnd).toString();
    }

    /**
     * Takes two user values and divides them
     * @param x first user input value
     * @param y second user input value
     * @return The quotient of the two user values
     */
    public String div(BigDecimal x, BigDecimal y) {
        //Catches divide by 0 error
        if (y.equals(BigDecimal.ZERO)) {
            return "-1";
        } else {
            return x.divide(y, rnd).toString();
        }
    }

    /**
     * Takes two user values and multiplies them
     * @param x first user input value
     * @param y second user input value
     * @return returns the product of two user values
     */
    public String mul(BigDecimal x, BigDecimal y) {
        return x.multiply(y).round(rnd).toString();
    }

    /**
     * Cannot perform factorial on decimal numbers
     * @param x first user input
     * @return nothing as factorials can only be performed on integers so this would be an error
     */
    public String fac(BigDecimal x) {
        return null;
    }


    /**
     * Takes two user values and outputs the power of one to the other
     * @param x first user input value
     * @param y second user input value
     * @return x to the power of y
     */
    public String pow(BigDecimal x, BigDecimal y) {
        //Catches error if pow of y = 0
        if (y.equals(BigDecimal.ZERO)) {
            return "1";
        } else if (x.equals(BigDecimal.ZERO) && y.equals(BigDecimal.ZERO)) {
            return "0";
        } else if(y.toString().contains(".")) {
            return "-1";
        } else {
                BigDecimal count = BigDecimal.ONE;
                BigDecimal output = x;
                while (count.compareTo(y) != 0) {
                    output = output.multiply(x);
                    count = count.add(BigDecimal.ONE);
                }
                return output.round(rnd).toString();
            }
        }

    /**
     * Takes a user input and finds the squared
     * @param x first user input
     * @return the square of the first user input
     */
    public String sqr(BigDecimal x) {
        return x.pow(2, rnd).toString();
    }

    /**
     * Takes a user input and finds the square root
     * @param x first user input
     * @return the square root of the first user input
     */
    public String rot(BigDecimal x) {
        return x.sqrt(rnd).toString();
    }

    /**
     * Can only be performed on integers
     * @param x first user input
     * @param y second user input
     * @return nothing decimals are not integers so operation isn't possible
     */
    public String GCD(BigDecimal x, BigDecimal y) {
        return null;
    }

    /**
     * Can only be performed on integers
     * @param x nothing
     * @param y nothing
     * @return nothing decimals are not integers so operation isn't possible
     */
    public String LCM(BigDecimal x, BigDecimal y) {
        return null;
    }

    /**
     * Takes two user input and finds reminder after division is performed
     * @param x first user input
     * @param y second user input
     * @return the remainder of two decimal numbers after division
     */
    public String MOD(BigDecimal x, BigDecimal y) {
        if (y.equals(BigDecimal.ZERO)) {
            return "-1";
        } else {
            return x.remainder(y).round(rnd).toString();
        }
    }
}
