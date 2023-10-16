package CA219.Stacks;

import java.util.Arrays;
import java.util.EmptyStackException;

public class ArrayStack<T> {
   private int top;
   private final static int Def_size = 2;
    private T[] stack;
    //constructors
    ArrayStack (int size){
        top  = 0;
        stack = (T[]) new Object[size];
    }
    ArrayStack(){
     this(Def_size);
//        top  = 0;
//        stack = (T[]) new Object[Def_size];
    }
    int size(){
        return top;
    }
    void push(T element){
        if(size() == stack.length)
            expandCapacity();
        stack[top] = element;
        top++;
    }
    private void expandCapacity(){
        stack = Arrays.copyOf(stack , stack.length * 2);
    }

    boolean isEmpty(){
        return top == 0;
    }

    T pop (){
        T removedElement = null;
        if(isEmpty()){
            System.out.printf("The stack is Empty!");
        }
         else{
            top--;
            removedElement = stack[top];
            stack[top] = null;
        }
         return removedElement;
    }
    T peek () throws EmptyCollectionException{
        if(isEmpty())
            throw new EmptyCollectionException("stack");
            //System.out.printf("The stack is empty!");
        return stack[top-1];
    }



}
