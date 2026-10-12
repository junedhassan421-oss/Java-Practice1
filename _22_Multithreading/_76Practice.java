package _22_Multithreading;
import java.time.Duration;
import java.util.*;
import java.util.Scanner;
class practice1 extends Thread{
    public void run(){
        /*while (true){
            System.out.println("Good Morning : ");
        }*/
    }
}
class practice2 extends  Thread{
    public void run(){
        while (true){
            /*try{
                //Thread.sleep(Duration.ofMillis(200));
                // Pause the main thread for 1000 milliseconds (1 second)
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // Restore the interrupted status
                Thread.currentThread().interrupt();
                System.out.println("The thread was interrupted!");
            }
            }*/
            try{
                Thread.sleep(10);
            } catch (Exception e){
                System.out.println(e);
            }
            System.out.println("Welcome");
        }
    }
}
public class _76Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        practice1 p1 = new practice1();
        practice2 p2 = new practice2();

        System.out.println(p1.MAX_PRIORITY);
        System.out.println(p1.MIN_PRIORITY);
        System.out.println(p1.NORM_PRIORITY);

        System.out.println(p1.getPriority());
        System.out.println(p2.getPriority());


        p1.setPriority(6);
        p2.setPriority(9);


        System.out.println(p1.getPriority());
        System.out.println(p2.getPriority());

        System.out.println(p1.getState());

        p1.start();
        //p2.start();
        System.out.println(p1.getState());
//        System.out.println(Thread.currentThread());
        System.out.println(Thread.currentThread().getState());
        System.out.println(Thread.currentThread().getPriority());


    }
}
