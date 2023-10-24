package CA2110.StacksDemo;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class DequeDemo {
    public static void main(String[] args) {
        Deque<Integer> s1  = new LinkedList<>();
        s1.push(10);
        s1.push(20);

       // s1.addFirst(30);
       // s1.addLast(50);
        //s1.addAll(s1);
        System.out.println(s1.element());
                System.out.println(s1);
        System.out.println("size: " + s1.size());

        System.out.println("------- iterator--------");

        Iterator<Integer> it = s1.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

    }
}
