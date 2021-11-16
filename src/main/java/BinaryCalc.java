import javax.swing.*;
import java.awt.*;
import java.math.BigInteger;

public class BinaryCalc extends JFrame implements BinaryBigIntConversion {
    @Override
    public BigInteger toBigInteger(String s) {
        return new BigInteger(s, 2);
    }

    @Override
    public String toBinary(String s) {
        BigInteger big = new BigInteger(s);
        return big.toString(2);
    }

    public BinaryCalc() {
        Operations op = new Operations();

        JFrame BinaryCalc = new JFrame();
        setSize(400, 400);
        setTitle("Binary Calculator");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        JPanel basePanel = new JPanel();
        basePanel.setBackground(Color.GRAY);
        basePanel.setVisible(true);
        add(basePanel);

        //setVisible(true);
    }
}
