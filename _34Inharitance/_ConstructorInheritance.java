package _34Inharitance;
import java.util.Scanner;
class Bse1{
    Bse1(){
        System.out.println("I am a Constructor of Bse Class ");

    }
    Bse1(int a){
        System.out.println("I am a Constructor With Arguments and overloaded cons");
    }
    public int x;

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }
}
class Base1 extends Bse1{
    Base1(int x){
        System.out.println("I am a Constructor of Base1 "+x);


    }
    Base1(){
        //super(0);  extend Bse ka Argumenets wala constructor ko call krta h supper keywords ka use
        System.out.println("I am a Constructor Without Argu.......");
    }
    Base1(int x, int y){
        super(x);
        System.out.println("I am a Overloaded Constructor of Base1 class"+y);
    }
    int a;
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
}
public class _ConstructorInheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       //Bse1 a = new Bse1(2);
        //Bse1 a = new Bse1();
        //Base1 b1 = new Base1(1);
        //Base1 b2 = new Base1();
        Base1 b3 = new Base1(2,4);

    }
}
