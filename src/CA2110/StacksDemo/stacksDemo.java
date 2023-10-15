package CA2110.StacksDemo;
import java.util.Stack;

public class stacksDemo {
    public static void main(String[] args) {
        Stack<Integer> s1 = new Stack<>();

        s1.push(10);
        s1.push(20);
        s1.push(30);

        System.out.println(s1.toString());
        System.out.println(s1.size() + " elements");
        System.out.println("Removed element: " +s1.pop());
        System.out.println(s1.toString());
        System.out.println("top : " + s1.peek());
        System.out.println(s1.size() + " elements");
        System.out.println("isempty: " + s1.isEmpty());
    }
}
