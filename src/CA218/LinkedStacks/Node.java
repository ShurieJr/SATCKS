package CA218.LinkedStacks;

public class Node<T> {
    private T element;
    private Node<T> next;

    Node(){
        this(null);
//        element = null;
//        next = null;
    }
    Node(T element){
       this.element = element;
        next = null;
    }

    public void setElement(T element) {
        this.element = element;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public T getElement() {
        return element;
    }

    public Node<T> getNext() {
        return next;
    }
}
