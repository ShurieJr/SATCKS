package CA214.LinkedStacks;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LinkedStack<String> names = new LinkedStack<>();
        names.push("Ali");
        names.push("Farah");
        names.push("Ali");
        names.push("Ali");
        names.push("Hawa");
        names.push("Abdi");

        System.out.println("Enter key to search: ");
        String key = input.nextLine();
        names.search(key);

//        System.out.println("Size : " + names.size());
//        System.out.println("Empty : " + names.isEmpty());
//        System.out.println("removed element : " + names.pop());
//        System.out.println("Top element : " + names.peek());
//        System.out.println("---- stack elements -----");
//       names.printElements();
    }
}
