package _10_Recursion_And_Backtracking;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _21_Permutation {
    public static void permutation(String str , String newstring, List<String> list){
        if (str.equals("")){
            list.add(newstring);
            /*return list;*/
            return;
        }
        for (int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            String rem = str.substring(0,i)+str.substring(i+1);
            permutation(rem,newstring+ch,list);
        }
    }
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the String : ");
            String str = sc.nextLine();
            ArrayList<String> list = new ArrayList<>();
            permutation(str,"",list); // pass by refraance

        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i)+" ");
        }


    }
}
