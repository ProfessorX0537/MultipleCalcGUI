public class HexStringChecker {
    public boolean checkString(String valueX, String valueY) {
        return valueX.matches("[0-9a-fA-F-]+") && valueY.matches("[0-9a-fA-F-]+");
    }

    public boolean checkString(String valueX) {
        return valueX.matches("[0-9a-fA-F-]+");
    }
}
