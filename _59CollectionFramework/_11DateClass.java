package _59CollectionFramework;
import java.util.Date;
import java.util.Scanner;
public class _11DateClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //System.out.println(long.MAX_VALUE);

        /*System.out.println(Long.MAX_VALUE);
        System.out.println(System.currentTimeMillis());*/

        Date d =  new Date();
        System.out.println(d);
        System.out.println(d.getTime());
        System.out.println(d.getYear());
        System.out.println(d.getDay());
        System.out.println(d.getClass());

    }
}
