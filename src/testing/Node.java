package testing;

public class Node<T> {
    private T element;
    private Node<T> next;

//    Node(){
//        next =null;
//        element = null;
//    }
    Node(T element){
        this.element = element;
        next = null;
    }

    public Node<T> getNext() {
        return next;
    }

    public T getElement() {
        return element;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public void setElement(T element) {
        this.element = element;
    }
}
