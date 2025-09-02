import java.util.*;
public class Day19 {
    public static int PostfixExpression(String expression) {
        Stack<Integer> stack = new Stack<>();
        String[] tokens = expression.trim().split("\\s+");
        for (String token : tokens) {
            if (isOperator(token)) {
                if (stack.size() < 2) {
                    throw new IllegalArgumentException("Invalid postfix expression");
                }
                int ope2 = stack.pop();
                int ope1 = stack.pop();
                int result = applyOperator(ope1, ope2, token);
                stack.push(result);
            } else {
                stack.push(Integer.parseInt(token));
            }
        }
        if (stack.size() != 1) {
            throw new IllegalArgumentException("Invalid postfix expression");
        }
        return stack.pop();
    }
    private static boolean isOperator(String token) {
        return token.equals("+") || token.equals("-") || token.equals("*")
            || token.equals("/") || token.equals("^");
    }
    private static int applyOperator(int ope1, int ope2, String ope) {
        switch (ope) {
            case "+": return ope1 + ope2;
            case "-": return ope1 - ope2;
            case "*": return ope1 * ope2;
            case "/":
                if (ope2 == 0) throw new ArithmeticException("Division by zero");
                return ope1 / ope2;
            case "^": return (int)Math.pow(ope1, ope2);
            default: throw new IllegalArgumentException("Invalid operator: " + ope);
        }
    }

    public static void main(String[] args) {
        System.out.println(PostfixExpression("5 6 +"));
    }
}
