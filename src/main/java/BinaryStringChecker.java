public class BinaryStringChecker {
    public boolean checkString(String valueX, String valueY) {
        return valueX.matches("[01-]+") && valueY.matches("[01-]+");
    }

    public boolean checkString(String valueX) {
        return valueX.matches("[01-]+");
    }
}
