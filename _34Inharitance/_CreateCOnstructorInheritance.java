package _34Inharitance;
import java.util.Scanner;
class Internal{
    int x;
    Internal(){
        System.out.println("I am a Constructor of Base Class : ");
    }
    Internal(int x){
        System.out.println("I am a Overloaded Contructor of Base Clsee : ");
    }
    Internal(int a, int b){
        System.out.println("I am a Overloaded Constructor : ");
    }
}
class External extends Internal{
    int y;
    External(int d){
       //super();
        //super(d);
        super(d,2);
        System.out.println("I am a Constructor of External class ");
    }
}

public class _CreateCOnstructorInheritance {
    public static void main(String[] args) {
      // Internal b = new Internal();
        External b1 = new External(2);

    }
}
