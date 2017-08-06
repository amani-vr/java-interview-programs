package basics;

/**
 * Created by amani on 8/5/17.
 * Check string is palindrome or not?
 */
public class StringPalindrome {
    public static void main(String[] args) {
        String s = "hahah";
        String s1="";
        int n=s.length();
        for(int i=n-1;i>=0;i--){
            s1=s1+s.charAt(i);
        }
        if(s1.equals(s))
            System.out.print("palindrome");
        else
            System.out.print("not palindrome");
    }
}
