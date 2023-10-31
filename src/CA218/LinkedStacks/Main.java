package CA218.LinkedStacks;
public class Main {
    public static void main(String[] args) {
        LinkedStack<String> names = new LinkedStack<>();
        names.push("Ali");
        names.push("Osman");
        names.push("Ali");
        names.push("Hawa");


        System.out.println("searching: " + names.searchElement("Abdi"));
        System.out.println("Counter: " + names.Counter("Ali") + " times");
        System.out.println("Size: " + names.size());
        System.out.println("empty: " + names.isEmpty());
        System.out.println("top element: " + names.peek());

        System.out.println("Stack elements:");
        names.printElements();
    }
}
