package _51ThreadPriorities;
import java.util.Scanner;
class Thr1 extends Thread{
    public Thr1(String name){
        super(name);
    }
    public void run(){
        int i = 35;
        while(i>25){
            System.out.println("Thread you " + this.getName());
            i--;
        }
        //System.out.println("Thread you " + this.getName());
        /*while (true){
            System.out.println("Thread you " + this.getName());
        }*/
    }
}
public class _01ThreadPrioritize {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*Ready Queue : T1 T2 T3 T4 T5*/

        // Background Information : Java Thread
        // java.long.Thread.MIN_PRIORITY = 1
        // java.long.Thread.NORM_PRIORITY = 5
        // java.long.Thread.MAX_PRIORITY = 15

        Thr1 T1 = new Thr1("Junaid1");
        Thr1 T2 = new Thr1("Junaid2");
        Thr1 T3 = new Thr1("Junaid3");
        Thr1 T4 = new Thr1("Junaid4");
        Thr1 T5 = new Thr1("Junaid5 (Most priorities)");

        T5.setPriority(Thread.MAX_PRIORITY);
        T1.setPriority(Thread.MIN_PRIORITY);
        T2.setPriority(Thread.MIN_PRIORITY);
        T3.setPriority(Thread.MIN_PRIORITY);
        T4.setPriority(Thread.MIN_PRIORITY);

        T1.start();
        T2.start();
        T3.start();
        T4.start();
        T5.start();

    }
}
