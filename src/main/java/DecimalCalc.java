import javax.swing.*;
import java.math.BigInteger;

public class DecimalCalc extends JFrame implements DecimalBigIntConversion {
    @Override
    public BigInteger toBigInteger() {
        return null;
    }

    @Override
    public String toDecimal() {
        return null;
    }

    public DecimalCalc() {
        Operations op = new Operations();

        JFrame DecimalCalc = new JFrame();
        setSize(400, 400);
        setTitle("Decimal Calculator");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        setVisible(true);
    }
}
