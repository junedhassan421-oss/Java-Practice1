package _61AdvancedJavaPracticeSet;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class _01Qn{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //ArrayList<Integer> list = new ArrayList<>();
        ArrayList ar = new ArrayList();
        ar.add("Students 1");
        ar.add("Students 2");
        ar.add("Students 3");
        ar.add("Students 4");
        ar.add("Students 5");
        ar.add("Students 6");
        ar.add("Students 7");
        ar.add("Students 8");
        ar.add("Students 9");
        ar.add("Students 10");

        for (Object o : ar){
            System.out.println(o);
        }

        HashSet<Integer> s = new HashSet<>();
        s.add(1);
        s.add(10);
        s.add(15);
        s.add(20);
        s.add(30);
        s.add(35);
        s.add(1);
        s.add(35);
        System.out.println(s);

        Date d = new Date();
        System.out.println(d.getHours()+":"+d.getMinutes()+":"+d.getSeconds());

        Calendar cal = Calendar.getInstance();
        System.out.println(cal.get(Calendar.HOUR)+":"+cal.get(Calendar.MINUTE)+":"+cal.get(Calendar.SECOND));

        LocalDateTime dt1 = LocalDateTime.now();
        System.out.println(dt1);
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        DateTimeFormatter dt2 = DateTimeFormatter.ISO_LOCAL_DATE;

        String st = dt1.format(df);
        System.out.println(st);


    }
}
