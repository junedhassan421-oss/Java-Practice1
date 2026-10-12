package _38PracticeSet;
import java.util.Scanner;
class Circle{
    public  int radius;
    Circle(){
        System.out.println("I am not parameterised circle : ");
    }
    Circle(int r){
        System.out.println("I am Circle Parameterised Constructor");
        this.radius = r;
    }
    Circle(int r , int val){
        System.out.println("i am a 2 variable Circle Parameterised Constructor");
    }
    public double area(){
        return Math.PI*this.radius*radius;
    }
}
class cylinder extends Circle{
    public int height;
    cylinder(int r, int h){

        //this.radius = r; // super keyword ko nhi use krne pr defout / empty constructor ko call krta h
        super(r);  //
        System.out.println("I am Cylinder Parameterised Constructor");
        this.height = h;
    }
    public double Volume(){
        return Math.PI*radius*radius*height;
    }
}
public class _02PracticeSetSolution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Circle ob1 = new Circle(20);
        //ob1.radius(20);
        cylinder cy1 = new cylinder(12,4);
       // System.out.println(ob1.radius);

//        System.out.println(cy1.radius);
//        System.out.println(cy1.Volume());
//        System.out.println(cy1.area());
        System.out.println(cy1.Volume());

    }
}
