import CA218.Stacks.ArrayStack;

import java.util.Scanner;

public class t {
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);
        /* Declare second integer, double, and String variables. */
        String text="";
        int a;
        double b;

        /* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
        a = scan.nextInt();
        b = scan.nextDouble();
        scan = new Scanner(System.in);
        text=scan.nextLine();

        /* Print the sum of both integer variables on a new line. */
        System.out.println(i + a);

        /* Print the sum of the double variables on a new line. */
        System.out.println(d + b);
        /* Concatenate and print the String variables on a new line;
        	the 's' variable above should be printed first. */
        System.out.println(s + text);
        scan.close();

    }
}
