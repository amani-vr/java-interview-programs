package strings;

/**
 * Created by amani on 8/8/17.
 * Write a program to find whether two string are anagrams to each other
 */
public class Anagram {
    public static void main(String[] args) {
        String s1="amni";
        String s2="inam";
        if(s1.length()==s2.length()){
            for(int i=0;i<s1.length();i++){
                int count=0;
                for(int j=0;j<s2.length();j++){
                    if(s1.charAt(i)==s2.charAt(j)){
                        count++;
                        break;
                    }
                }
                if(count>0){
                    System.out.println("anagram");
                   break;
                }
                else {
                    System.out.println("not anagram");
                }
            }

        }
        else{
            System.out.println("not anagram");
        }
    }

}
