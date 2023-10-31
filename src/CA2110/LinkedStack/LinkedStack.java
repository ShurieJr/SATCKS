package CA2110.LinkedStack;

import java.util.EmptyStackException;

public class LinkedStack <T> {
    private int count;
    private Node<T> top;

    LinkedStack(){
        top = null;
        count = 0;
    }

    //push operation
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
    }

    //pop
    T pop() throws EmptyStackException {
        if(isEmpty())
            throw new EmptyStackException();
        T result = top.getElement();
        top = top.getNext();
        count--;
        return result;
    }

    //peek
    T peek() throws EmptyStackException{
        if(isEmpty())
            throw new EmptyStackException();
        return top.getElement();
    }

    //printElements
    void printElements(){
        if(isEmpty())
            System.out.println("Stack is Empty!");
        else{
            Node<T> current = top;
             while(current != null){
                System.out.println("Element : " + current.getElement());
             current = current.getNext();
            }
        }
    }

    //tostring
    @Override
    public String toString() {
        StringBuffer items = new StringBuffer();
        Node<T> current = top;
        while(current != null){
            items.append(current.getElement() + " ");
            current  = current.getNext();
        }
        return items.toString();
    }


    //search element
    boolean searchElement(T key){
        boolean found = false;
        if(isEmpty())
            System.out.println("stack is empty!");
        else{
          Node<T> current = top;
          while(current != null){
              if(key.equals(current.getElement()))
                  found =  true;
              current = current.getNext();
          }
        }
        return found;
    }

    //counter
    int Counter(T key){
    int counter = 0;
        if(isEmpty())
            System.out.println("Empty stack!");
        else{
            Node<T> current = top;
            while(current != null){
                if(key.equals(current.getElement()))
                    counter++;
                current = current.getNext();
            }
        }
        return counter;
    }
}
