package view;

import controller.BigIntOperations;
import controller.HexStringChecker;
import model.HexBigIntConversion;
import model.ToBigInteger;

import javax.swing.*;
import java.awt.*;
import java.math.BigInteger;

/**
 * Creates the GUI for Hexadecimal calculator so that user may perform
 * calculations in hex.
 */
public class HexCalc extends JFrame implements HexBigIntConversion {
    JTextField Answer = new JTextField();

    /**
     * Overrides toBigInteger from {@link ToBigInteger} to convert string to BigInteger
     * @param s takes a string from user
     * @return The BigInteger version of the passed string
     */
    @Override
    public BigInteger toBigInteger(String s) {
        return new BigInteger(s, 16);
    }

    /**
     * Overrides the toHex from {@link HexBigIntConversion} to convert string to a hex string
     * @param s user input handed to the converter
     * @return the hex string representation of a given string
     */
    @Override
    public String toHex(String s) {
        BigInteger big = new BigInteger(s);
        return big.toString(16);
    }

    /**
     * Creates a window with the text fields for user input as well as an output field for
     * the users calculations. Provides a series of buttons which will perform the associated
     * operations on the given values. It also will handle a series of potential user input errors.
     */
    public HexCalc() {
        HexStringChecker bs = new HexStringChecker();
        BigIntOperations op = new BigIntOperations();

        JFrame HexCalc = new JFrame();
        setSize(800, 200);
        setTitle("Hexadecimal Calculator");
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
                Answer.setText(toHex(op.add(toBigInteger(valueX.getText()), toBigInteger(valueY.getText()))));
            } else {
                Answer.setText("Must enter hex string");
            }
        });

        Subtraction.addActionListener(e -> {
            if(bs.checkString(valueX.getText(), valueY.getText())) {
                Answer.setText(toHex(op.sub(toBigInteger(valueX.getText()), toBigInteger(valueY.getText()))));
            } else {
                Answer.setText("Must enter hex string");
            }
        });

        Multiplication.addActionListener(e -> {
            if(bs.checkString(valueX.getText(), valueY.getText())) {
                Answer.setText(toHex(op.mul(toBigInteger(valueX.getText()), toBigInteger(valueY.getText()))));
            } else {
                Answer.setText("Must enter hex string");
            }
        });

        Division.addActionListener(e -> {
            if(bs.checkString(valueX.getText(), valueY.getText())) {
                Answer.setText(toHex(op.div(toBigInteger(valueX.getText()), toBigInteger(valueY.getText()))));
            } else {
                Answer.setText("Must enter hex string");
            }
        });

        //Credit for concurrency thread idea goes to Farzin Zaker on StackOverflow.com
        Power.addActionListener(e -> {
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    if(bs.checkString(valueX.getText(), valueY.getText())) {
                        Answer.setText(toHex(op.pow(toBigInteger(valueX.getText()), toBigInteger(valueY.getText()))));
                    } else {
                        Answer.setText("Must enter hex string");
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
                Answer.setText(toHex(op.rot(toBigInteger(valueX.getText()))));
            } else {
                Answer.setText("Must enter hex string");
            }
        });

        Squared.addActionListener(e -> {
            if(bs.checkString(valueX.getText())) {
                Answer.setText(toHex(op.sqr(toBigInteger(valueX.getText()))));
            } else {
                Answer.setText("Must enter hex string");
            }
        });

        Factorial.addActionListener(e -> {
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    if(bs.checkString(valueX.getText())) {
                        Answer.setText(op.fac(toBigInteger(valueX.getText())));
                    } else {
                        Answer.setText("Must enter hex string");
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

        Modulus.addActionListener(e -> {
            if(bs.checkString(valueX.getText(), valueY.getText())) {
                Answer.setText(toHex(op.MOD(toBigInteger(valueX.getText()), toBigInteger(valueY.getText()))));
            } else {
                Answer.setText("Must enter hex string");
            }
        });

        greatestCommonDivisor.addActionListener(e -> {
            if(bs.checkString(valueX.getText(), valueY.getText())) {
                Answer.setText(toHex(op.GCD(toBigInteger(valueX.getText()), toBigInteger(valueY.getText()))));
            } else {
                Answer.setText("Must enter hex string");
            }
        });

        leastCommonMultiple.addActionListener(e -> {
            if(bs.checkString(valueX.getText(), valueY.getText())) {
                Answer.setText(toHex(op.LCM(toBigInteger(valueX.getText()), toBigInteger(valueY.getText()))));
            } else {
                Answer.setText("Must enter hex string");
            }
        });
    }

    public void process() {

    }
}
