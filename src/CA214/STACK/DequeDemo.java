package CA214.STACK;

import java.util.Deque;
import java.util.LinkedList;
public class DequeDemo {
    public static void main(String[] args) {
        Deque<Integer> s1 = new LinkedList<>();

        s1.push(10);
        s1.push(20);
        s1.push(30);

        Deque<Integer> s2 = new LinkedList<>();
        s2.addAll(s1);


     System.out.println(s1);
//        System.out.println(s1.element());
//        System.out.println("size: "  +s1.size());
//        System.out.println("empty: "+ s1.isEmpty());
//        System.out.println(s1);
//        System.out.println("top(element): "+ s1.element());
//        System.out.println("top(peek): "+ s1.peek());

    }
}
