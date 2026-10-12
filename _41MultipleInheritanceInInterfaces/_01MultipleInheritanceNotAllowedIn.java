package _41MultipleInheritanceInInterfaces;
import java.util.Scanner;
interface BiCycle{
    int a = 12;
    void ApplyBreack(int decrease);
    void Speadup(int increase);
}
interface HornBiCycle{
    int x = 15;
    void BlueHorn();
    void BlackHorn();

}
class AvanCycle implements BiCycle,HornBiCycle{
    // Veriable ko Override krne ke jaroorat nhi hota kr bhi sakte ho or nhi bhi
    int x = 5;

    // but fun ko interface me override krna jaroori ho jata h
    public void BlueHorn(){
        System.out.println("Pee. Pee >>>>>>>>");
    }
    public void BlackHorn(){
        System.out.println("Pe,,,Pe..............");
    }
    public void ApplyBreack(int decrease){
        System.out.println("Apply DisBreak ...");
    }
    public void Speadup(int increase){
        System.out.println("Apply Break.................");
    }
}
public class _01MultipleInheritanceNotAllowedIn {
    // Java Does not Support Multiple Inheritance is Directed in java // cpp me allowed h
    // java me multiple  interface or abstract bna kr class me multiple interfec or abstract include kr used kr sakte h
    // isi kran cpp me interface or abstract nhi h waha multiple inheritance allowed h direct class se // class to class
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        AvanCycle ob = new AvanCycle(); // all properties Access
        ob.ApplyBreack(4);


        BiCycle ob1 = new AvanCycle(); // only BiCycle ke properties used hoga
        ob1.Speadup(1);


        //ob1. BlueHorn();  Not ALlowed



    }
}
