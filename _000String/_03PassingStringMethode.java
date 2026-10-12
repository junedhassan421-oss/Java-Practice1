package _000String;
import java.util.Scanner;
public class _03PassingStringMethode {
//    public static void change(String str){
//        str = "hassan";
//    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*String s;
        System.out.println("Enter the String Charecter :  ");
        s = sc.nextLine();
        System.out.println(s);
        change(s);
        System.out.println(s);

        System.out.println("Enter the 1st string : ");
        String str1 = sc.nextLine();
        System.out.println("Enter the 2nd string : ");
        String str2 = sc.nextLine();*/

        //str1 = str1.concat(str2);
        //System.out.println(str1.concat(str2));
        //System.out.println(str1.contains(str2));
        //System.out.println(str1.compareTo(str2));  // junaid // hassan : j-h = 2;   // laxigraphically

        /*String a = "raju";
        String b = "prince";
        System.out.println(a.compareTo(b));
        System.out.println();
        System.out.println(b.compareTo(a));

        String c = "harshmit";
        String d = "harsh";
        System.out.println(c.compareTo(d));
        System.out.println(c.toLowerCase());
        System.out.println(c.toUpperCase());*/

//        str1 = str1+"Hassan";
//        str1 += "Hassan";
        /*str1 += 10000;
        System.out.println(str1);*/

        /*str1 += 'h';
        System.out.println(str1);*/

        //System.out.println(str1+20+30);  // String+integer = Satring
//        System.out.println(str1+(20+30));
//        System.out.println(23+28+str1);  //
        //System.out.println('A'+2+"junaid");

        System.out.println("Enter the Integer : ");
        int n = sc.nextInt();
        /*String S = Integer.toString(n);
        System.out.println(S);*/
        String s = "";
        s += n;
        System.out.println(s);
        /*System.out.println(s instanceof String);
        System.out.println(s.getClass().getSimpleName());*/





    }
}
