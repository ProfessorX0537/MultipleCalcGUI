import javax.swing.*;
import java.awt.*;
import java.math.BigInteger;

public class DecimalCalc extends JFrame implements DecimalBigIntConversion {
    @Override
    public BigInteger toBigInteger(String s) {
        return new BigInteger(s, 10);
    }

    @Override
    public String toDecimal(String s) {
        BigInteger big = new BigInteger(s);
        return big.toString(10);
    }

    public DecimalCalc() {
        Operations op = new Operations();

        JFrame DecimalCalc = new JFrame();
        setSize(400, 400);
        setTitle("Decimal Calculator");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        JPanel basePanel = new JPanel();
        basePanel.setBackground(Color.GRAY);
        basePanel.setVisible(true);
        add(basePanel);

        //setVisible(true);
    }
}
