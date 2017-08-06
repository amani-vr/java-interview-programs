package basics;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by amani on 8/5/17.
 *
 */
public class RepeatedCharMap {
    public static void main(String[] args) {
        String s="amaniaim";
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(hm.containsKey(ch)){
                int count=hm.get(ch);
                hm.put(ch,++count);
            }
            else{
                hm.put(ch,1);
            }

        }
        /*for(Character ch: hm.keySet()){
            System.out.println("ch = " + ch + " count= "+ hm.get(ch));
        }*/
        for(Map.Entry<Character, Integer> entry : hm.entrySet()){
            System.out.println("ch = " + entry.getKey() + " count= "+ entry.getValue());
        }
    }

}
