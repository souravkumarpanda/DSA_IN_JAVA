package InfixPrefixPostfix;

import java.util.Stack;

public class InfixToPrefixOP_4 {
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
    // Reverse expression and swap parentheses
    static String reverseAndSwapParens(String infix) {
        StringBuilder reversed = new StringBuilder();
        for (int i = infix.length() - 1; i >= 0; i--) {
            char c = infix.charAt(i);
            if (c == '(') {
                reversed.append(')');
            } else if (c == ')') {
                reversed.append('(');
            } else {
                reversed.append(c);
            }
        }
        return reversed.toString();
    }
    // Convert Infix to Postfix
    static String infixToPostfix(String infix) {
        StringBuilder output = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for (char c : infix.toCharArray()) {
            // Operand
            if (Character.isLetterOrDigit(c)) {
                output.append(c);
            }
            // Opening parenthesis
            else if (c == '(') {
                stack.push(c);
            }
            // Closing parenthesis
            else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    output.append(stack.pop());
                }
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            }
            // Operator
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
    // Convert Infix to Prefix
    static String infixToPrefix(String infix) {
        // Step 1: Reverse the infix expression
        // and swap '(' with ')'
        String reversed = reverseAndSwapParens(infix);
        // Step 2: Convert reversed expression to postfix
        String postfix = infixToPostfix(reversed);
        // Step 3: Reverse the postfix expression
        return new StringBuilder(postfix).reverse().toString();
    }

    public static void main(String[] args) {
        String infix = "(A+B)*C";
        String prefix = infixToPrefix(infix);
        System.out.println("Infix  : " + infix);
        System.out.println("Prefix : " + prefix);
    }
}
