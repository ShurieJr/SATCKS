package CA218.Stacks;

public class Main {
    public static void main(String[] args) {
        ArrayStack <Integer> s1 = new ArrayStack<>(3);
        s1.peek();
        s1.push(10);
        s1.push(20);
        s1.push(30);
        s1.push(40);
//        System.out.println("removed element: " + s1.pop());
//        System.out.println("size: " + s1.size());
//        System.out.println("isEmpty: " + s1.isEmpty());
//        System.out.println("top element: " + s1.peek());
        //System.out.printf(s1.toString());

    }
}
