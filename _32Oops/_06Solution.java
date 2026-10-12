package _32Oops;
import java.util.Random;
import java.util.Scanner;
public class _06Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter t 0 for Rock, 1 for paper, ans 2 for Scissor");
        /*row>Scissor
        * paper>rock
        * Scissor>paper*/
        int userInput = sc.nextInt();


        Random random = new Random();
        int computerInpute = random.nextInt();

        if(userInput == computerInpute){
            System.out.println("DROW");
        }
//        else{
//            System.out.println("hey 👋👋");
//        }
        else if(userInput == 0 && computerInpute == 2 || userInput == 1 && computerInpute == 0 || userInput == 2 && computerInpute == 1){
            System.out.println("YOU WIN ");
        }
        else System.out.println("Computer Winner");

    }
}
