package _000String;
import java.util.Scanner;
public class _05ChangeTheString {
    public static String changetheString(String s){
        /*if(s[0] >= 'A' && s[0] <= 'Z') {

            for(int i = 0; i < s.length(); i++) {
                s[i] = toupper(s[i]);
            }
        }
        else {

            for(int i = 0; i < s.length(); i++) {
                s[i] = tolower(s[i]);
            }
        }

        return s;*/
        char ch = s.charAt(0);

        int num = (int)ch;

        if(num>97){
            return s.toUpperCase();
        }
        else{
            return s.toLowerCase();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String s = sc.nextLine();

        System.out.println(changetheString(s));

    }
}
