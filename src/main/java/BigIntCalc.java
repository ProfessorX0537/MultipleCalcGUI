import javax.swing.*;
import java.awt.*;

public class BigIntCalc extends JFrame {
    public BigIntCalc() {
        Operations op = new Operations();

        JFrame BigIntCalc = new JFrame();
        setSize(400, 400);
        setTitle("Big Integer Calculator");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        JPanel basePanel = new JPanel();
        basePanel.setBackground(Color.GRAY);
        basePanel.setVisible(true);
        add(basePanel);

        //setVisible(true);
    }
}
