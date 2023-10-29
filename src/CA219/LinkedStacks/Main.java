package CA219.LinkedStacks;
public class Main {
    public static void main(String[] args) {
         LinkedStack<String> names = new LinkedStack<>();

       names.push("Ali");
        names.push("Hassan");
         names.push("Omar");
         names.push("Hassan");
         names.push("Hawa");

         names.printElements();
        System.out.println("\nsearch(Abdi) :" + names.searchElement("Abdi") );
        System.out.println("Counter(Abdi) :" + names.counter("Abdi") );
        System.out.println("size: " + names.size());
        System.out.println("Isempty: " + names.isEmpty());
        System.out.println("peek: " + names.peek());

    }
}
