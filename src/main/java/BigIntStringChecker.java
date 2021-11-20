public class BigIntStringChecker {
    public boolean checkString(String valueX, String valueY) {
        return valueX.matches("[0-9-]+") && valueY.matches("[0-9-]+");
    }

    public boolean checkString(String valueX) {
        return valueX.matches("[0-9-]+");
    }
}
