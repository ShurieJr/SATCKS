package CA219.Stacks;

import java.util.Stack;

public class StacksDemo {
    public static void main(String[] args) {
        Stack<Integer> s1 =  new Stack<>();
        s1.push(10);
        s1.push(20);
        s1.push(30);
        s1.push(40);
        System.out.println("original stack elements: " +s1);
        System.out.println("Size: " + s1.size());
        int top = s1.peek();
        System.out.println("Top element: " + top);
        s1.pop();
        s1.pop();
        System.out.println("stack elements after pop(): " +s1);
        System.out.println("Isempty: " + s1.isEmpty());
        System.out.println("Size: " + s1.size());
        System.out.println("-------------------------------->");
        Stack<String> s2 =  new Stack<>();
        s2.push("ali");
        s2.push("oMAR");

        System.out.println("original stack elements: " +s2);
        System.out.println("Size: " + s2.size());
        String top2 = s2.peek();
        System.out.println("Top element: " + top2);
        s2.pop();
        s2.pop();
        System.out.println("stack elements after pop(): " +s2);
        System.out.println("Isempty: " + s2.isEmpty());
        System.out.println("Size: " + s2.size());


    }
}
