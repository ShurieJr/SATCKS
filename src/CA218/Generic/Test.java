package CA218.Generic;
public class Test<M> {  //placeholder
    M data;

    public static void main(String[] args) {
        Test<Integer> t1 = new Test<Integer>();
        t1.data = 23;

        Test<String> t2 = new Test<>();
        t2.data ="Ali";

        Test<Boolean> t3 = new Test<Boolean>();
        t3.data = true;

        Test<Character> t4 = new Test<>();
        t4.data = 'a';
    }
}
