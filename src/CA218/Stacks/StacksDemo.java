package CA218.Stacks;

import java.util.Iterator;
import java.util.Stack;

public class StacksDemo {
    public static void main(String[] args) {
        Stack<Integer> s1 = new Stack<>();
        s1.push(10);
        s1.push(20);
        s1.push(30);
        s1.push(40);
        System.out.println("Original elements: " + s1.toString());
        System.out.println("size: " + s1.size());
        //int top = s1.peek();
        System.out.println("Top element: " + s1.peek());
       // int out = s1.pop();
        System.out.println("removed element: " + s1.pop());
        System.out.println("stack elements: " + s1);
        System.out.println("Isempty: " + s1.isEmpty());
        Iterator<Integer> iterator = s1.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next() + " ");
        }
    }
}
