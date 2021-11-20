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
        BigIntStringChecker bs = new BigIntStringChecker();

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

        Addition.addActionListener(e -> {
            if(bs.checkString(valueX.getText(), valueY.getText())) {
                Answer.setText(op.add(toBigInteger(valueX.getText()), toBigInteger(valueY.getText())));
            } else {
                Answer.setText("Must enter integer String");
            }
        });

        Subtraction.addActionListener(e -> {
            if(bs.checkString(valueX.getText(), valueY.getText())) {
                Answer.setText(op.sub(toBigInteger(valueX.getText()), toBigInteger(valueY.getText())));
            } else {
                Answer.setText("Must enter integer String");
            }
        });

        Multiplication.addActionListener(e -> {
            if(bs.checkString(valueX.getText(), valueY.getText())) {
                Answer.setText(op.mul(toBigInteger(valueX.getText()), toBigInteger(valueY.getText())));
            } else {
                Answer.setText("Must enter integer String");
            }
        });

        Division.addActionListener(e -> {
            if(bs.checkString(valueX.getText(), valueY.getText())) {
                Answer.setText(op.div(toBigInteger(valueX.getText()), toBigInteger(valueY.getText())));
            } else {
                Answer.setText("Must enter integer String");
            }
        });

        Power.addActionListener(e -> {
            if(bs.checkString(valueX.getText(), valueY.getText())) {
                Answer.setText(op.pow(toBigInteger(valueX.getText()), toBigInteger(valueY.getText())));
            } else {
                Answer.setText("Must enter integer String");
            }
        });

        squareRoot.addActionListener(e -> {
            if(bs.checkString(valueX.getText())) {
                Answer.setText(op.rot(toBigInteger(valueX.getText())));
            } else {
                Answer.setText("Must enter integer String");
            }
        });

        Squared.addActionListener(e -> {
            if(bs.checkString(valueX.getText())) {
                Answer.setText(op.sqr(toBigInteger(valueX.getText())));
            } else {
                Answer.setText("Must enter integer String");
            }
        });

        Factorial.addActionListener(e -> {
            if(bs.checkString(valueX.getText())) {
                Answer.setText(op.fac(toBigInteger(valueX.getText())));
            } else {
                Answer.setText("Must enter integer String");
            }
        });

        Modulus.addActionListener(e -> {
            if(bs.checkString(valueX.getText(), valueY.getText())) {
                Answer.setText(op.MOD(toBigInteger(valueX.getText()), toBigInteger(valueY.getText())));
            } else {
                Answer.setText("Must enter integer String");
            }
        });

        greatestCommonDivisor.addActionListener(e -> {
            if(bs.checkString(valueX.getText(), valueY.getText())) {
                Answer.setText(op.GCD(toBigInteger(valueX.getText()), toBigInteger(valueY.getText())));
            } else {
                Answer.setText("Must enter integer String");
            }
        });

        leastCommonMultiple.addActionListener(e -> {
            if(bs.checkString(valueX.getText(), valueY.getText())) {
                Answer.setText(op.LCM(toBigInteger(valueX.getText()), toBigInteger(valueY.getText())));
            } else {
                Answer.setText("Must enter integer String");
            }
        });
    }
}
