package _10_Recursion_And_Backtracking;
import java.util.Scanner;
public class _18_Subsequence {
    public static void printcc(String str, String ans){
        if (str.length()==0){
            System.out.println(ans);
            return;
        }
        char ch = str.charAt(0);
        String roq = str.substring(1);

        printcc(roq,ans+ch);
        printcc(roq,ans+"");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = sc.nextLine();
        printcc(str,"");

    }
}
