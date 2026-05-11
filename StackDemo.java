import java.util.Stack;
public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack);
        int element= stack.pop();
        System.out.println("Popped element: " + element);
        System.out.println("Top element after popping: " + stack.peek());
        System.out.println("Is the stack empty? " + stack.isEmpty());
    }
}