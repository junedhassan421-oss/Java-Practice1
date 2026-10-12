package _52ThreadMethod;
import java.util.Scanner;
// Ek thread ko doosre thread ke complete hone ka wait karwata hai. "Pehle ye thread complete ho jaaye, phir main aage badhunga."
class Thr1 extends Thread{
    public Thr1(String name)
    {
        super(name);
    }
    public void run(){
        int i = 0;
        while(i<25){
            System.out.println("Thread you " + this.getName());
            i++;
        }
        //System.out.println("Thread you " + this.getName());
        /*while (true){
            System.out.println("Thread you " + this.getName());
        }*/
    }
}
class Thr2 extends Thread{
    public void run(){
        int i = 0;
        while (i<15){
            System.out.println("Thanks for using Thread");
            i++;
        }
    }
}
public class _02JoinMethode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Thr1 t1 = new Thr1("Junaid");
        Thr2 t2 = new Thr2();


        t1.start();
        //t1.join(); // jb tk t1 complete nhi hoata t2 start nhi hoga // t1 ko join() use huaa h lekin t1 run time pr hosakta ho ke kill ho chuka ho isliye catch exception key use hoga
        try {
            t1.join();
        }
        catch (Exception e){
            System.out.println(e);
        }
        t2.start();







    }
}
