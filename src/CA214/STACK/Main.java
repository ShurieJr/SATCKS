package CA214.STACK;

public class Main {
    public static void main(String[] args) {
//        ArrayStack<Integer> s1 = new ArrayStack<>(3);
//
//        s1.push(10);
//        s1.push(30);
//        s1.push(40);
//        System.out.println("size: " + s1.size());
//        System.out.println("isempty: " + s1.isEmpty());
//        System.out.println("top element: " + s1.peek());
//
//       s1.printElements();
    ArrayStack<String> firstName = new ArrayStack<>();
    ArrayStack<String> lastName = new ArrayStack<>();
    ArrayStack<String> fullName = new ArrayStack<>();

    firstName.push("Ali");
    firstName.push("omar");
    firstName.push("Ali");
    firstName.push("Ali");
    firstName.push("kaafi");

   // firstName.searchElement("osman");

    lastName.push("farah");
    lastName.push("hassan");
    lastName.push("osman");
    lastName.push("Geedi");
    lastName.push("mohamed");

        System.out.println("First Name: ");
        firstName.printElements();

        System.out.println("Last Names: ");
        lastName.printElements();

//check if the size is same
        if(firstName.size() == lastName.size()){
//            while (! firstName.isEmpty()){
//                fullName.push(firstName.pop() + " " + lastName.pop());
//            }
            //for loop
            int size = firstName.size();
            for(int index = 0; index < size; index++){
                fullName.push(firstName.pop() + " " + lastName.pop());
            }
        }
        else{
            System.out.println("different sizes!");
        }

        System.out.println("-----------------Full Names ---------------");
        fullName.printElements();

  }
}
