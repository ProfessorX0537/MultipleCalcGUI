package view;

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
        setSize(500,200);
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

        JPanel helpPanel = new JPanel();
        helpPanel.setBackground(Color.ORANGE);
        add(helpPanel);
        JTextArea textBox = new JTextArea();
        textBox.setBackground(Color.ORANGE);
        textBox.setEditable(false);
        helpPanel.add(textBox);

        textBox.setText("""
                If you receive a '-1' on an operation you likely attempted to perform an illegal math
                operation. If the answer to your operation takes longer than 2 seconds to\s
                complete program will return that solution was too large. You will also receive
                error message if you attempt to input unacceptable string types. If you get any
                 notifications please closely evaluate your inputs to make sure they follow calc
                and arithmetical guidelines.
                Best,
                Author: Xavier Hines""");

        textBox.setVisible(true);
        helpPanel.setVisible(true);
    }
}
