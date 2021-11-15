import javax.swing.*;
import java.awt.*;
import java.math.BigInteger;

public class HexCalc extends JFrame implements HexBigIntConversion {
    @Override
    public BigInteger toBigInteger(String s) {
        return new BigInteger(s, 16);
    }

    @Override
    public String toHex(String s) {
        BigInteger big = new BigInteger(s);
        return big.toString(16);
    }

    public HexCalc() {
        Operations op = new Operations();

        JFrame HexCalc = new JFrame();
        setSize(400, 400);
        setTitle("Hexadecimal Calculator");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        //TODO Us long text bar with scroll bar for long boi numbers

        JPanel basePanel = new JPanel();
        basePanel.setBackground(Color.GRAY);
        basePanel.setVisible(true);
        add(basePanel);

        setVisible(true);
    }
}
