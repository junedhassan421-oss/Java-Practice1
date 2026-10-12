package _44PolymorphismInInterface;
import java.util.Scanner;
interface mycamera2{
    void takecare(int n);
    void takesnap();
    void recordvideo();

    private void greet(){
        System.out.println("Good morning ");
    }
    default void record4kvideos(){
        greet();
        System.out.println("Recording in 4k.......");
    }
}
interface  muwife2{
    String[] getNetworks();
    void connectToNetwork(String network);
}
class mycellphone2{
    void cellnumber(int phoneNumber){
        System.out.println("Calling "+ phoneNumber);
    }
}
class mySmartphone2 extends mycellphone2 implements mycamera2,muwife2{
    public void takecare(int n){
        System.out.println("Take Care of Yourself at : "+ n);
    }
    public void takesnap() {
        System.out.println("Talking Snap......");
    }
    public void recordvideo(){
        System.out.println("Calling Video ........");
    }
    public String[] getNetworks(){
        System.out.println("getting list of network :");
        String[] networklist = {"junaid", "Sohail", "Ravindra"};
        return networklist;
    }
    public void connectToNetwork(String network){
        System.out.println("Connecting to "+ network);
    }
    public void sample(){
        System.out.println("This method of Smartphone2................");
    }
    public void record4kvideos(){
        System.out.println("Recording in 4k.......");
    }
}
public class _01Polymorphism {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        mycamera2 cam1 = new mySmartphone2();  // this is a smartphone but used camera
       // cam1.getNetworks();  // not Allowed
        cam1.record4kvideos();


        mySmartphone2 obj = new mySmartphone2(); // this is smartphone used every method
        obj.record4kvideos();
    }
}
