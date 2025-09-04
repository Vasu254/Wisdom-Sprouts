import java.util.*;
public class Day21 {
    public static int reverseStackRecursion(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return 0;
        }
        int top = stack.pop();
        reverseStackRecursion(stack);
        insertAtBottom(stack, top);
        return 0;
    }
    private static void insertAtBottom(Stack<Integer> stack, int value) {
        if (stack.isEmpty()) {
            stack.push(value);
            return;
        }
        int top = stack.pop();
        insertAtBottom(stack, value);
        stack.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println("Input: " + stack);
        reverseStackRecursion(stack);
        System.out.println("Output: " + stack);
    }
}