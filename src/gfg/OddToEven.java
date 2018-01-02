package gfg;

public class OddToEven {
    public static void main(String[] args) {
        StringBuilder s=new StringBuilder("13645");
        int count=0;
        int index=-1;
        int len=s.length();
        for(int i=0;i<len-1;i++){
            int a=(int)s.charAt(i);
            if(a%2==0){
                if(count==0){
                    index=i;
                    count++;
                }
                else if(s.charAt(index)>s.charAt(i)){
                    index=i;
                }
            }
        }
        char temp=s.charAt(index);
        s.setCharAt(index,s.charAt(len-1));
        s.setCharAt(len-1,temp);

        System.out.println(s);
    }
}
