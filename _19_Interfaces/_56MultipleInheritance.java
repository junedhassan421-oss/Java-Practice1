/*package _19_Interfaces;
interface Bicycle {
    int a = 5;
    void appleBreak(int document);
    void speadum(int icecream);
}
interface HornBycle{
    public int x = 45;
    int h = 75;
    void BlueHoen();
    void BlueHorn();
}
class AvonCycle implements Bicycle{
    public int x = 5;
}
class AvonCycle extends Bicycle{
class AvonCycle implements Bicycle,HornBycle{
    void blueHorn(){
        System.out.println("pre pre poo poo");
    }
    public void applybreak(int decreament){
        System.out.println("Applying break");
    }
    public void speedup(int increament){
        System.out.println("Applying speedup");
    }
    public void BlueHoen(){
        System.out.println("junaid hassan");
    }
    public void BlueHorn(){
        System.out.println("Main hoon Horn po po po ");
    }

}
class  AvonCycle2 implements HornBycle{
    void blueHorn1(){
        System.out.println("pre pre poo poo");
    }
    public void blueHoen(int decreament){
        System.out.println("Applying break");
    }
    public void blueHorn(int increament){
        System.out.println("Applying speedup");
    }
}
public class _56MultipleInheritance {
    public static void main(String[] args) {
        AvonCycle cycle = new AvonCycle();
        cycle.applybreak(1);
        you can create properties in interface
        System.out.println(AvonCycle.a);
        System.out.println(cycle.a);
        //you can not modify the properties in interfaces as they are final
        cycle.a  = 6;
        System.out.println();
        System.out.println(cycle.x); // interface hornBycle class to overwritte in our classes AvonBycle
    }
}*/
