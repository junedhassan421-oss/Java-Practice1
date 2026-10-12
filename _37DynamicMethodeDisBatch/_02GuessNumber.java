package _37DynamicMethodeDisBatch;
import java.util.Random;
import java.util.Scanner;
class Game1{
   // public int usenumber;
    private int number;
    void Game(){
        Random rand = new Random();
        this.number = rand.nextInt(100);
    }
    public int getNumber() {
        return number;
    }
    void isCarrect(int usernum){
        if(number == usernum){
            System.out.println("Drow : ");
            return;
        } else if (number>usernum) {
            System.out.println("Computer number greater than UserNumber :");
            return;
        } else if (number<usernum) {
            System.out.println("UserNumber Greater the Computer number : ");
            return;
        }
        else System.out.println("Invalide : ");
    }
}
public class _02GuessNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Guess the number : ");
        int n;
        n = sc.nextInt();
        Game1 obj1 = new Game1();
        obj1.Game();
        obj1.isCarrect(n);
        System.out.println(obj1.getNumber());

    }
}
