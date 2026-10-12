package _18_Methode;
class circle{
    public int radius;
    circle(int r){
        System.out.println("I am  circle parameterize constractor ");
        this.radius = r;
    }
    public double area(){
        return Math.PI*this.radius*this.radius;
    }
}

class Cylander1 extends circle{
    public int height;
    //public int radius;
    Cylander1(int r,int h){
        /*this.radius = r;
        this.height = h;*/
        super(r);
        System.out.println("I am Cylander1 parameterize  constractor ");
        //this.radius = r;
        this.height = h;

    }

    public double volume(){
        return Math.PI*this.radius*this.radius*this.height;
    }
}
public class _51CWH_Practice {
    public static void main(String[] args) {
        /*circle obj = new circle(12);
        System.out.println(obj.area());*/

        Cylander1 obj1 = new Cylander1(12,4);
        System.out.println(obj1.volume());

    }
}
