package _000String;
import java.util.Scanner;
public class _04CompareString {
    public static int CampareStr(String str1, String str2){
        int s1 = str1.length();
        int s2 = str2.length();

        int i =0,j=0;
        int ans = 0;
        while(i<s1 && j<s2){
            char ch1 = str1.charAt(i);
            char ch2 = str2.charAt(j);
            if(ch1 == ch2){
                i++;
                j++;
            } else{
                ans = ch1-ch2;
                break;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st String : ");;
        String s1;
        s1 = sc.nextLine();
        System.out.println("Enter the 2nd String : ");
        String s2;
        s2 = sc.nextLine();
        System.out.println(CampareStr(s1,s2));
    }
}
