import javax.swing.*;
import java.awt.*;
import java.math.BigDecimal;
import java.math.BigInteger;

public class DecimalCalc extends JFrame implements DecimalBigIntConversion {
    @Override
    public BigInteger toBigInteger(String s) {
        return new BigInteger(s, 10);
    }

    @Override
    public String toDecimal(String s) {
        BigInteger big = new BigInteger(s);
        return big.toString(10);
    }

    @Override
    public BigDecimal toBigDecimal(String s) {
        return new BigDecimal(s);
    }

    // may not need
    @Override
    public String toDecimalString(String s) {
        return new BigDecimal(s).toString();
    }

    public DecimalCalc() {
        Operations op = new Operations();

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



        Addition.addActionListener(e -> Answer.setText(toDecimal(op.add(toBigInteger(valueX.getText()), toBigInteger(valueY.getText())).toString())));

        Subtraction.addActionListener(e -> Answer.setText(toDecimal(op.sub(toBigInteger(valueX.getText()), toBigInteger(valueY.getText())).toString())));

        Multiplication.addActionListener(e -> Answer.setText(toDecimal(op.mul(toBigInteger(valueX.getText()), toBigInteger(valueY.getText())).toString())));

        Division.addActionListener(e -> Answer.setText(toDecimalString(op.decimalDiv(toBigDecimal(valueX.getText()), toBigDecimal(valueY.getText())).toString())));

        Power.addActionListener(e -> Answer.setText(toDecimal(op.pow(toBigInteger(valueX.getText()), toBigInteger(valueY.getText())).toString())));

        squareRoot.addActionListener(e -> Answer.setText(toDecimalString(op.decimalRot(toBigDecimal(valueX.getText())).toString())));

        Squared.addActionListener(e -> Answer.setText(toDecimal(op.sqr(toBigInteger(valueX.getText())).toString())));

        Factorial.addActionListener(e -> Answer.setText(toDecimal(op.fac(toBigInteger(valueX.getText())).toString())));

        Modulus.addActionListener(e -> Answer.setText(toDecimal(op.MOD(toBigInteger(valueX.getText()), toBigInteger(valueY.getText())).toString())));

        greatestCommonDivisor.addActionListener(e -> Answer.setText(toDecimal(op.GCD(toBigInteger(valueX.getText()), toBigInteger(valueY.getText())).toString())));

        leastCommonMultiple.addActionListener(e -> Answer.setText(toDecimal(op.LCM(toBigInteger(valueX.getText()), toBigInteger(valueY.getText())).toString())));
    }
}
