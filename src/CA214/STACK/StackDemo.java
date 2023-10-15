package CA214.STACK;
import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> s1 = new Stack<Integer>();
        s1.push(10);
        s1.push(20);
        s1.push(30);
        s1.push(40);
        System.out.println("Original elements: " + s1);
        int Stacksize = s1.size();
        System.out.println("size: " + Stacksize);
        System.out.println("isempty: " + s1.isEmpty());

        System.out.println("Removed element: " + s1.pop());
        System.out.println("stack elements: " + s1);
        int top = s1.peek();
        System.out.println("Top element: " + top);

    }
}
