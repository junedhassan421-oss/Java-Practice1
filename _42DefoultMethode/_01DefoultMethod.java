package _42DefoultMethode;
import java.util.Scanner;
// Interface me Defaults Method hota h
interface BiCycle{
    // private fun ko nhi acess kr sakta or nahi ise override kr sakte inherite class se
    // agr public hota to AvonCycle me Override krna Jaroori ho jata nhi to Erro ata
    private void greet(){  // is fun class se inherite to h leki class waha iska fun nhi bna h  isi kran isko main class se acess nhi ki ja sakta lekin Defoults Function withowt Any Condition Main Fun ke obj se acees kia ja sakta
        System.out.println("Good Morning ");
    }
    int a = 12;
    void ApplyBreak(int decrease);
    void Speadup(int increase);

    String[] grtspeadNo();

    default void DownBrreak(){
        System.out.println("Break Down Bike >>>>>>>>>>>>>..");
    }
}
interface HornBiCycle{
    int x = 15;
    void BlueHorn();
    void BlackHorn();

    default void Breaks(){  /// isko Override krne ke jarurat nhi h agr krna chahte to kr bhi sakte ho but agr class implements se override kiye to wha ke caall lagega main fun se agr override nhi kiye to main fun se interface claas me call lagega
        System.out.println("Speading Slowely.................");
    }

}
class Cycle1{

    void Speadup(int num){
        System.out.println("Cycle Number : "+ num);
    }
    void  PickCycle(){
        System.out.println("Running Cycle >>>>>>>>>>>>");
    }
}
class AvonCycle extends Cycle1 implements BiCycle,HornBiCycle{
    public void ApplyBreak(int decrease){
        System.out.println("Apply Break :"+ decrease);
    }
    public void Speadup(int increase){
        System.out.println("Break Down "+ increase);
    }
    public void BlueHorn(){
        System.out.println("Horn PI>>>>>>>>>>>>Pi");
    }
    public void BlackHorn(){
        System.out.println("BlackHorn>>>>>>>>>>>>>>>>Pi");
    }
    public String[] grtspeadNo(){
        System.out.println("Geting Break Spead ");
        String[] speads = {"Speadup","SpeadDown","SpeadFast","SpeadSlow"};
        return  speads;
    }
    public void DownBrreak(){
        System.out.println("Break Down Bike >>>>>>>>>>>>>..from Class");
    }
    // Own Properties
    void ownpre(){
        System.out.println("Please Spead Slowly >>>>>>>>>>>>>>>.");
    }
}
public class _01DefoultMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        AvonCycle obj = new AvonCycle();
        obj.ApplyBreak(8);

        String[] str =  obj.grtspeadNo();
        System.out.println(str);

        obj.DownBrreak();

        obj.Breaks();

    }
}
