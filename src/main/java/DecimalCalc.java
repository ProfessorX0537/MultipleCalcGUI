import javax.swing.*;
import java.awt.*;
import java.math.BigDecimal;

public class DecimalCalc extends JFrame implements DecimalBigIntConversion {
    @Override
    public BigDecimal toBigDecimal(String s) {
        return new BigDecimal(s);
    }

    @Override
    public String toDecimalString(String s) {
        return new BigDecimal(s).toString();
    }

    public DecimalCalc() {
        BigDecimalOperations op = new BigDecimalOperations();

        JFrame DecimalCalc = new JFrame();
        setSize(800, 200);
        setTitle("Decimal Calculator");
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

        //needs label decimal precision is 20
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



        Addition.addActionListener(e -> Answer.setText(toDecimalString(op.add(toBigDecimal(valueX.getText()), toBigDecimal(valueY.getText())))));

        Subtraction.addActionListener(e -> Answer.setText(toDecimalString(op.sub(toBigDecimal(valueX.getText()), toBigDecimal(valueY.getText())))));

        Multiplication.addActionListener(e -> Answer.setText(toDecimalString(op.mul(toBigDecimal(valueX.getText()), toBigDecimal(valueY.getText())))));

        Division.addActionListener(e -> Answer.setText(toDecimalString(op.div(toBigDecimal(valueX.getText()), toBigDecimal(valueY.getText())))));

        Power.addActionListener(e -> Answer.setText(toDecimalString(op.pow(toBigDecimal(valueX.getText()), toBigDecimal(valueY.getText())))));

        squareRoot.addActionListener(e -> Answer.setText(toDecimalString(op.rot(toBigDecimal(valueX.getText())))));

        Squared.addActionListener(e -> Answer.setText(toDecimalString(op.sqr(toBigDecimal(valueX.getText())))));

        Factorial.addActionListener(e -> Answer.setText(toDecimalString(op.fac(toBigDecimal(valueX.getText())))));

        Modulus.addActionListener(e -> Answer.setText(toDecimalString(op.MOD(toBigDecimal(valueX.getText()), toBigDecimal(valueY.getText())))));

        //Least Common Divisor can only be performed on Integers

        //Greatest Common Divisor can only be performed on Integers
    }
}
