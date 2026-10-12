package _000String;
import java.util.Scanner;
public class _01CountVowel {
    public static int Count(String s){
        int count = 0;
        for(int i=0;i<s.length()-1;i++){
            char ch  = s.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                count++;
            }
        }
        return  count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.println("Enter the string : ");;
        str = sc.nextLine();
        System.out.println(Count(str));
    }
}
