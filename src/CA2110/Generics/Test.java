package CA2110.Generics;
public class Test <T> { //generic class
    T data;


    public static void main(String[] args) {
        Test<Integer> obj1 = new Test<>();
        obj1.data = 23;

        Test<String> obj2 = new Test<>();
        obj2.data = "Ali";

        Test<Boolean> obj3 = new Test<>();
        obj3.data = true;


    }
}
