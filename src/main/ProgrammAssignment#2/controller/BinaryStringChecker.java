package controller;

/**
 * Performs checks of on user input to make sure that it is a Binary string
 */
public class BinaryStringChecker {
    /**
     * checks if to user strings are binary values
     * @param valueX first user string passed
     * @param valueY second user string passed
     * @return returns whether it is a binary string
     */
    public boolean checkString(String valueX, String valueY) {
        return valueX.matches("[01-]+") && valueY.matches("[01-]+");
    }

    /**
     * checks if the first user string is a binary string
     * @param valueX first user string passed
     * @return returns whether it is a binary String
     */
    public boolean checkString(String valueX) {
        return valueX.matches("[01-]+");
    }
}
