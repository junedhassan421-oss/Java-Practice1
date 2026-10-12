package _37DynamicMethodeDisBatch;
import java.util.Scanner;
import java.util.Random;
class Game{
    private int number;
    public int inputenumber;
    private int numberGuess;

    public void setNumberGuess(int numberGuess) {
        this.numberGuess = numberGuess;
    }
    void Game(){
        Random rand = new Random();
        this.number = rand.nextInt(100);
    }

    int takeUserInput(){
        System.out.println("Guess The Number : ");
        Scanner sc = new Scanner(System.in);
        return  inputenumber = sc.nextInt();
    }
    boolean IsCarrectNumber(int num){
        if(num == number){
            return true;
        } else if (num<number) {
            System.out.println("To Low : ");
        } else if (num>number) {
            System.out.println("To High : ");
        }
        return false;

    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumberGuess() {
        return numberGuess;
    }
}
public class _SOlution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Game g1 = new Game();
        //g1.inputenumber()
        int num = g1.takeUserInput();
        g1.Game();

        boolean b = g1.IsCarrectNumber(num);
        System.out.println(b);
        System.out.println( g1.getNumber());
        System.out.println(g1.getNumberGuess());
        System.out.println(g1.getNumber());
        //g1.setNumberGuess(4);
    }
}
