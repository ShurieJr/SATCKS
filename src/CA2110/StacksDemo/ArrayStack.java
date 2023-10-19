package CA2110.StacksDemo;

import java.util.Arrays;
import java.util.EmptyStackException;

public class ArrayStack <T> {
    //variables
    private static final int DEFAULT_CAPACITY = 2;
    private int top;
    private T[] stack;
    //constructors
    ArrayStack(){
        this(DEFAULT_CAPACITY);
//        top = 0;
//        stack = (T[]) new Object[DEFAULT_CAPACITY];
    }
    ArrayStack(int initialCapacity){
        top = 0;
        stack = (T[]) new Object[initialCapacity];
    }

    //methods -- operations
    //push
    void push ( T element){
        if(size() == stack.length)
            expandCapacity();
        stack[top] = element;
        top++;
    }
    //expandCapcity
    void expandCapacity(){
       stack = Arrays.copyOf(stack, stack.length * 2);
    }
    //size()
    int size(){
        return top;
    }

    //isEmpty()
    boolean isEmpty(){
       return top == 0;
//        if (top == 0)
//            return true;
//        return false;
    }
    //pop
    T pop() throws EmptyCollectionException {
        if(isEmpty())
           throw new EmptyCollectionException("The ArrayStack is Empty!");
        top--;
        T removedElement = stack[top];
        stack[top] = null;

        return removedElement;
    }
    //peek
    T peek () throws EmptyStackException{
        if(isEmpty())
          throw new EmptyStackException();
        return stack[top - 1];
    }

    //HomeWork - Methods
    //1. find the minimum number in the stack
    //2. find the maximum number in the stack
    //3. print the stack elements using loop
}
