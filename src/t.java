import CA218.Stacks.ArrayStack;

import java.util.Scanner;

public class t {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /* Declare second integer, double, and String variables. */
        int i ;
        double d ;
        String s;

        /* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
        i = scan.nextInt();
        d = scan.nextDouble();

        s=scan.nextLine();

        /* Print the sum of both integer variables on a new line. */
        System.out.println(4+ i);
        /* Print the sum of the double variables on a new line. */
        System.out.println(4+ d);
        /* Concatenate and print the String variables on a new line;
        	the 's' variable above should be printed first. */
        System.out.println(s + " is the best place to learn and practice coding!" );
        scan.close();

    }
}
