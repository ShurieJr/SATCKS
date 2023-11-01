package CA214.LinkedStacks;

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
        return count == 0;  //return top==null;
    }
    //peek
    T peek() throws EmptyStackException {
        if (isEmpty())
            throw new EmptyStackException();
        return top.getElement();
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

    //printElements
    void printElements() throws EmptyStackException{
        if(isEmpty())
            throw new EmptyStackException();
        Node<T> current = top;
        while (current != null){
            System.out.println(current.getElement() +" ");
            current = current.getNext();
        }
    }


    //search
    void search(T key) throws EmptyStackException{
        if(isEmpty())
            throw new EmptyStackException();
        boolean found = false;
        int times =0;

        Node<T> current = top;
        while (current != null){
            if(key.equals(current.getElement())){
                found = true;
                times++;
            }
            current = current.getNext();
        } //end loop
        System.out.println("Found : " + found);
        System.out.println("Times : " + times);
    }

}
