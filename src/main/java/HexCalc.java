import javax.swing.*;
import java.math.BigInteger;

public class HexCalc extends JFrame implements HexBigIntConversion {
    @Override
    public BigInteger toBigInteger() {
        return null;
    }

    @Override
    public String toHex() {
        return null;
    }

    public HexCalc() {
        Operations op = new Operations();

        JFrame HexCalc = new JFrame();
        setSize(400, 400);
        setTitle("Hexadecimal Calculator");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        //TODO use Line wrapping for ouput text box, will show BIG numbers

        setVisible(true);
    }
}
