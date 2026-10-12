package _33AcessModifier;
import java.util.Random;
import java.util.Scanner;
public class _03Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 0 for back , 1 for paper, 2 for Scissor : ");
        int userinput  = sc.nextInt();

        Random rnadom = new Random();
        int computerinpute = rnadom.nextInt(3);
        System.out.println(computerinpute);

        if (userinput == computerinpute){
            System.out.println("Drow :" );
        }
        else if (userinput == 0 && computerinpute ==2 || userinput == 1 && computerinpute == 0 || userinput == 2 && computerinpute == 1){
            System.out.println("You Win : ");
        } else{
            System.out.println("Computer Win : ");
        }
    }
}
