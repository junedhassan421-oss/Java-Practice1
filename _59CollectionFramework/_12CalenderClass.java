package _59CollectionFramework;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.TimeZone;

public class _12CalenderClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*Calendar c = new Calendar() {
            @Override
            protected void computeTime() {

            }
            @Override
            protected void computeFields() {

            }

            @Override
            public void add(int field, int amount) {

            }

            @Override
            public void roll(int field, boolean up) {

            }

            @Override
            public int getMinimum(int field) {
                return 0;
            }

            @Override
            public int getMaximum(int field) {
                return 0;
            }

            @Override
            public int getGreatestMinimum(int field) {
                return 0;
            }

            @Override
            public int getLeastMaximum(int field) {
                return 0;
            }
        }*/
        Calendar cal = new GregorianCalendar();
        System.out.println(cal.equals(890));
        System.out.println(cal.getCalendarType());
        System.out.println(cal.get(Calendar.DAY_OF_WEEK));
        System.out.println(cal.get(Calendar.DAY_OF_MONTH));
        System.out.println(cal.get(Calendar.MONTH));
        System.out.println(cal.getTimeZone());
        System.out.println(cal.getTimeZone().getID());
        Calendar cal2 = Calendar.getInstance(TimeZone.getTimeZone("Asia/Singapore"));
        System.out.println(cal2.getCalendarType());
        System.out.println(cal2.getTimeZone());
        System.out.println(cal2.getTimeZone().getID());
    }
}
