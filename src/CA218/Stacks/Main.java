package CA218.Stacks;

public class Main {
    public static void main(String[] args) {
//        ArrayStack<Integer> s1 = new ArrayStack<>();
//       ArrayStack<Integer> s2 = new ArrayStack<>();
//       ArrayStack<Integer>  result = new ArrayStack<>();
//
//        s1.push(10);
//        s1.push(20);
//        s1.push(30);
//
//        s2.push(10);
//        s2.push(20);
//        s2.push(30);
//
//        System.out.println("s1: " );
//        s1.printElements();
//
//        System.out.println("\ns2: " );
//        s2.printElements();
//        //check if the two stacks are same size
//        if(s1.size() != s2.size()) {
//            System.out.println("\nsize is not same!");
//        }
//        else  // do the sum operation
//        {
//            int length = s1.size();
//            for(int i =0; i<length ; i++)
//            {
//                int answer = (s1.pop() + s2.pop());
//                result.push(answer);
//            }
//            System.out.println("\nResult: " );
//            result.printElements();

        ArrayStack<Integer> s1 = new ArrayStack<>();
        ArrayStack<Integer> s2 = new ArrayStack<>();
        ArrayStack<Integer> result = new ArrayStack<>();

        s1.push(6);
        s1.push(5);
        s1.push(7);
        s1.push(8);

        s2.push(10);
        s2.push(4);
        s2.push(3);
        s2.push(4);


        System.out.println("s1: ");
        s1.printElements();

        System.out.println("\nS2: ");
        s2.printElements();

        //check if the two stacks are same size
        if(s1.size() != s2.size()){
            System.out.println("\nsize is not same!");
        }
        else{
            //int length = s1.size();
//            for(int i=0; i< length; i++){
//                result.push(s1.pop() + s2.pop());
//            }

            while(!s1.isEmpty() && !s2.isEmpty()){
                result.push(s1.pop() + s2.pop());
            }
            System.out.println("\nResult: ");
            result.printElements();
        }



        //   int removedElement =  s1.pop();
        //  int removedElement2 =  s1.pop();
//        System.out.println("removedElement: " + removedElement);
//        System.out.println("removedElement2 : " + removedElement2);
//        System.out.println("size: " + s1.size());
//        System.out.println("top : " + s1.peek());
//        System.out.println("isempty : " + s1.isEmpty());
//
//        System.out.println(s1.toString());
    }

//   ArrayStack<Integer> addtwo (ArrayStack s1 , ArrayStack s2){
//        ArrayStack<Integer> result = new ArrayStack<>();
//
//        for(int i =0; i<s1.size(); i++){
////            int item =s1[i] + s2[i];
////            result.push(s1[]);
//        }

  //  }
}
