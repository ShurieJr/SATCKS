package CA214.STACK;

public class EmptyCollectionException extends RuntimeException{
  EmptyCollectionException(String collection){
      super("The " + collection + "  is Empty!!!");
  }
}
