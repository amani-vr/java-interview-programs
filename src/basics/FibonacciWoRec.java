package basics;

import java.util.Scanner;

/**
 * Created by amani on 8/5/17.
 * Fibonacci series without using Recursive?
 */
public class FibonacciWoRec {
    public static void main(String[] args) {
        int a=0,b=1,n,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number till we can print fibonacci: ");
        n=sc.nextInt();
        System.out.print(a+" "+b);
        while (true){
            sum=a+b;
            if(sum<=n) {
                System.out.print(" "+sum);
            }
            else {
                break;
            }
            a=b;
            b=sum;
        }
    }
}
