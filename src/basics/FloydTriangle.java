package basics;

import java.util.Scanner;

/**
 * Created by amani on 8/5/17.
 * Print the Floyd Triangle with given number of rows
 * Note- Floyd Triangle with rows 4 is like
 * 1
 * 2 3
 * 4 5 6
 * 7 8 9 10
 */
public class FloydTriangle {
    public static void main(String[] args) {
        int n,i,j,k=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number for rows:");
        n=sc.nextInt();
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++) {
                System.out.print(k + " ");
                k++;
            }
            System.out.println();
        }

    }
}
