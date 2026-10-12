package _52ThreadMethod;
import java.util.Scanner;
// Thread.interrupted();
// Ye current thread ka interrupt status check karta hai aur status ko clear bhi kar sakta hai.
// isInterrupted() aur interrupted() ko confuse mat karna.
/*
* | Method                 | Kis thread ko check karta hai? | Status clear? |
| ---------------------- | ------------------------------ | ------------- |
| `isInterrupted()`      | Specific thread                | ❌             |
| `Thread.interrupted()` | Current thread                 | ✅             |
*/

class Thrd1 extends Thread{
    public void run(){
        int i = 0;
        while(i<25){
            System.out.println("Thread you " + this.getName());
            try {
                Thread.sleep(455); // Thread ko kuch time ke liye pause karta hai.Thread.sleep(1000); 1000 ms = 1 second
            } catch (InterruptedException e) {
                //throw new RuntimeException(e);
                e.printStackTrace();
            }
            i++;
        }

    }
}

class Thrd2 extends Thread{
    public void run(){
        int i = 0;
        while (i<15){
            System.out.println("Thanks for using Thread");
            i++;
        }
    }
}
public class _03InterruptMethode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Thrd1 t1 = new Thrd1();
        Thrd2 t2 = new Thrd2();
        t1.start();
        t2.start();

    }
}
