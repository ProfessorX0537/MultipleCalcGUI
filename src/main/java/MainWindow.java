import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class MainWindow extends JFrame {
    private BinaryCalc BC = new BinaryCalc();
    private BigIntCalc BIC = new BigIntCalc();
    private HexCalc HC = new HexCalc();
    private DecimalCalc DC = new DecimalCalc();

    public MainWindow() {
        JFrame startFrame = new JFrame();
        setSize(800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel basePanel = new JPanel(new GridLayout(2,1));
        basePanel.setBackground(Color.GRAY);
        basePanel.setVisible(true);

        add(basePanel);

        JPanel center = new JPanel(new FlowLayout(FlowLayout.CENTER));
        center.setBackground(Color.GRAY);
        JTextArea title = new JTextArea();
        title.setFont(title.getFont().deriveFont(18.0f));
        title.setBackground(Color.GRAY);
        title.setEditable(false);
        title.setText("Multiple Calculator Home Page");
        center.add(title);
        basePanel.add(center);

        //TODO description of program put in menu
        // -1 value means that there was an error and user should visit help menu
//        JTextArea description = new JTextArea();
//        description.setBackground(Color.GRAY);
//        description.setEditable(false);
//        description.setLineWrap(true);
//        description.setSize(600, 100);
//        description.setText("This is a program that will give you access to four different types of calculators." +
//                " They are Hexadecimal, Binary, Decimal and BigInteger which all preform the provided operations" +
//                " in their respective forms. Selecting a calculator below will open up a new window with the respective Calculator.");


        //radio buttons for choice of calc
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

        basePanel.add(radioPanel);

        //Actionlisteners for radio buttons
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
