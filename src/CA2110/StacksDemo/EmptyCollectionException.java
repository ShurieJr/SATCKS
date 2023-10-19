package CA2110.StacksDemo;

public class EmptyCollectionException extends RuntimeException {
    EmptyCollectionException(String collection){
        super( collection );
    }
}
