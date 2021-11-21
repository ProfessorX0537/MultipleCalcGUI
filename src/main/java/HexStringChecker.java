public class HexStringChecker {
    /**
     * Checks user input to make sure it is within the type of the calculator they selected
     * @param valueX String taken form the first user input
     * @param valueY String taken from the second user input
     * @return boolean value if string falls with in constraints or not
     */
    public boolean checkString(String valueX, String valueY) {
        return valueX.matches("[0-9a-fA-F-]+") && valueY.matches("[0-9a-fA-F-]+");
    }

    /**
     * Checks user input to make sure it is within the data type for a single input
     * @param valueX String taken from the first user input
     * @return boolean value of whether it is within the
     */
    public boolean checkString(String valueX) {
        return valueX.matches("[0-9a-fA-F-]+");
    }
}
