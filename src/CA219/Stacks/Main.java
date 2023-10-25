package CA219.Stacks;

public class Main {
    public static void main(String[] args) {
        ArrayStack<Integer> s1 = new ArrayStack<>();
        ArrayStack<Integer> s2 = new ArrayStack<>();
        ArrayStack<Integer> result= new ArrayStack<>();


        s1.push(10);
        s1.push(4);
        s1.push(5);
        s1.push(6);


        s2.push(3);
        s2.push(4);
        s2.push(50);
        s2.push(7);

        System.out.println("s1: ");
        s1.printElements();

        System.out.println("\ns2 : ");
        s2.printElements();

//        while(!s1.isEmpty()){
//            result.push(s1.pop() + s2.pop());
//        }
    int size = s1.size();
    if(s1.size() == s2.size()) {
        for (int index = 0; index < size; index++)
            result.push(s1.pop() + s2.pop());

    System.out.println("\n----------RESULT ------------");
    result.printElements();
//
//        System.out.println("size: " + s1.size());
//        System.out.println("removed element: " + s1.pop());
//        System.out.println("peek: " + s1.peek());
//        System.out.println("size: " + s1.size());
}
else {
    System.out.println("\nSize is not same!");
}
    }
}
