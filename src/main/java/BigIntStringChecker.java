/**
 * Checks user input to make sure that they are BigIneger strings
 */
public class BigIntStringChecker {
    /**
     * Takes to user strings and checks if they are BigInteger strings
     * @param valueX first user input
     * @param valueY second user input
     * @return whether the strings were BigInteger strings
     */
    public boolean checkString(String valueX, String valueY) {
        return valueX.matches("[0-9-]+") && valueY.matches("[0-9-]+");
    }

    /**
     * takes a single user string and checks if it si a bigIntger string
     * @param valueX first user input
     * @return whether the string was a BigInteger string
     */
    public boolean checkString(String valueX) {
        return valueX.matches("[0-9-]+");
    }
}
