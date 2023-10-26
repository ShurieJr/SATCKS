package CA2110.LinkedStack;

public class Main {
    public static void main(String[] args) {
        LinkedStack<String> s1 = new LinkedStack<>();

        s1.push("Abdi");
        s1.push("Ali");
        s1.push("Hawa");
        s1.push("Ali");

        s1.printElements();
        System.out.println("Top: " + s1.peek());
        System.out.println("size: " + s1.size());
        System.out.println("Empty: " + s1.isEmpty());
        System.out.println("Searching : "  +s1.searchElement("Hawa"));
        System.out.println("Searching(times) : "  +s1.Counter("Hawa"));
    }
}
