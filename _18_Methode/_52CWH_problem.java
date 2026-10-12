package _18_Methode;

class rectangle{
    public int l;
    public int b;
    rectangle(int l, int b){
        System.out.println("I am rectangle parameter of constractor : ");
        this.b = b;
        this.l = l;
    }
    public double area(){
        return l*b;
    }
}
class perimeterrac extends rectangle{
    perimeterrac(int l, int b){
        super(l,b);
        //super(b);
        System.out.println("I am rectangle perimeter of constractor");

    }
    public  double perimer(){
        return 2*(l+b);
    }
}
public class _52CWH_problem {
    public static void main(String[] args) {
        // 1.> Create Rectangle Use Inheritance
        // 2.> Create methode foe Area of volume,and getter and setter
        perimeterrac obj = new perimeterrac(2,5);
        //System.out.println(obj.area());
        //System.out.println(obj.perimer());

    }
}
