import javax.swing.*;
import java.awt.*;

public class HelpWindow extends JFrame {
    /**
     * helpWindow will be opened when help in menu from {@link MainWindow}
     * is selected. Will give user access to information intended to help them if
     * they become confused while using the program.
     */
    public HelpWindow() {
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

        textBox.setText("this is the help window");
        textBox.setVisible(true);
        helpPanel.setVisible(true);
    }
}
