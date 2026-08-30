package InfixPrefixPostfix;

import java.util.Stack;

public class EvaluatingPrefixOP_2 {
    // Check whether the token is an operator
    static boolean isOperator(String token) {
        return token.equals("+") ||
                token.equals("-") ||
                token.equals("*") ||
                token.equals("/");
    }
    // Perform the operation
    static int applyOp(String operator, int a, int b) {
        switch (operator) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                return a / b;
            default:
                throw new IllegalArgumentException("Invalid operator");
        }
    }
    // Evaluate Prefix expression
    static int evalPrefix(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        // Prefix is evaluated from right to left
        for (int i = tokens.length - 1; i >= 0; i--) {
            String token = tokens[i];
            if (isOperator(token)) {
                // First popped value = left operand
                int a = stack.pop();
                // Second popped value = right operand
                int b = stack.pop();
                int result = applyOp(token, a, b);
                stack.push(result);
            } else {
                // Convert String to Integer and push
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        String[] tokens = {"+", "*", "2", "3", "4"};
        int result = evalPrefix(tokens);
        System.out.println("Result: " + result);
    }
}
