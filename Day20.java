import java.util.*;
public class Day20 {
    public static int sortStackUsingRecursion(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return 0;
        }
        int top = stack.pop();
        sortStackUsingRecursion(stack);
        insertInSortedOrder(stack, top);
        return 0;
    }
    private static void insertInSortedOrder(Stack<Integer> stack, int element) {
        if (stack.isEmpty() || stack.peek() < element) {
            stack.push(element);
            return;
        }
        int top = stack.pop();
        insertInSortedOrder(stack, element);
        stack.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(1);
        stack.push(4);
        stack.push(2);
        System.out.println("Original Stack: " + stack);
        sortStackUsingRecursion(stack);
        System.out.println("Sorted Stack: " + stack);
    }
}
