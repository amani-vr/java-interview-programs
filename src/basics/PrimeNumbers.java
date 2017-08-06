package basics;

/**
 * Created by amani on 8/5/17.
 * Get Prime Numbers in a given range
 */
public class PrimeNumbers {
    public static void main(String[] args) {
        int a=2,b=99,count;
        for(int i=a;i<=b;i++){
            count=0;
            for(int j=2;j*j<=i;j++){
                if(i%j==0){
                    count++;
                    break;
                }
            }
            if(count==0){
                System.out.println(i+" ");
            }
        }
    }
}
