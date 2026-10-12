package _34Inharitance;
import java.util.Scanner;
class Base{
    int x;
    public int getX(){
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public void print(){
        System.out.println("I am a Constructor :  ");
    }
}
class derive extends Base{ // all properties of Base Class Inherit in Derive class
    int y;
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
}
public class _01Inheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        derive d1 = new derive();
        d1.setX(14);
        int x =  d1.getX();
        System.out.println(x);
        d1.setY(25);
        System.out.println(d1.getY());
        /*Base b = new Base();
        b.getY()*/
    }
}
