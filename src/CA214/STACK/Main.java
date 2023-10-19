package CA214.STACK;

public class Main {
    public static void main(String[] args) {
        ArrayStack<Integer> s1 = new ArrayStack<>(3);

        s1.push(10);
        s1.push(30);
        s1.push(40);
        System.out.println("size: " + s1.size());
        System.out.println("isempty: " + s1.isEmpty());
        System.out.println("top element: " + s1.peek());

       s1.printElements();


    }
}
