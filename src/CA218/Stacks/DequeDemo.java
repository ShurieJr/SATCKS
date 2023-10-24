package CA218.Stacks;

import java.util.*;

public class DequeDemo {
    public static void main(String[] args) {
        //Stack< Integer> s1 = new Stack<>();
        Deque<String> s1 = new LinkedList<>();
                s1.push("Ali");
        s1.push("Abdullahi");
        s1.push("Hawa");
        System.out.println(s1.toString());
        System.out.println("size: " + s1.size());
        System.out.println("empty: " + s1.isEmpty());
        System.out.println("top (peek): " + s1.peek());
        System.out.println("top(element): " + s1.element());
       // System.out.println("removed element(pop) : " + s1.pop());
        //System.out.println("removed element(poll) : " + s1.poll());


        s1.addFirst("Osman");
        //System.out.println(s1);


        Iterator<String> it = s1.iterator();
        System.out.println("-------------------------");
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
