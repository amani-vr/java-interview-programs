package gfg;

import java.util.HashSet;

public class CommonElement {
    public static void main(String[] args) {
        HashSet<Integer> hs=new HashSet<>();
        int a[]={1,3,4,2,6};
        int b[]={4,3,6,7,6};
        for(int i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++){
                if(a[i]==b[j]){
                    hs.add(a[i]);
                }
            }
        }
        for(Integer ele:hs){
            System.out.print(ele+" ");
        }
    }
}
