package view;

import javax.swing.*;
import java.awt.*;

public class AboutWindow extends JFrame {
    /**
     * AboutWindow will be opened when help in menu from {@link MainWindow}
     * is selected. Will give user access to information about the program and the creator
     */
    public AboutWindow() {
        JFrame help = new JFrame();
        help.setTitle("Calculator Operation Help");
        setSize(550,200);
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

        JPanel helpPanel = new JPanel();
        helpPanel.setBackground(Color.ORANGE);
        add(helpPanel);
        JTextArea textBox = new JTextArea();
        textBox.setBackground(Color.ORANGE);
        textBox.setEditable(false);
        helpPanel.add(textBox);

        textBox.setText("""
                Hi,
                The goal of this program was to provide four types of calculators to a user in one
                easy to access space. The calculators offered are Binary, Hexadecimal, Big Integer, and
                Big Decimals. Important to note that if you wish to perform more accurate operations please
                use the Big decimal calc as it is the only one that will provide decimal values as an answer.
                Date: 11/20/21.
                Version: 1.0
                Author: Xavier Hines, currently a Junior in COMP SCI""");
        textBox.setVisible(true);
        helpPanel.setVisible(true);
    }
}
