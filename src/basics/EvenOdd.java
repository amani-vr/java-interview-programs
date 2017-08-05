package basics;

import java.util.Scanner;

/**
 * Created by amani on 8/4/17.
 * Check whether a given number is Even or Odd
 */
public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number!");
        int num = sc.nextInt();
        if(num % 2 == 0)
            System.out.printf("Given number %d is Even", num);
        else
            System.out.printf("Given number %d is Odd", num);
    }
}
