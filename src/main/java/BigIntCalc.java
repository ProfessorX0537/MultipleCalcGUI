import javax.swing.*;

public class BigIntCalc extends JFrame {
    public BigIntCalc() {
        Operations op = new Operations();

        JFrame BigIntCalc = new JFrame();
        setSize(400, 400);
        setTitle("Big Integer Calculator");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        setVisible(true);
    }
}
