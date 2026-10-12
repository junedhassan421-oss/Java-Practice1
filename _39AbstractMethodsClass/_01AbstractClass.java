package _39AbstractMethodsClass;
import java.util.Scanner;
abstract class base1{
    public base1(){
        System.out.println("Main base1 ka constructor hoo");
    }
    public long sayline(){
        System.out.println("Hellow ");
        return 0;
    }
 //    abstract public void greet(){
//        System.out.println("Good morning : ");
//    }
    public void greed(){
        System.out.println("Good morning : ");
    }
    abstract  public long greet1();
    abstract  public void greet2();
}
/*abstract class hello{

}*/
class base2 extends base1 /*extends hello*/{
    @Override
    public long greet1(){
        System.out.println("Good morning greet1 : ");
        return 0;
    }
    @Override
    public void greet2(){
        System.out.println("Good morning greet2 : ");
    }
}
abstract class base3 extends base2{
    public void th(){
        System.out.println("I am Good : ");
    }
}
public class _01AbstractClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Existing a thought or as an idea without Concrete Existence
        // Abstract Method -> A methode that is declared without an implementation abstract void move to ( double x, double y)
        // Abstract Class -> If a class includes abstract method then the class itself must be declared abstract as in // ek bhi abstract method class me hoga to wo pura class ko abstract class bna deta h

        //base1 ob = new base1();
        /*base1 ob1 = new base1() {  // abstract class ka object nhi banega uske sahayta se class bna kr uske objects bnaya ja sakta h // absract class se sirf class banta h
            @Override
            public void greet1() {

            }

            @Override
            public void greet2() {

            }
        }*/

        base2 ob2 = new base2();
        System.out.println(ob2.greet1());
        System.out.println(ob2.sayline());
    }
}
