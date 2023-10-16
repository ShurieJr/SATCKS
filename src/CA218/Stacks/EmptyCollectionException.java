package CA218.Stacks;

public class EmptyCollectionException extends RuntimeException {
    EmptyCollectionException(){
        super("The Stack  is Empty!");
    }
}
