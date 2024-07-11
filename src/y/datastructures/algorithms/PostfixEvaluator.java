package y.datastructures.algorithms;

import java.util.Stack;

public class PostfixEvaluator {
    public static void main(String[] args) {
        String expression = "3 4 + 2 * 7 /";
        int result = evaluatePostfix(expression);
        System.out.println("Result: " + result);
    }

    public static int evaluatePostfix(String expression) {
        Stack<Integer> stack = new Stack<>();
        String[] tokens = expression.split(" ");
        System.out.println("Tokens: " + String.join(", ", tokens));

        for (String token : tokens) {
            if (isOperator(token)) {
                System.out.println("Stack now: " + stack);
                int b = stack.pop();
                int a = stack.pop();
                int result = performOperation(a, b, token);
                stack.push(result);
            } else {
                stack.push(Integer.parseInt(token));
            }
        }

        return stack.pop();
    }

    private static boolean isOperator(String token) {
        return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/");
    }

    private static int performOperation(int a, int b, String operator) {
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
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }
}
