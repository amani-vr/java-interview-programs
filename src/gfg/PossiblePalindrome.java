package gfg;

import java.util.HashSet;

public class PossiblePalindrome {
    HashSet<String> hs=new HashSet<>();
    void isPalindrome(String s){
        int n=s.length();
        String rev="";
        for ( int i=n-1;i>=0;i--){
            rev=rev+s.charAt(i);
        }
        if(s.equals(rev)){
            hs.add(s);
        }
    }
    void print(){
        for(String ss:hs){
            System.out.println(ss);
        }
    }
    public static void main(String[] args){
        String s="abbaa";
        PossiblePalindrome p=new PossiblePalindrome();
        int len=s.length();
        for(int i=0;i<len-1;i++){
            for(int j=i+1;j<=len;j++){
                p.isPalindrome(s.substring(i,j));
            }
        }
        p.print();
    }
}
