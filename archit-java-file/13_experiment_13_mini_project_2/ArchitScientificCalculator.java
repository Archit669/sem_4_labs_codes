import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ArchitScientificCalculator extends JFrame implements ActionListener {
    private JTextField inputField;
    private JButton sqrtButton, logButton, expButton, sinButton, cosButton;
    private JLabel resultLabel;

    public ArchitScientificCalculator() {
        setTitle("Scientific Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 1));

        // Input Panel
        JPanel inputPanel = new JPanel(new FlowLayout());
        inputField = new JTextField(10);
        inputPanel.add(new JLabel("Enter a number: "));
        inputPanel.add(inputField);

        // Button Panel
        JPanel buttonPanel = new JPanel(new FlowLayout());
        sqrtButton = new JButton("sqrt");
        logButton = new JButton("log");
        expButton = new JButton("exp");
        sinButton = new JButton("sin");
        cosButton = new JButton("cos");

        sqrtButton.addActionListener(this);
        logButton.addActionListener(this);
        expButton.addActionListener(this);
        sinButton.addActionListener(this);
        cosButton.addActionListener(this);

        buttonPanel.add(sqrtButton);
        buttonPanel.add(logButton);
        buttonPanel.add(expButton);
        buttonPanel.add(sinButton);
        buttonPanel.add(cosButton);

        // Result Panel
        JPanel resultPanel = new JPanel(new FlowLayout());
        resultLabel = new JLabel("Result: ");

        resultPanel.add(resultLabel);

        // Add panels to the main frame
        add(inputPanel);
        add(buttonPanel);
        add(resultPanel);

        pack();
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String input = inputField.getText();

        if (e.getSource() == sqrtButton) {
            double number = Double.parseDouble(input);
            double result = Math.sqrt(number);
            resultLabel.setText("Result: " + result);
        } else if (e.getSource() == logButton) {
            double number = Double.parseDouble(input);
            double result = Math.log10(number);
            resultLabel.setText("Result: " + result);
        } else if (e.getSource() == expButton) {
            double number = Double.parseDouble(input);
            double result = Math.exp(number);
            resultLabel.setText("Result: " + result);
        } else if (e.getSource() == sinButton) {
            double angle = Math.toRadians(Double.parseDouble(input));
            double result = Math.sin(angle);
            resultLabel.setText("Result: " + result);
        } else if (e.getSource() == cosButton) {
            double angle = Math.toRadians(Double.parseDouble(input));
            double result = Math.cos(angle);
            resultLabel.setText("Result: " + result);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new ArchitScientificCalculator();
            }
        });
    }
}
