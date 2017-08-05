package basics;

import java.util.Scanner;

/**
 * Created by amani on 8/4/17.
 * Factorial of a given number.
 */
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find factorial of it: ");

        int num = sc.nextInt();
        Long fact = 1L;
        for(int i = 1; i <=num; i++){
            fact *= i;
        }

        System.out.println("fact = " + fact);
    }
}
