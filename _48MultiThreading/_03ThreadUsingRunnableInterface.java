package _48MultiThreading;
import java.util.Scanner;

class mythreadrunnable1 implements Runnable{
    public void run(){
        System.out.println("I am a Thread1 >>>>>>>>>>>>>>>>");
        while (true){
            System.out.println("Hello Thread1");
        }
    }
}
class mythreadrunnable2 implements Runnable{
    public void run(){
        System.out.println("I am a Thread2 >>>>>>>>>>>>>>>>");
        while (true){
            System.out.println("Hello  Thread2");
        }
    }
}
public class _03ThreadUsingRunnableInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*mythreadrunnable1 obj1 = new mythreadrunnable1();
        mythreadrunnable2 obj2 = new mythreadrunnable2();

        obj1.star();
        obj2.star();*/

        mythreadrunnable1 bullet1 = new mythreadrunnable1();
        Thread gun1 = new Thread(bullet1);

        mythreadrunnable2 bullet2 = new mythreadrunnable2();
        Thread gun2 = new Thread(bullet2);

        gun1.start();
        gun2.start();
    }
}
