package view;

import controller.BigDecimalOperations;
import controller.BigDecimalStringChecker;
import model.DecimalBigIntConversion;

import javax.swing.*;
import java.awt.*;
import java.math.BigDecimal;

/**
 * Creates the GUI for the user to be able to work make calculations in BigDecimal
 */
public class DecimalCalc extends JFrame implements DecimalBigIntConversion {
    /**
     * Converts given string to a BigDecimal
     * @param s user string passed to be converted
     * @return returns the BigDecimal version of a passed string
     */
    @Override
    public BigDecimal toBigDecimal(String s) {
        return new BigDecimal(s);
    }

    /**
     * Cnverts a given BigDecimal to a string
     * @param s BigDecimal passed to be converged to a string
     * @return returns the String representation a BigDecimal
     */
    @Override
    public String toDecimalString(String s) {
        return new BigDecimal(s).toString();
    }

    private final static BigDecimalStringChecker bs = new BigDecimalStringChecker();
    private final static BigDecimalOperations op = new BigDecimalOperations();
    /**
     * Creates a window with the text fields for user input as well as an output field for
     * the users calculations. Provides a series of buttons which will perform the associated
     * operations on the given decimal values. It also will handle a series of potential user input errors.
     */
    public DecimalCalc() {


        JFrame DecimalCalc = new JFrame();
        setSize(800, 200);
        setTitle("Decimal Calculator");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        JPanel basePanel = new JPanel();
        basePanel.setBackground(Color.GRAY);
        basePanel.setVisible(true);
        add(basePanel);

        JTextField valueX = new JTextField();
        valueX.setColumns(50);
        basePanel.add(valueX);

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
        JButton Modulus = new JButton("MOD");

        buttonPanel.add(Addition);
        buttonPanel.add(Subtraction);
        buttonPanel.add(Multiplication);
        buttonPanel.add(Division);
        buttonPanel.add(Power);
        buttonPanel.add(squareRoot);
        buttonPanel.add(Squared);
        buttonPanel.add(Modulus);




        Addition.addActionListener(e -> {
            if(bs.checkString(valueX.getText(), valueY.getText())) {
                Answer.setText(toDecimalString(op.add(toBigDecimal(valueX.getText()), toBigDecimal(valueY.getText()))));
            } else {
                Answer.setText("Error must be decimal string");
            }
        });

        Subtraction.addActionListener(e -> {
            if(bs.checkString(valueX.getText(), valueY.getText())) {
                Answer.setText(toDecimalString(op.sub(toBigDecimal(valueX.getText()), toBigDecimal(valueY.getText()))));
            } else {
                Answer.setText("Error must be decimal string");
            }
        });

        Multiplication.addActionListener(e -> {
            if(bs.checkString(valueX.getText(), valueY.getText())) {
                Answer.setText(toDecimalString(op.mul(toBigDecimal(valueX.getText()), toBigDecimal(valueY.getText()))));
            } else {
                Answer.setText("Error must be decimal string");
            }
        });

        Division.addActionListener(e -> {
            if(bs.checkString(valueX.getText(), valueY.getText())) {
                Answer.setText(toDecimalString(op.div(toBigDecimal(valueX.getText()), toBigDecimal(valueY.getText()))));
            } else {
                Answer.setText("Error must be decimal string");
            }
        });

        //Credit for concurrency thread idea goes to Farzin Zaker on StackOverflow.com
        Power.addActionListener(e -> {
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    if(bs.checkString(valueX.getText(), valueY.getText())) {
                        Answer.setText(op.pow(toBigDecimal(valueX.getText()), toBigDecimal(valueY.getText())));
                    } else {
                        Answer.setText("Error must enter decimal string");
                    }
                }
            });
            thread.start();
            long endAfterTime = System.currentTimeMillis() + 2000;
            while(thread.isAlive()) {
                if(System.currentTimeMillis() > endAfterTime) {
                    Answer.setText("Number too long");
                    break;
                }
                try {
                    Thread.sleep(500);
                } catch(InterruptedException t) {}
            }
        });

        squareRoot.addActionListener(e -> {
            if(bs.checkString(valueX.getText())) {
                Answer.setText(toDecimalString(op.rot(toBigDecimal(valueX.getText()))));
            } else {
                Answer.setText("Error must be decimal string");
            }
        });

        Squared.addActionListener(e -> {
            if(bs.checkString(valueX.getText())) {
                Answer.setText(toDecimalString(op.sqr(toBigDecimal(valueX.getText()))));
            } else {
                Answer.setText("Error must be decimal string");
            }
        });

        Modulus.addActionListener(e -> {
            if(bs.checkString(valueX.getText(), valueY.getText())) {
                Answer.setText(toDecimalString(op.MOD(toBigDecimal(valueX.getText()), toBigDecimal(valueY.getText()))));
            } else {
                Answer.setText("Error must be decimal string");
            }
        });
    }
}
