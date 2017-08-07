package basics;

/**
 * Created by amani on 8/6/17.
 *
 */
public class PrimalityAlogirthm {
    static boolean isPrimeNumber(int number){
        if(number < 2){
            return false;
        }
        for(int i=2; i<=number/2; i++){
            if(number%i == 0){
                return false;
            }
        }
        return true;
    }

    static boolean isPrimeNumberEff(int number){
        if(number < 2){
            return false;
        }
        for(int i=2; i<=number/i; i++){
            if(number%i == 0){
                return false;
            }
        }
        return true;
    }

    static boolean isPrimeNumberMoreEff(int number){
        if(number < 2){
            return false;
        }
        else if(number == 2 || number ==3){
            return true;
        }
        else if(number%2 == 0 || number%3 ==0){
            return false;
        }
        int i =5;
        int w = 2;
        while(i*i <= number){
            if(number%i ==0){
                return false;
            }
            i +=w;
            w =6-w;
        }
        return true;
    }

    public static void main(String[] args) {
        PrimalityAlogirthm pa = new PrimalityAlogirthm();
        int num1 = 2, num2 = 199999;
        int primeCount=0;
        long t1 = System.currentTimeMillis();
        for(int i=num1; i<=num2; i++){
            if(isPrimeNumber(i)){
                ++primeCount;
            }
        }

        long t2 = System.currentTimeMillis();

        System.out.println("Count: " + primeCount +" Run Time in ms: " + (t2-t1));

        int primeCountEff=0;
        for(int i=num1; i<=num2; i++){
            if(isPrimeNumberEff(i)){
                ++primeCountEff;
            }
        }
        long t3 = System.currentTimeMillis();
        System.out.println("Count: " + primeCountEff +" Effi Run Time in ms: " + (t3-t2));

        int primeCountMoreEff=0;
        for(int i=num1; i<=num2; i++){
            if(isPrimeNumberMoreEff(i)){
                ++primeCountMoreEff;
            }
        }
        long t4 = System.currentTimeMillis();
        System.out.println("Count: " + primeCountMoreEff +" More Effi Run Time in ms: " + (t4-t3));
    }
}
