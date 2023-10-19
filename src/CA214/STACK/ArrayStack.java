package CA214.STACK;

import java.util.Arrays;
import java.util.EmptyStackException;

public class ArrayStack <T> {
    //variables
    private final static int DEFAULT_CAPACITY = 2;
    private int top;
    private T[] stack;
    //constructors
    ArrayStack(){
        this(DEFAULT_CAPACITY);
//        top = 0;
//        stack = (T[]) new Object[DEFAULT_CAPACITY];
    }
    ArrayStack (int initialCapcity){
        top = 0;
        stack = (T[]) new Object[initialCapcity];
    }
    //methods -- operations
    //expand capacity
    private void expandCpacity(){
        stack = Arrays.copyOf(stack , stack.length * 2);
    }
    //push
    void push(T element){
        if ( size() == stack.length)
            expandCpacity();
        stack[top] = element;
        top++;
    }
    //size
    int size(){
        return top;
    }
    //pop
    T pop() throws EmptyStackException {
        if(isEmpty())
            throw new EmptyStackException();
            //System.out.println("The stack is Empty!");
        top--;
        T removedElement = stack[top];
        stack[top] = null;
        return removedElement;
    }

    //isempty
    boolean isEmpty(){
        return top == 0;
    }

    //peek
    T peek() throws EmptyCollectionException{
        if(isEmpty())
            throw new EmptyCollectionException("ArrayStack");
        return stack[top - 1];
    }

    //print Elements
    void printElements() {
        if(isEmpty())
            System.out.println(" the stack is empty! ");
        else{
            System.out.print("[ " );
            System.out.print( stack[0]);
            for (int index=1; index < stack.length; index++){
                System.out.print( " , " +  stack[index]);
            }
            System.out.print(" ]" );

        }


    }

    //homework

    //1. Min element

    //2. max element


    //3. frequency (key)
}
