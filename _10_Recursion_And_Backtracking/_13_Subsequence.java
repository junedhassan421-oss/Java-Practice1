package _10_Recursion_And_Backtracking;
import java.util.ArrayList;
import java.util.Scanner;
public class _13_Subsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str = sc.nextLine();
        ArrayList<String> res = gss(str);
        System.out.println(res);
    }
    public static ArrayList<String> gss(String str ){
        if (str.length()==0){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        char ch = str.charAt(0);
        String ros = str.substring(1);
        ArrayList<String> rres = gss(ros);

        ArrayList<String> mres = new ArrayList<>();
        /*for (String rstr : rres){
            mres.add(""+rstr);
            mres.add(""+ch + rstr);
        }*/
        for (String rstr : rres){
            mres.add(""+rstr);

        }
        for (String rstr : rres){
            mres.add(""+ch + rstr);
        }
        return mres;
    }
}
