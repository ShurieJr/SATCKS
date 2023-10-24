package CA219.Stacks;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class DequeStack {
    public static void main(String[] args) {
        //Stack<Integer> s1 = new Stack<>();
        Deque<Integer> s2 = new LinkedList<>();
        s2.push(10);
        s2.push(20);
        System.out.println(s2.getFirst());

//        s2.push(10);
//        s2.push(20);
//        s2.push(30);
//        System.out.println("removed : "+ s2.pop());
//        System.out.println(s2);
//        System.out.println("size  : " + s2.size());
//        System.out.println("isempty  : " + s2.isEmpty());
//
//        System.out.println("poll  : " + s2.poll());
//        System.out.println("peek  : " + s2.peek());
//        System.out.println("top(element)  : " + s2.element());

    }
}
