package _37DynamicMethodeDisBatch;
import java.util.Scanner;
class Phone{
    public void Showtime(){
        System.out.println("Good Morning // Time is ATM : ");
    }
    public void on(){
        System.out.println("Turning On Phone : ");
    }
}
class Smartphone extends Phone{
    public void sowagat(){
        System.out.println("Apka Sowagat Hai : ");
    }
    public void on(){
        System.out.println("Turning On SmartPhone : ");
    }
}
public class _01DynamicMethodeDisp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*Phone obj1 = new Phone();
        obj1.name();
        Smartphone obj2 = new Smartphone();
        obj2.name();*/

        Phone obj = new Smartphone(); // object Phone class ka or reference SmartPhone class ka
        //Smartphone obj2 = new Phone(); // Error
        // super ka reference equals hosakta h sub ke reference ke lekin subClass ka reference Equals nhi hosakta h SuperClass ke reference ke
        obj.on();
        obj.Showtime();
        obj.Showtime();
        //obj.sowagat(); not Allow Dynamic methodes dispatch run time pr allowa hota h // refernce h phone ka or objects h smarts phone ka i mean smartphone ko caall phone is liye smart phone ke methodes phone ke name obj se call nhi hoga
    }
}
