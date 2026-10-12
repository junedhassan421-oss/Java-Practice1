package _50ConstructorInThread;
import java.util.Scanner;
class mythr1 extends Thread{
    public mythr1(String name){
        super(name);
    }
    public void run(){
        int i = 5;
        while (i>=0){
            System.out.println("Hellow 👋: " + getName());
            i--;
        }
    }
}
public class _01ConstructorInThread {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        mythr1 obj1 = new mythr1("Junaid");
        //obj1.run();

        obj1.start();
        //obj1.getName();
        //obj1.run();
        System.out.println("The Id of Object obj1 is :" +obj1.getId());

        mythr1 obj2 = new mythr1("Haassan");
        obj2.start();
        System.out.println("The Id of Object obj1 is :" +obj2.getId());



    }
}
