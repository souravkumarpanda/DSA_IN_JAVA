package InfixPrefixPostfix;

import java.util.Stack;

public class InfixToPostfixOP_3 {
    // Return precedence of operators
    static int precedence(char operator) {
        if (operator == '+' || operator == '-') {
            return 1;
        } else if (operator == '*' || operator == '/') {
            return 2;
        } else if (operator == '^') {
            return 3;
        }
        return 0;
    }
    // Check whether character is an operator
    static boolean isOperator(char c) {
        return c == '+' ||
                c == '-' ||
                c == '*' ||
                c == '/' ||
                c == '^';
    }
    // Convert Infix to Postfix
    static String infixToPostfix(String infix) {
        StringBuilder output = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for (char c : infix.toCharArray()) {
            // If operand, add directly to output
            if (Character.isLetterOrDigit(c)) {
                output.append(c);
            }
            // If '(' push into stack
            else if (c == '(') {
                stack.push(c);
            }
            // If ')' pop until '(' is found
            else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    output.append(stack.pop());
                }
                // Remove '('
                if (!stack.isEmpty()) {
                    stack.pop();
                }

            }
            // If operator
            else if (isOperator(c)) {
                while (!stack.isEmpty()
                        && stack.peek() != '('
                        && precedence(stack.peek()) >= precedence(c)) {

                    output.append(stack.pop());
                }
                stack.push(c);
            }
        }
        // Pop remaining operators
        while (!stack.isEmpty()) {
            output.append(stack.pop());
        }
        return output.toString();
    }

    public static void main(String[] args) {
        String infix = "A+B*C";
        String postfix = infixToPostfix(infix);
        System.out.println("Infix   : " + infix);
        System.out.println("Postfix : " + postfix);
    }
}
