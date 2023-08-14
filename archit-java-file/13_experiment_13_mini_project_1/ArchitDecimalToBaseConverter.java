import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ArchitDecimalToBaseConverter extends JFrame implements ActionListener {
    private JLabel titleLabel;
    private JTextField decimalField;
    private JComboBox<String> baseComboBox;
    private JButton convertButton;
    private JLabel resultLabel;

    public ArchitDecimalToBaseConverter() {
        // Set frame properties
        setTitle("Decimal to Base Converter");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());

        // Create title label
        titleLabel = new JLabel("Decimal to Base Converter");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 18));
        add(titleLabel);

        // Create decimal input field
        decimalField = new JTextField(10);
        add(decimalField);

        // Create base selection combo box
        String[] baseOptions = {"Binary", "Octal", "Hexadecimal"};
        baseComboBox = new JComboBox<>(baseOptions);
        add(baseComboBox);

        // Create convert button
        convertButton = new JButton("Convert");
        convertButton.addActionListener(this);
        add(convertButton);

        // Create result label
        resultLabel = new JLabel();
        resultLabel.setFont(new Font("Arial", Font.BOLD, 16));
        add(resultLabel);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == convertButton) {
            String decimalStr = decimalField.getText().trim();

            if (decimalStr.isEmpty()) {
                resultLabel.setText("Please enter a decimal number.");
                return;
            }

            int decimal;
            try {
                decimal = Integer.parseInt(decimalStr);
            } catch (NumberFormatException ex) {
                resultLabel.setText("Invalid decimal number.");
                return;
            }

            int base = baseComboBox.getSelectedIndex();

            String result;
            switch (base) {
                case 0: // Binary
                    result = Integer.toBinaryString(decimal);
                    break;
                case 1: // Octal
                    result = Integer.toOctalString(decimal);
                    break;
                case 2: // Hexadecimal
                    result = Integer.toHexString(decimal);
                    break;
                default:
                    result = "Invalid base.";
                    break;
            }

            resultLabel.setText("Result: " + result);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                ArchitDecimalToBaseConverter converter = new ArchitDecimalToBaseConverter();
                converter.setVisible(true);
            }
        });
    }
}
