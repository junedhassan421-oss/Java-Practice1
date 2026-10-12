package _57FinallyBlock;
import java.util.Scanner;
 // FB Contains the code which is always executed whether the exception is handled or not it is used to execute code continuesly
// instruction to release the system resources. close a Connection etc
// FB me wo code hota h jo hmesa execute hota h chahe exception ko handle kre ya na kre ek aisa code jiska executed hona jaruri h chahe exception aye ya na aye
public class _01FB {
    public static int greet(){
        try {
            int a = 5;
            int b = 0;
            int c = a/b;
            return c;
        } catch (Exception e){
            System.out.println(e);
        }finally {
            System.out.println("This is the end of this program");
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(greet());

    }
}
