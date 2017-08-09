package arrays;

/**
 * Created by amani on 8/8/17.
 * Find maximum and minimum and their indices in given array
 */
public class MaxMininArray {
    public static void main(String[] args) {
        int a[]={0,1,5,2,-1,10,-99};
        int max,min,max_index,min_index;
        max = a[0];
        min = a[0];
        max_index = min_index = 0;
        for(int i=1; i<a.length; i++){
            if(max<a[i]){
                max = a[i];
                max_index = i;
            }
            else if(min>a[i]){
                min = a[i];
                min_index = i;
            }
        }
        System.out.println("Maximum in array: " + max + " found at index: " + max_index);
        System.out.println("Minimum in array: " + min + " found at index: " + min_index);
    }
}
