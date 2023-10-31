package testing;

import java.util.EmptyStackException;
import java.util.Stack;

public class LinkedStack<T> {
    private int count;
    private  Node<T> top;

    LinkedStack(){
        top = null;
        count = 0;
    }

    //operations
    //push
    void push(T element){
        //1.
        Node<T> temp = new Node<>(element);
        //2.
        temp.setNext(top);
        //3.
        top = temp;
        //4.
        count++;
    }

    //size
    int size(){
        return  count;
    }

    //isempty
    boolean isEmpty(){
        return  count == 0;  // return top == null;
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
        T result = top.getElement();
        top = top.getNext();
        count--;
        return result;
    }
    //printElements


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

    //print
    void printElements(){
        if(isEmpty())
            System.out.println("Stack is Empty!");
        else{
          Node<T> current = top;
            while(current != null){
                System.out.print( current.getElement() + " ");
                current = current.getNext();
            }
        }
    }

    //seaaaaaaaarching
    boolean search(T key){
        boolean found = false;
        Node<T> current = top;
        while (current != null){
            if( key.equals(current.getElement()))
                found = true;
            current = current.getNext();
        }
        return  found;
    }
    int searchTimes(T key){
        int found = 0;
        Node<T> current = top;
        while (current != null){
            if( key.equals(current.getElement()))
                found++;
            current = current.getNext();
        }
        return  found;
    }
    // Reverse the LinkedStack
    public void reverse() {
        if (count == 0) {
            return;
        }
        Node<T> current = top;
        Node<T> after = top.getNext();
        while (after != null) {
            Node<T> tmp = after.getNext();
            after.setNext( current);
            current = after;
            after = tmp;
        }
        top.setNext( null);
        top = current;
//        Node<T> temp=top;
//        Node<T> previous=null;
//        Node<T> previous1=null;
//        while(temp.getNext()!=null)
//        {
//            if(temp==top)
//            {
//                previous=temp;
//                temp=temp.getNext();
//                previous.setNext(null);
//            }
//            else
//            {
//                previous1=temp;
//                temp=temp.getNext();
//                previous1.setNext(previous);
//                previous=previous1;
//            }
//        }
//        temp.setNext(previous);
//        top=temp;
    }

    T reversed(){
        if (count == 0) {
            return null;
        }
        LinkedStack<T> tempStack = new LinkedStack<>();
        Node<T> current = top;
        while (current != null){
            tempStack.push(pop());
            current = current.getNext();
        }
        return (T) tempStack.toString();
    }

    public static void main(String[] args) {
        LinkedStack<String> names = new LinkedStack<>();
        names.push("Ali");
        names.push("Gedi");


        System.out.println(names.toString());

        System.out.println(names.reversed());
        //System.out.println(numbers.toString());
//        System.out.println("Empty: " + numbers.isEmpty());
//        System.out.println("removed Element: " + numbers.pop());
//        System.out.println("Top element: " + numbers.peek());
//        System.out.println("size: " + numbers.size());
//        System.out.println(numbers.toString());
//        numbers.printElements();
//        System.out.println("\nSearch : " + numbers.search(300));
//        System.out.println("SearchTimes : " + numbers.searchTimes(300));
    }
}
