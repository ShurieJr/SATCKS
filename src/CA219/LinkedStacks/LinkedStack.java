package CA219.LinkedStacks;

import java.util.EmptyStackException;

public class LinkedStack<T> {
    private Node<T> top;
    private int count;

    LinkedStack(){
        top = null;
        count = 0;
    }

    //push method
    void push( T element){
        Node<T> temp = new Node<>(element);
        temp.setNext(top);
        top = temp;
        count++;
    }
    //size
    int size(){
        return count;
    }
    //Isempty
    boolean isEmpty(){
        //return top == null;
        return count == 0;
    }

    //pop
    T pop () throws EmptyStackException{
        if(isEmpty())
            throw new EmptyStackException();
        T result = top.getElement();
        top = top.getNext();
        count--;
        return result;
    }

    //peek
    T peek () throws EmptyStackException{
        if (isEmpty())
           throw new EmptyStackException();

        return top.getElement();
    }

    //printElements
    void printElements(){
        if(! isEmpty()){
            Node<T> current = top;
            while(current != null){
                System.out.print(current.getElement() +"  ");
                current = current.getNext();
            }
        }
        else{
            System.out.println("[]");
        }
    }

    //searcElement
    boolean searchElement(T key) throws EmptyStackException{
      if(isEmpty())
          throw new EmptyStackException();
      Node<T> current = top;
      boolean found = false;
      while ( current != null){
          if(key.equals(current.getElement()))
              found = true;
          current = current.getNext();
      }
      return found;
    }

    //Counter
    int counter(T key) throws EmptyStackException{
        if(isEmpty())
            throw new EmptyStackException();
        int times=0;
        Node<T> current = top;
        while(current != null){
            if(key.equals(current.getElement()))
                times++;
            current = current.getNext();
        }
        return times;
    }
}
