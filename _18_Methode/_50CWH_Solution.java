package _18_Methode;
import java.util.Random;
import java.util.Scanner;
class game{
    public int number;
    public int inputeno;
    public  int noOfGuest = 0;
    public int getNoOfGuest() {
        return noOfGuest;
    }

    public void setNoOfGuest(int noOfGuest) {
        this.noOfGuest = noOfGuest;
    }
    game(){
        Random rand = new Random();
        this.number = rand.nextInt(100);
    }
    void takeuserinpute(){
        System.out.println("Guest the number :  ");
        Scanner sc = new Scanner(System.in);
        inputeno = sc.nextInt();
    }
    boolean iscorrectno(){
        noOfGuest++;
        if (inputeno==number){
            System.out.format("Yes you guessed it right it was %d\n you guessed it in %d attempt ", number,noOfGuest);
            return true;
        } else if (inputeno<number) {
            System.out.println("Too low....");
        }
        else System.out.println("Too high.... ");
        return false;
    }
}
public class _50CWH_Solution {
    public static void main(String[] args) {
        game g = new game();
        boolean b = false;
        while (!b){
            g.takeuserinpute();
            b = g.iscorrectno();
            System.out.println(b);

        }

    }
}
