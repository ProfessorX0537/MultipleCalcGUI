package view;

import org.w3c.dom.Text;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

/**
 * <h1>Multiple Calc w/GUI</h1>
 *This program supports four different calculators (Binary, Hexadecimal, Big Integer, Big Decimal)
 * and the following operations (Addition, Subtraction, Multiplication, Division, Power, Square Root,
 * Factorial, Modulus, Greatest Common Factor, Least Common Factorial).
 *
 * @author Xavier Hines
 * @version 1.0
 * @since 11/20/21
 */

public class MainWindow extends JFrame {
    /**
     * Create Instance variable of each calculator
     */
    private BinaryCalc BC = new BinaryCalc();
    private BigIntCalc BIC = new BigIntCalc();
    private HexCalc HC = new HexCalc();
    private DecimalCalc DC = new DecimalCalc();

    /**
     * View.MainWindow will establish the starting window of the program. It contains radio buttons
     * that will open new windows giving users access to the selected radio buttons calculator.
     * In addition to that there is a <code>JMenu</code> created her that will give the user the
     * ability to shut down the program and access the help/about windows.
     */
    public MainWindow() {
        JFrame startFrame = new JFrame();
        setSize(600, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel basePanel = new JPanel(new BorderLayout());
        basePanel.setBackground(Color.GRAY);
        basePanel.setVisible(true);

        add(basePanel);

        JPanel center = new JPanel();
        center.setBackground(Color.GRAY);
        JTextArea title = new JTextArea();
        title.setFont(title.getFont().deriveFont(18.0f));
        title.setBackground(Color.GRAY);
        title.setEditable(false);
        title.setText("Multiple Calculator Home Page");
        center.add(title);
        basePanel.add(center, BorderLayout.NORTH);

        var menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        var calculator = new JMenu("Exit");
        menuBar.add(calculator);

        var exitAction = new AbstractAction("Exit") {
            public void actionPerformed(ActionEvent event) {
                System.exit(0);
            }
        };
        JMenuItem exitItem = calculator.add(exitAction);

        var help = new JMenu("Help");
        menuBar.add(help);

        var helpAction = new AbstractAction("Help") {
            public void actionPerformed(ActionEvent event) {
                HelpWindow h = new HelpWindow();
                h.setVisible(true);
            }
        };
        JMenuItem helpItem = help.add(helpAction);


        var about = new JMenu("About");
        menuBar.add(about);

        var aboutAction = new AbstractAction("About") {
            public void actionPerformed(ActionEvent event) {
                AboutWindow a = new AboutWindow();
                a.setVisible(true);
            }
        };
        JMenuItem aboutItem = about.add(aboutAction);

        JRadioButton binaryCalcButton = new JRadioButton("Binary");
        binaryCalcButton.setMnemonic(KeyEvent.VK_B);
        binaryCalcButton.setBackground(Color.GRAY);


        JRadioButton hexCalcButton = new JRadioButton("Hexadecimal");
        hexCalcButton.setMnemonic(KeyEvent.VK_H);
        hexCalcButton.setBackground(Color.GRAY);

        JRadioButton bigIntegerCalcButton = new JRadioButton("Big Number");
        bigIntegerCalcButton.setMnemonic(KeyEvent.VK_I);
        bigIntegerCalcButton.setBackground(Color.GRAY);

        JRadioButton decimalCalcButton = new JRadioButton("Decimal");
        decimalCalcButton.setMnemonic(KeyEvent.VK_D);
        decimalCalcButton.setBackground(Color.GRAY);

        ButtonGroup group = new ButtonGroup();
        group.add(bigIntegerCalcButton);
        group.add(binaryCalcButton);
        group.add(hexCalcButton);
        group.add(decimalCalcButton);


        JPanel radioPanel = new JPanel();
        radioPanel.add(binaryCalcButton);
        radioPanel.add(hexCalcButton);
        radioPanel.add(bigIntegerCalcButton);
        radioPanel.add(decimalCalcButton);
        radioPanel.setVisible(true);
        radioPanel.setBackground(Color.GRAY);

        basePanel.add(radioPanel, BorderLayout.CENTER);

        binaryCalcButton.addActionListener(e -> {
            BIC.setVisible(false);
            DC.setVisible(false);
            HC.setVisible(false);
            BC.setVisible(true);
        });

        bigIntegerCalcButton.addActionListener(e -> {
            BIC.setVisible(true);
            DC.setVisible(false);
            HC.setVisible(false);
            BC.setVisible(false);
        });

        hexCalcButton.addActionListener(e -> {
            BIC.setVisible(false);
            DC.setVisible(false);
            HC.setVisible(true);
            BC.setVisible(false);
        });

        decimalCalcButton.addActionListener(e -> {
            BIC.setVisible(false);
            DC.setVisible(true);
            HC.setVisible(false);
            BC.setVisible(false);
        });

        setVisible(true);
    }
}
