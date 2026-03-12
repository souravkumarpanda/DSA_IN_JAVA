package Styling;
import javax.swing.*;

public class MultiplicationTables {
    public static void main(String[] args) {
        // Initialize variables to store inputs
        int start, end, range;

        // Input for starting number
        start = Integer.parseInt(JOptionPane.showInputDialog("Enter the starting number:"));

        // Input for ending number
        end = Integer.parseInt(JOptionPane.showInputDialog("Enter the ending number:"));

        // Input for range of multiplication tables
        range = Integer.parseInt(JOptionPane.showInputDialog("Enter the range for the multiplication tables:"));

        // StringBuilder to accumulate results
        StringBuilder result = new StringBuilder();

        // Loop through each number in the range [start, end]
        for (int num = start; num <= end; num++) {
            result.append("\nMultiplication table for ").append(num).append(":\n");

            // Print the multiplication table for the current number
            for (int i = 1; i <= range; i++) {
                result.append(num).append(" x ").append(i).append(" = ").append(num * i).append("\n");
            }
        }

        // Display the result in a new window
        JOptionPane.showMessageDialog(null, result.toString(), "Multiplication Tables", JOptionPane.INFORMATION_MESSAGE);
    }
}
