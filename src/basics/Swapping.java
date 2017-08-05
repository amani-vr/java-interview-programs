package basics;

import java.util.Scanner;

/**
 * Created by amani on 8/4/17.
 * Swap two numbers without using 3rd variable.
 */
public class Swapping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st Number: ");
        int a = sc.nextInt();
        System.out.println("Enter 2nd Number: ");
        int b = sc.nextInt();
        System.out.println("a = " + a + "; b = " + b);
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("a = " + a + "; b = " + b);
    }
}
