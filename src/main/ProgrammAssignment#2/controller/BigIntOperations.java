package controller;

import model.Operations;
import java.math.BigInteger;

/**
 * Handles all the operations for {@link view.BinaryCalc}, {@link view.BigIntCalc}, {@link view.HexCalc}
 */
public class BigIntOperations extends Operations {
    /**
     * Takes to values passed and adds them
     * @param x first user input value
     * @param y second user input value
     * @return The sum of user values
     */
    public String add(BigInteger x, BigInteger y) {
        return x.add(y).toString();
    }

    /**\
     * Takes two values and subtracts them
     * @param x first user input value
     * @param y second user input value
     * @return The difference of the user values
     */
    public String sub(BigInteger x, BigInteger y) {
        return x.subtract(y).toString();
    }

    /**
     * Takes two user values and divides them
     * @param x first user input value
     * @param y second user input value
     * @return The quotient of the two user values
     */
    public String div(BigInteger x, BigInteger y) {
        //Catches divide by 0 error
        if(y.equals(BigInteger.ZERO)) {
           return "-1";
        } else {
            return x.divide(y).toString();
        }
    }

    /**
     * Takes two user values and multiplies them
     * @param x first user input value
     * @param y second user input value
     * @return returns the product of two user values
     */
    public String mul(BigInteger x, BigInteger y) {
        return x.multiply(y).toString();
    }

    /**
     * This code snippet comes from my group member Jasper Newkirk I got stuck
     * Cannot perform factorial on decimal numbers
     * @param x first user input
     * @return nothing as factorials can only be performed on integers so this would be an error
     */
    public String fac(BigInteger x) {
        BigInteger i = BigInteger.ONE;
        BigInteger product = x;
        while (i.compareTo(x) != 0) {
            product = product.multiply(i);
            i = i.add(BigInteger.ONE);
        }
        return product.toString();
    }

    /**
     * Takes two user values and outputs the power of one to the other
     * @param x first user input value
     * @param y second user input value
     * @return x to the power of y
     */
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

    /**
     * Takes a user input and finds the squared
     * @param x first user input
     * @return the square of the first user input
     */
    public String sqr(BigInteger x) {
        return x.pow(2).toString();
    }

    /**
     * Takes a user input and finds the square root
     * @param x first user input
     * @return the square root of the first user input
     */
    public String rot(BigInteger x) {
        return x.sqrt().toString();
    }

    /**
     * Finds the greatest common denominator of two numbers
     * @param x first user input
     * @param y second user input
     * @return the GCD of the two user inputs
     */
    public String GCD(BigInteger x, BigInteger y) {
        return x.gcd(y).toString();
    }

    /**
     * Finds the least common denominator of two numbers
     * @param x first user input
     * @param y second user input
     * @return the LCM of the two user inputs
     */
    public String LCM(BigInteger x, BigInteger y) {
        return x.multiply(y).divide(x.gcd(y)).toString();
    }

    /**
     * Takes two user input and finds reminder after division is performed
     * @param x first user input
     * @param y second user input
     * @return the remainder of two numbers after division
     */
    public String MOD(BigInteger x, BigInteger y) {
        return x.mod(y).toString();
    }
}
