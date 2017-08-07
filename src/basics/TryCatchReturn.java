package basics;

/**
 * Created by amani on 8/5/17.
 * What happens if we place return statement in try catch blocks
 */
public class TryCatchReturn {
   int method(){
        try{
            return 0;
        }catch (Exception e){
            System.out.println(e);
        }
       return 0;
    }
    public static void main(String[] args) {
        TryCatchReturn t=new TryCatchReturn();
        int m=t.method();
        //System.out.println(m);
    }
}
