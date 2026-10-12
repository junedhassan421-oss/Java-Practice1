package _45JavaPracticeSet;
import java.util.Scanner;
abstract class Pen{
    abstract void Write();
    abstract void refil();
    void myfun(){  // allowed h
        System.out.print("Hell Dosto : ");
    }
}
abstract class book{
    abstract void notepage();
    abstract void mat();
}
interface myinterface{
    void print();
    /*void printsat(){  // not allowed
        System.out.print("Hello Guys : ");  // not allowed
    }*/
}
/*class fountainpen extends Pen,book{ // ek se jyada absract class not allowed
    void Write(){

    }
    void refil(){

    }
    void notepage(){
        System.out.println("Smooth pages");
    }
    void mat(){
        System.out.println("Classmat");
    }
}*/
class fountainpen extends Pen{ // ek se jyada absract class not allowed
    void Write(){
        System.out.println("Print Allen Write");
    }
    void refil(){
        System.out.println("Write");
    }
    void changedNib(){
        System.out.println("Changing the Nib>>>>>>>>>>>>>>>>>>");
    }

}
public class _01AbstractClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        fountainpen obj = new fountainpen();
        obj.myfun();
        obj.changedNib();
        obj.refil();
    }
}
