package arrays;

import java.util.HashSet;

/**
 * Created by amani on 8/8/17.
 * Find all pairs in Array of Integers whose sum is equal to given number
 */
public class PairsInArray {
    public static void main(String[] args) {
        int a[]={0,1,3,6,7,8,9};
        int sum=9;
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<a.length;i++){
            int x=sum-a[i];
            if(!hs.contains(x)){
                hs.add(a[i]);
            }
            else
                System.out.println("("+x+","+a[i]+")");
        }
    }
}
