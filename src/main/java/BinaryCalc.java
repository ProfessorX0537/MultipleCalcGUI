import javax.swing.*;
import java.awt.*;
import java.math.BigInteger;

public class BinaryCalc extends JFrame implements BinaryBigIntConversion {
    @Override
    public BigInteger toBigInteger(String s) {
        return new BigInteger(s, 2);
    }

    @Override
    public String toBinary(String s) {
        BigInteger big = new BigInteger(s);
        return big.toString(2);
    }

    public BinaryCalc() {
        BinaryStringChecker bs = new BinaryStringChecker();
        BigIntOperations op = new BigIntOperations();

        JFrame BinaryCalc = new JFrame();
        setSize(800, 200);
        setTitle("Binary Calculator");
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
                    Answer.setText(toBinary(op.add(toBigInteger(valueX.getText()), toBigInteger(valueY.getText()))));
                } else {
                    Answer.setText("Must enter Binary String");
                }
    });

        Subtraction.addActionListener(e -> {
            if(bs.checkString(valueX.getText(), valueY.getText())) {
                Answer.setText(toBinary(op.sub(toBigInteger(valueX.getText()), toBigInteger(valueY.getText()))));
            } else {
                Answer.setText("Must enter Binary String");
            }
        });

        Multiplication.addActionListener(e -> {
            if(bs.checkString(valueX.getText(), valueY.getText())) {
                Answer.setText(toBinary(op.mul(toBigInteger(valueX.getText()), toBigInteger(valueY.getText()))));
            } else {
                Answer.setText("Must enter Binary String");
            }
    });

        Division.addActionListener(e -> {
            if(bs.checkString(valueX.getText(), valueY.getText())) {
                Answer.setText(toBinary(op.div(toBigInteger(valueX.getText()), toBigInteger(valueY.getText()))));
            } else {
                Answer.setText("Must enter Binary String");
            }
    });

        Power.addActionListener(e -> {
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    if(bs.checkString(valueX.getText(), valueY.getText())) {
                        Answer.setText(op.pow(toBigInteger(valueX.getText()), toBigInteger(valueY.getText())));
                    } else {
                        Answer.setText("Error must enter binary string");
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
                Answer.setText(toBinary(op.rot(toBigInteger(valueX.getText()))));
            } else {
                Answer.setText("Must enter Binary String");
            }
        });

        Squared.addActionListener(e -> {
            if(bs.checkString(valueX.getText())) {
                Answer.setText(toBinary(op.sqr(toBigInteger(valueX.getText()))));
            } else {
                Answer.setText("Must enter Binary String");
            }
        });

        Factorial.addActionListener(e -> {
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    if(bs.checkString(valueX.getText())) {
                        Answer.setText(op.fac(toBigInteger(valueX.getText())));
                    } else {
                        Answer.setText("Error must enter binary string");
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
                Answer.setText(toBinary(op.MOD(toBigInteger(valueX.getText()), toBigInteger(valueY.getText()))));
            } else {
                Answer.setText("Must enter Binary String");
            }
        });

        greatestCommonDivisor.addActionListener(e -> {
            if(bs.checkString(valueX.getText(), valueY.getText())) {
                Answer.setText(toBinary(op.GCD(toBigInteger(valueX.getText()), toBigInteger(valueY.getText()))));
            } else {
                Answer.setText("Must enter Binary String");
            }
        });

        leastCommonMultiple.addActionListener(e -> {
            if(bs.checkString(valueX.getText(), valueY.getText())) {
                Answer.setText(toBinary(op.LCM(toBigInteger(valueX.getText()), toBigInteger(valueY.getText()))));
            } else {
                Answer.setText("Must enter Binary String");
            }
    });
    }
}