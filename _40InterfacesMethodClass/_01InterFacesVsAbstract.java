package _40InterfacesMethodClass;
import java.util.Scanner;
// Abstract class ka sara properties ko follow krta h interface class
interface /*class*/ base1{  // abstract class or interface me defftent : interface ko ek se jyada implement kia ja sakta h
    // ek class ko extent kr sakte ho abstract me ek parents se ek hi child bnega lekin yaha pr bahut sare
    // interfaces ko ek sath implements kr ke ek class bnaaya ja sakta h
    // interface group of method
    int a = 50;
    void ApplyBreak(int decrement);
    void Speadup(int increment);
}
interface base2{
    void move(int start);
}
interface HornBicycle{
    void BlueHorn();
    void RedHorn();
}
class AvonCycle implements base1,base2,HornBicycle{
    // base1,base2,HornBicycle dono ka sara method ko class Avon me implements krana padega with public nhi to error dega
    void blowHoran(){
        System.out.println("PI PI ");
    }
    public void  ApplyBreak(int decrement){
        System.out.println("ApplyBreak");
    }
    public void Speadup(int increment){
        System.out.println("SpeadUp");
    }
    public void move(int s){
        System.out.println("Lets go ");
    }
    public void BlueHorn(){
        System.out.println(" BlueHorn");
    }
    public void RedHorn(){
        System.out.println("RedHorn");
    }
}
public class _01InterFacesVsAbstract {
    /* Interfaces is the points where two system mat and interact Each other */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //base1 ob1 = new base1();

        // you can create properties in interfaces
        AvonCycle ob = new AvonCycle();
        ob.ApplyBreak(1);
        System.out.println(ob.a);

        // you can not create properties in interface

        /*ob.a = 7;
        System.out.println(ob.a);*/
        System.out.println(ob.a);

    }
}
