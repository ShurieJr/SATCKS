package CA214.STACK;

import java.util.Stack;

public class Reverser {
    public static void main(String[] args) {
        System.out.println(reverseBuffer("SOMALIA MOGADISHU"));
    }
   static String reverse ( String input){
        Stack<Character> stack = new Stack<>();
        //1. push the letters into the stack
        for(int index = 0; index < input.length(); index++)
            stack.push(input.charAt(index));
        String reversed = "";
        //2. pop the letters from the stack
        while( !stack.isEmpty())
            reversed += stack.pop();
        return reversed;
    }

    static String reverseBuffer(String input){
        Stack<Character> stack = new Stack<>();
        for(char letter : input.toCharArray())
            stack.push(letter);

        StringBuffer reversed = new StringBuffer();
        while(! stack.isEmpty())
            reversed.append(stack.pop());
        return reversed.toString();
    }
}
