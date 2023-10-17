package CA2110.StacksDemo;
import java.util.Stack;

public class Reverser {
    public static void main(String[] args) {
        System.out.println( reverseBuffer("JAMHURIYA UNIVERSITY"));
    }
    static String reverse(String input){
        Stack<Character> stack = new Stack<>();
        //1.step 1 push letters into the stack
        for(int i = 0; i < input.length(); i++)
            stack.push(input.charAt(i));
        String reversed = "";
        //2. step 2 : pop letters from the stack into a reversed
        while (!stack.isEmpty())
            reversed += stack.pop();
        return reversed;
    }

    static  String reverseBuffer(String input){
        Stack<Character> stack = new Stack<>();
        for(char letter : input.toCharArray())
            stack.push(letter);
        StringBuffer reversed = new StringBuffer();
        while(!stack.isEmpty())
            reversed.append(stack.pop());
        return reversed.toString();
    }
}
