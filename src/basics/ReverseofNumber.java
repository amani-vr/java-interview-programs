package basics;

/**
 * Created by amani on 8/5/17.
 * Reverse a number in java?
 */
public class ReverseofNumber {
    public static void main(String[] args) {
        int n=123;
        int r = 0, sum = 0;
        while (n > 0) {
            r = n % 10;
            sum = sum*10 + r;
            n = n / 10;
        }
        System.out.println("reverse of a number is:"+sum);
    }
}
