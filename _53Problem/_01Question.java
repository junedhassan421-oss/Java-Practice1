package _53Problem;
import java.util.Scanner;
class practice1 extends Thread{
    public void run(){
        int i = 0;
        while (i<10){
            System.out.println("Hello Junaid : ");
            i++;
        }
        /*while (true){
            System.out.println("Junaid");
        }*/
    }
    public void run1(){
        int i = 0;
        while (i<10){
            System.out.println("Hello Junaid : ");
            i++;
        }
    }
}
class practice2 extends Thread{
    public void run(){

        System.out.println("Hello Hassan : ");
        /*while (true){
            System.out.println("Hello Junaid : ");
            try {
                Thread.sleep(45000);
            }catch (Exception e){
                System.out.println(e);
            }
        }*/
    }
    public void run2(){
        System.out.println("Welcom Junaid");
    }
}
public class _01Question {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        practice1 p1 = new practice1();
        //p1.run();
        //p1.start();

        //p1.start();

        practice2 p2 = new practice2();

        p1.setPriority(6);
        p2.setPriority(12);
        /*p2.start();
        p1.start();*/

        System.out.println(p2.getPriority());
        System.out.println(p1.getPriority());
        System.out.println(p2.getState());
        System.out.println(Thread.currentThread().getState());
        p2.start();
        p1.start();
        //System.out.println(Thread.currentThread().getName());
        //System.out.println(Thread.currentThread().getState());
    }
}
