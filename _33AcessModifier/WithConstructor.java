package _33AcessModifier;
import java.util.Scanner;
class cylinder1{
    int radius;
    int height;
    cylinder1(int r, int h){
        radius = r;
        height = h;
    }
    public void area(){
        System.out.println(Math.PI*radius*radius*height);
    }
}
class rectangle{
    private int length;
    private  int breadth;

    public rectangle(){
        this.breadth = 5;
        this.length = 4;
    }
    public rectangle(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }

    public int getBreadth() {
        return breadth;
    }

    public int getLength() {
        return length;
    }
}
public class WithConstructor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        cylinder1 cy1 = new cylinder1(12,15);
        cy1.area();



        rectangle rec = new rectangle();
        System.out.println(rec.getBreadth());
        System.out.println(rec.getLength());

        rectangle r = new rectangle(40,50);
        System.out.println(r.getBreadth());
        System.out.println(r.getLength());
    }
}
