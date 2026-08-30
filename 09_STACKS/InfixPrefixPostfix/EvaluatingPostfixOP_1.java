package InfixPrefixPostfix;

import java.util.Stack;

public class EvaluatingPostfixOP_1 {
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
    // Evaluate postfix expression
    static int evalPostfix(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String token : tokens) {
            if (isOperator(token)) {
                // First pop = right operand
                int b = stack.pop();
                // Second pop = left operand
                int a = stack.pop();
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
        String[] tokens = {"2", "3", "*", "4", "+"};
        int result = evalPostfix(tokens);
        System.out.println("Result: " + result);
    }
}
