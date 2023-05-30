import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TemperatureConverter extends JFrame {
   
	private static final long serialVersionUID = 1L;
	private JTextField inputField;
    private JLabel resultLabel;
    private JComboBox<String> scaleComboBox;
    private JTextField outputField;

    public TemperatureConverter() {
        setTitle("Temperature Converter");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        JLabel inputLabel = new JLabel("Enter temperature:");
        inputField = new JTextField(10);

        JButton convertButton = new JButton("Convert");
        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                convertTemperature();
            }
        });

        JButton clearButton = new JButton("Clear");
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clear();
            }
        });

        scaleComboBox = new JComboBox<>();
        scaleComboBox.addItem("Celsius");
        scaleComboBox.addItem("Fahrenheit");
        scaleComboBox.addItem("Kelvin");

        resultLabel = new JLabel("Converted temperature:");

        outputField = new JTextField(10);
        outputField.setEditable(false);

        JPanel inputPanel = new JPanel();
        inputPanel.add(inputLabel);
        inputPanel.add(inputField);

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(convertButton);
        buttonPanel.add(clearButton);

        setLayout(new FlowLayout());
        add(inputPanel);
        add(new JLabel("Convert to:"));
        add(scaleComboBox);
        add(buttonPanel);
        add(resultLabel);
        add(outputField);

        pack();
        setLocationRelativeTo(null);
    }

    private void convertTemperature() {
        try {
            double inputTemperature = Double.parseDouble(inputField.getText());
            String selectedScale = (String) scaleComboBox.getSelectedItem();

            double convertedTemperature;
            switch (selectedScale) {
                case "Celsius":
                    convertedTemperature = inputTemperature;
                    break;
                case "Fahrenheit":
                    convertedTemperature = (inputTemperature * 9 / 5) + 32;
                    break;
                case "Kelvin":
                    convertedTemperature = inputTemperature + 273.15;
                    break;
                default:
                    resultLabel.setText("Please select a temperature scale.");
                    return;
            }

            outputField.setText(String.valueOf(convertedTemperature));
        } catch (NumberFormatException e) {
            resultLabel.setText("Invalid input. Please enter a number.");
        }
    }

    private void clear() {
        inputField.setText("");
        outputField.setText("");
        resultLabel.setText("Converted temperature:");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new TemperatureConverter().setVisible(true);
            }
        });
    }
}
