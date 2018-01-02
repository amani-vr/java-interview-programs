/*

Given two strings as input. Your task is to concanate two strings and then reverse the string.
Finally print the reversed string.
 */
package gfg;

import java.util.Scanner;

public class StringConcanateAndReverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StringBuffer s1=new StringBuffer(sc.nextLine());
        StringBuffer s2=new StringBuffer(sc.nextLine());
        StringBuffer s3=new StringBuffer();
        s1.append(s2);
        int len=s1.length();
        for(int i=len-1;i>=0;i--){
            s3.append(s1.charAt(i));
        }
        System.out.println(" s3= " +s3);
    }
}
