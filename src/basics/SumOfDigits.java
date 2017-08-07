package basics;

import java.util.Scanner;

/**
 * Created by amani on 8/5/17.
 * Find sum of digits in java
 */
public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        int r = 0, sum = 0;
        while (n > 0) {
            r = n % 10;
            sum = sum + r;
            n = n / 10;
        }
        System.out.println("sum of the digits is: "+sum);
    }
}
