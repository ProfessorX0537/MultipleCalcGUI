import javax.swing.*;
import java.awt.*;
import java.math.BigInteger;

public class BigIntCalc extends JFrame implements ToBigInteger {

    @Override
    public BigInteger toBigInteger(String s) {
        return new BigInteger(s);
    }

    public BigIntCalc() {
        BigIntOperations op = new BigIntOperations();

        JFrame BigIntCalc = new JFrame();
        setSize(800, 200);
        setTitle("Big Integer Calculator");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        JPanel basePanel = new JPanel();
        basePanel.setBackground(Color.GRAY);
        basePanel.setVisible(true);
        add(basePanel);

        //needs label
        JTextField valueX = new JTextField();
        valueX.setColumns(50);
        basePanel.add(valueX);

        //needs label
        JTextField valueY = new JTextField();
        valueY.setColumns(50);
        basePanel.add(valueY);

        //needs label
        JTextField Answer = new JTextField();
        Answer.setColumns(50);
        basePanel.add(Answer);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setVisible(true);
        buttonPanel.setBackground(Color.GRAY);
        basePanel.add(buttonPanel);

        JButton Addition = new JButton("X + Y");
        JButton Subtraction = new JButton("X - Y");
        JButton Multiplication = new JButton("X * Y");
        JButton Division = new JButton("X / Y");
        JButton Power = new JButton("X ^ Y");
        JButton squareRoot= new JButton("\u221AX");
        JButton Squared = new JButton("X ^ 2");
        JButton Factorial = new JButton("X!");
        JButton Modulus = new JButton("MOD");
        JButton greatestCommonDivisor = new JButton("GCD");
        JButton leastCommonMultiple = new JButton("LCM");

        buttonPanel.add(Addition);
        buttonPanel.add(Subtraction);
        buttonPanel.add(Multiplication);
        buttonPanel.add(Division);
        buttonPanel.add(Power);
        buttonPanel.add(squareRoot);
        buttonPanel.add(Squared);
        buttonPanel.add(Factorial);
        buttonPanel.add(Modulus);
        buttonPanel.add(greatestCommonDivisor);
        buttonPanel.add(leastCommonMultiple);

        Addition.addActionListener(e -> Answer.setText(op.add(toBigInteger(valueX.getText()), toBigInteger(valueY.getText()))));

        Subtraction.addActionListener(e -> Answer.setText(op.sub(toBigInteger(valueX.getText()), toBigInteger(valueY.getText()))));

        Multiplication.addActionListener(e -> Answer.setText(op.mul(toBigInteger(valueX.getText()), toBigInteger(valueY.getText()))));

        Division.addActionListener(e -> Answer.setText(op.div(toBigInteger(valueX.getText()), toBigInteger(valueY.getText()))));

        Power.addActionListener(e -> Answer.setText(op.pow(toBigInteger(valueX.getText()), toBigInteger(valueY.getText()))));

        squareRoot.addActionListener(e -> Answer.setText(op.rot(toBigInteger(valueX.getText()))));

        Squared.addActionListener(e -> Answer.setText(op.sqr(toBigInteger(valueX.getText()))));

        Factorial.addActionListener(e -> Answer.setText(op.fac(toBigInteger(valueX.getText()))));

        Modulus.addActionListener(e -> Answer.setText(op.MOD(toBigInteger(valueX.getText()), toBigInteger(valueY.getText()))));

        greatestCommonDivisor.addActionListener(e -> Answer.setText(op.GCD(toBigInteger(valueX.getText()), toBigInteger(valueY.getText()))));

        leastCommonMultiple.addActionListener(e -> Answer.setText(op.LCM(toBigInteger(valueX.getText()), toBigInteger(valueY.getText()))));
    }
}
