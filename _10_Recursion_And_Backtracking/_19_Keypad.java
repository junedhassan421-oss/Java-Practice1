package _10_Recursion_And_Backtracking;
import java.util.Scanner;
public class _19_Keypad {
    static String [] keypad = {".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void printpc(String str , String ans){
        if (str.length()==0){
            System.out.print(ans+" ");
            return;
        }
        char ch = str.charAt(0);
        String roq = str.substring(1);

        String codeforch = keypad[ch-'0'];
        for (int i=0;i<codeforch.length();i++){
            char chc = codeforch.charAt(i);
            printpc(roq,ans+chc);
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String st = sc.nextLine();

        printpc(st,"");

    }
}
