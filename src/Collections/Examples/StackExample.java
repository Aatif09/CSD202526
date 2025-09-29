package Collections.Examples;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        stack.push("Red");
        stack.push("Green");
        stack.push("Blue");

        System.out.println("Top Element: " + stack.peek());
        System.out.println("Removed: " + stack.pop());
        System.out.println("Stack after pop: " + stack);

        // Print stack elements in reverse order (without modifying the stack)
        System.out.println("Stack in reverse order:");
        for (int i = stack.size() - 1; i >= 0; i--) {
            System.out.println(stack.get(i));
        }

        // OR: Print by popping (this will empty the stack)
        System.out.println("Stack in reverse order by popping:");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
