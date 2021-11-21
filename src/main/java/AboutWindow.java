import javax.swing.*;
import java.awt.*;

public class AboutWindow extends JFrame {
    public AboutWindow() {
        JFrame help = new JFrame();
        help.setTitle("Calculator Operation Help");
        setSize(250,200);
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

        JPanel helpPanel = new JPanel();
        helpPanel.setBackground(Color.ORANGE);
        add(helpPanel);
        JTextArea textBox = new JTextArea();
        textBox.setBackground(Color.ORANGE);
        textBox.setEditable(false);
        helpPanel.add(textBox);

        textBox.setText("this is the about window");
        textBox.setVisible(true);
        helpPanel.setVisible(true);
    }
}
