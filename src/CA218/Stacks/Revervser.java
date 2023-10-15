package CA218.Stacks;

import java.util.Stack;

public class Revervser {

    public static void main(String[] args) {
        String input = "MMKKLL";
        String result = reverse(input);
        System.out.println("String reversed: " + result);

    }
  //Homework:
    //1. find Min and max element in a stack
    //2. find the frequency  of an element in a stack

    public static String reverseBuffer(String input){
        Stack<Character> s1 = new Stack<>();
        for(char letter: input.toCharArray() ){
            if(!s1.contains(letter))
                s1.push(letter);
        }
        StringBuffer reversed = new StringBuffer();
        while(!s1.isEmpty()){
            reversed.append(s1.pop());
        }
        return reversed.toString();
    }
    public static String reverse(String input){
    Stack<Character> stack = new Stack<>();
    //1 . push elements
        for(int i =0; i<input.length(); i++){
            //if(!stack.contains(input.charAt(i)))
                stack.push(input.charAt(i));
        }
        String reversed = "";
        while( !stack.isEmpty()){
            Character out = stack.pop();
            if(!reversed.contains(out.toString()))
                reversed += out;
        }
        return reversed;
    }
}
