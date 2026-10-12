package _66AdvanceJava;
import java.util.Scanner;
class myDeprecated{
    @Deprecated
    void  math1(){
        System.out.println("Junaid Math1");
    }
}
interface myinterface{
    void display();
}
public class _01AdvanceJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        myDeprecated ob = new myDeprecated();
        ob.math1();
        //ob.equals(12);

       /* myinterface int = new myinterface(){
            @Override;
            public void display(){
                System.out.println("I am Displayed : ");
            }
        }*/

        myinterface i = ()-> System.out.println("I am displayed");
    }
}
