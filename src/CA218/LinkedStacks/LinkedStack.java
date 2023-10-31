package CA218.LinkedStacks;

import java.util.EmptyStackException;

public class LinkedStack<T> {
    private int count;
    private Node<T> top;

     LinkedStack(){
         count = 0;
         top = null;
     }
     //operations
    //push
    void push(T element){
         Node<T> temp = new Node<>(element);
         temp.setNext(top);
         top = temp;
         count++;
    }

    //size
    int size(){
         return count;
    }

    //isempty
    boolean isEmpty(){
         return count == 0;
         //return top == null;
        }
        //pop
    T pop() throws EmptyStackException{
         if(isEmpty())
             throw new EmptyStackException();
         T removedElement = top.getElement();
         top = top.getNext();
         count--;
         return removedElement;
    }

    //peek
    T peek() throws EmptyStackException{
         if(isEmpty())
             throw new EmptyStackException();
         return top.getElement();
    }

    //printElements
    void printElements() throws EmptyStackException{
         if(isEmpty())
             throw new EmptyStackException();
         Node<T> current = top;
         while(current != null ){
             System.out.println(current.getElement());
             current = current.getNext();
         }
    }

    //search Element
    boolean searchElement (T key) throws EmptyStackException{
         if(isEmpty())
             throw new EmptyStackException();
         Node<T> current = top;
         boolean found = false;
         while(current != null){
             if(key.equals(current.getElement()))
                 found = true;
             current = current.getNext();
         }
        return found;
    }

    //Counter
    int Counter(T key) throws EmptyStackException{
         if(isEmpty())
             throw new EmptyStackException();
         int times = 0;
         Node<T> current = top;
         while(current != null){
             if(key.equals(current.getElement()))
                 times++;
             current = current.getNext();
         }
         return times;
    }
}
