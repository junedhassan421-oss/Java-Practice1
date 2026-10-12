package _10_Recursion_And_Backtracking;
import java.util.Scanner;
public class _22_Encoding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String int : ");
        String str = sc.nextLine();

        printencoding(str,"");
    }
    public static void printencoding(String q , String asf){
        if (q.length()==0){
            System.out.println(asf);
            return;
        }
        // agr ek charecter h to bina back/recu
        else if (q.length()==1){
            char ch = q.charAt(0);
            if (ch == '0') return;
            else{
                int chv = ch - '0';
                char code = (char)('a'+chv -1);  // type casting
                //asf = asf + code;
                System.out.println(asf+code);
            }
        }
        else {
            char ch = q.charAt(0);
            String roq = q.substring(1);
            if (ch == '0') return;
            else{
                int chv = ch - '0';
                char code = (char)('a'+chv -1);
                printencoding(roq,asf+code);
            }
            String ch12 = q.substring(0,2);
            String ch2_ = q.substring(2);

            int ch12v = Integer.parseInt(ch12);
            if (ch12v <= 26){
                char code = (char) ('a'+ch12v-1);  // type casting
                printencoding(ch2_,asf+code);
            }
        }
    }
}
