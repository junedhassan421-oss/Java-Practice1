package _48MultiThreading;
import java.util.Scanner;
class mythread1 extends Thread{
    public void run(){
        /*while (true){
            System.out.println("Thread1>>>>>>>>>>>>....: ");
            System.out.println("I am Sad>>>>>>>>>>>>>>>>>");
        }*/
        int i = 0;
        while (i<100){
            System.out.println("Thread1>>>>>>>>>>>>....: ");
            System.out.println("I am Sad>>>>>>>>>>>>>>>>>");
            i++;
        }
    }
}
class mythread2 extends Thread{
    public void run(){
        int i = 0;
        while (i<20){
            System.out.println("Thread2 >>>>>>>>>>>>>>>>>>>: ");
            System.out.println("I am Happy >>>>>>>>>>>>>>>>>>");
            i++;
        }
    }
}
public class _02ThreadByExtending {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        mythread1 obj1 = new mythread1();
        obj1.start();
        /*obj1.run();*/
        mythread2 obj2 = new mythread2();
        obj2.start();
        //obj2.run();
    }
}
