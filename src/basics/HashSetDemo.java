package basics;

import java.util.HashSet;

/**
 * Created by amani on 8/5/17.
 * Demonstrate HashSet collection by finding unique characters in a given string
 */
public class HashSetDemo {
    public static void main(String[] args) {
        String s="ababbbdd";
        HashSet<Character> hs=new HashSet<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(!hs.contains(ch))
                System.out.println("c = " + ch);
            hs.add(ch);

        }
        /*for(Character c:hs){
            System.out.println("c = " + c);

        }*/
    }
}
