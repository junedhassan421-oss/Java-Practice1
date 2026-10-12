package _10_Recursion_And_Backtracking;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class _20_Permutation {
    public static void permutation(String str , String newstring){
        if (str.equals("")){
            System.out.println(newstring);
            return;
        }
        for (int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            String rem = str.substring(0,i)+str.substring(i+1);
            permutation(rem,newstring+ch);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = sc.nextLine();
        permutation(str,"");
    }
}
