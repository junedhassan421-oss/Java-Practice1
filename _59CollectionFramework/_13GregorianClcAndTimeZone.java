package _59CollectionFramework;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.TimeZone;

public class _13GregorianClcAndTimeZone {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Calendar c = new GregorianCalendar();
        Calendar d = Calendar.getInstance();
        System.out.println(c.getTime());
        System.out.println(d.getTime());
        System.out.println(c.get(Calendar.DATE));
        System.out.println(c.get(Calendar.HOUR));
        System.out.println(c.get(Calendar.HOUR_OF_DAY));
        System.out.println(c.get(Calendar.HOUR_OF_DAY) +":"+c.get(Calendar.MINUTE));

        GregorianCalendar gc = new GregorianCalendar();
        System.out.println(gc.isLeapYear(2026));

        System.out.println(TimeZone.getAvailableIDs()[0]);
        System.out.println(TimeZone.getAvailableIDs()[1]);
        System.out.println(TimeZone.getAvailableIDs()[2]);
        System.out.println(TimeZone.getAvailableIDs()[3]);
    }
}
