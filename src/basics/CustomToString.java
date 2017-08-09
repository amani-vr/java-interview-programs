package basics;

/**
 * Created by amani on 8/8/17.
 * Demonstrate toString() override method.
 */
public class CustomToString{
    public static void main(String[] args) {
        Pair pair = new Pair(1, 2);
        System.out.println("pair = " + pair.toString() + "\nhashCode: " + Integer.toHexString(pair.hashCode()));
    }
}

class Pair{
    int x;
    int y;
    public Pair(){

    }
    Pair(int _x, int _y){
        this.x = _x;
        this.y = _y;
    }

    @Override
    public String toString(){
        return "(" + this.x +", " +  this.y + ")" ;
    }
}
