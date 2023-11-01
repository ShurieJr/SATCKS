package CA214.LinkedStacks;

public class Main {
    public static void main(String[] args) {
        LinkedStack<String> names = new LinkedStack<>();
        names.push("Ali");
        names.push("Farah");
        names.push("Ali");
        names.push("Ali");
        names.push("Hawa");
        names.push("Abdi");

        names.search("Hawa");

//        System.out.println("Size : " + names.size());
//        System.out.println("Empty : " + names.isEmpty());
//        System.out.println("removed element : " + names.pop());
//        System.out.println("Top element : " + names.peek());
//        System.out.println("---- stack elements -----");
//       names.printElements();
    }
}
