/*  Recursive sum of digit in n^x
Input :  5  4
Output :  4
We know 54 = 625
Sum of digits in 625 = 6 + 2 + 5 = 13
Sum of digits in 13 = 1 + 3 = 4*/
package gfg;

import java.util.Scanner;

public class RecursiveSumOfDigit {
    static int sum(int sum){
        int r,n=sum,t=0;
        while(n>0){
            r=n%10;
            t=t+r;
            n=n/10;
        }
       return t;
       
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num = sc.nextInt();
        int pow = sc.nextInt();
        int prod = 1;
        for(int i=1;i<=pow;i++){
            prod = prod*num;
        }
        while(prod>=10) {
             prod = sum(prod);
        }
        System.out.println("sum = " + prod);
    }
}
