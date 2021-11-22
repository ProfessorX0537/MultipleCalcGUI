package controller;

/**
 * Checks to make sure values input by user are decimal values
 */
public class BigDecimalStringChecker {
    /**
     * check if string is a decimal string
     * @param valueX first user input
     * @param valueY second user input
     * @return whether the strings are decimal string
     */
    public boolean checkString(String valueX, String valueY) {
        return valueX.matches("[0-9.]+") && valueY.matches("[0-9.]+");
    }

    /**
     * checks if a single user string is a decimal string
     * @param valueX first user input
     * @return whether the string is a decimal string
     */
    public boolean checkString(String valueX) {
        return valueX.matches("[0-9.]+");
    }
}
