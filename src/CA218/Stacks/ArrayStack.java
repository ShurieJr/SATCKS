package CA218.Stacks;

import java.util.Arrays;
import java.util.EmptyStackException;

public class ArrayStack <T> {
    private final static int Default_Capacity=2;
    private int top;
    private T[] stack;

    ArrayStack(int capacity){
        top = 0;
        stack = (T[]) new Object[capacity];
    }
    ArrayStack(){
        this(Default_Capacity);
//        top = 0;
//        stack = (T[]) new Object[Default_Capacity];
    }
    //operations   push pop isempty size peek   , expandCapacity
    int size(){
        return top;
    }
    boolean isEmpty(){
        return  top == 0;
    }

    void push(T element){
        //if the stack is full
        if(size() == stack.length )
          expandCapacity();
        stack[top] = element;
        top++;
    }
    private void expandCapacity(){
        stack = Arrays.copyOf(stack , stack.length * 2);
    }

    T pop() throws EmptyCollectionException {
        if(isEmpty())
            throw new EmptyCollectionException();
           // System.out.printf("The stack is empty");
        top--;
        T removedElement = stack[top];
        stack[top] =null;
        return removedElement;
    }

    T peek() throws EmptyCollectionException{
        if(isEmpty())
            throw new EmptyCollectionException();
            //System.out.println("the stack is empty");

        return stack[ top -1 ];
    }

    //add print Method
    void printElements(){
        //code
    }
}
