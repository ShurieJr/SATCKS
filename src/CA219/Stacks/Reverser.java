package CA219.Stacks;

import java.util.Stack;

public class Reverser {
    public static void main(String[] args) {
        String text = "SSOMMALIAA";
        System.out.println(reverseBuffer(text));
        System.out.println(reverse(text));

    }
    //Homework 219:
    //1. find Min and max element in a stack
    //2. find the frequency  of an element in a stack
    public static String reverse(String input){
        Stack<Character> stack = new Stack<>();
        //push letters into the stack
        for(int i=0; i < input.length() ; i++){
            if(!stack.contains(input.charAt(i)))
                stack.push(input.charAt(i));
        }
        //pop the elements
        String reversed = "";
        while ( !stack.isEmpty()){
            reversed += stack.pop();
        }
        return reversed;
    }

    public static String reverseBuffer(String input){
        Stack<Character> stack = new Stack<>();
        for(char letter : input.toCharArray()){
            if(!stack.contains(letter))
                stack.push(letter);
        }
        StringBuffer reversed = new StringBuffer();
        while (!stack.isEmpty()){
            reversed.append(stack.pop());
        }
        return reversed.toString();
    }
}
