import javax.swing.*;
import java.math.BigInteger;

public class BinaryCalc extends JFrame implements BinaryBigIntConversion {
    @Override
    public BigInteger toBigInteger() {
        return null;
    }

    @Override
    public String toBinary() {
        return null;
    }

    public BinaryCalc() {
        Operations op = new Operations();

        JFrame BinaryCalc = new JFrame();
        setSize(400, 400);
        setTitle("Binary Calculator");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        setVisible(true);
    }
}
