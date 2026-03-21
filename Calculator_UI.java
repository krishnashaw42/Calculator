import java.awt.*;
import javax.swing.*;

public class Calculator_UI {

    static JTextField text;
    static double result = 0;
    static String operator = "";
    static boolean startNewNumber = true;

    public static void main(String args[]) {

        JFrame frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 400);
        frame.setLayout(new BorderLayout());

        text = new JTextField();
        text.setFont(new Font("Arial", Font.BOLD, 24));
        text.setHorizontalAlignment(JTextField.RIGHT);
        text.setEditable(false);
        frame.add(text, BorderLayout.NORTH);

        JPanel panel = new JPanel(new GridLayout(5, 4, 5, 5));
        panel.setBackground(Color.BLACK);

        String[] buttons = {
                "AC", "%", "C", "/",
                "7", "8", "9", "*",
                "4", "5", "6", "-",
                "1", "2", "3", "+",
                "0", ".", "=", ""
        };

        for (String label : buttons) {
            if (label.equals("")) {
                panel.add(new JLabel());
                continue;
            }

            JButton btn = new JButton(label);
            styleButton(btn);

            btn.addActionListener(e -> handleInput(label));
            panel.add(btn);
        }

        frame.add(panel);
        frame.setVisible(true);
    }

    static void handleInput(String input) {

        if (input.matches("[0-9]")) {
            if (startNewNumber) {
                text.setText(input);
                startNewNumber = false;
            } else {
                text.setText(text.getText() + input);
            }
        }

        else if (input.equals(".")) {
            if (!text.getText().contains(".")) {
                text.setText(text.getText() + ".");
                startNewNumber = false;
            }
        }

        else if (input.equals("AC")) {
            text.setText("");
            result = 0;
            operator = "";
            startNewNumber = true;
        }

        else if (input.equals("C")) {
            text.setText("");
            startNewNumber = true;
        }

        else if (input.equals("=")) {
            calculate();
            operator = "";
            startNewNumber = true;
        }

        else {
            if (!text.getText().isEmpty()) {
                calculate();
                operator = input;
                startNewNumber = true;
            }
        }
    }

    static void calculate() {
        try {
            double num = Double.parseDouble(text.getText());

            switch (operator) {
                case "+": result += num; break;
                case "-": result -= num; break;
                case "*": result *= num; break;
                case "/":
                    if (num == 0) {
                        text.setText("Error");
                        return;
                    }
                    result /= num;
                    break;
                case "%": result = result * num / 100; break;
                default: result = num;
            }

            if (result == (int) result)
                text.setText(String.valueOf((int) result));
            else
                text.setText(String.valueOf(result));

        } catch (Exception e) {
            text.setText("Error");
        }
    }

    static void styleButton(JButton b) {
        b.setFont(new Font("Arial", Font.BOLD, 16));
        b.setBackground(Color.GRAY);
        b.setForeground(Color.WHITE);
        b.setFocusPainted(false);
    }
}