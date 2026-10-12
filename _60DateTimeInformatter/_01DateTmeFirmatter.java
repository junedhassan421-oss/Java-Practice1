package _60DateTimeInformatter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class _01DateTmeFirmatter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);
        //System.out.println(dt.atZone());

        /*DateTimeFormatter dtr = DateTimeFormatter.ofPattern("DDD-MMM-YYYYY");
        String mydate = dt.format(dtr);
        System.out.println(mydate);*/

       /* DateTimeFormatter dtr = DateTimeFormatter.ofPattern("DD-MM-YYYY");
        String mydate = dt.format(dtr);
        System.out.println(mydate);*/

        DateTimeFormatter dtr = DateTimeFormatter.ofPattern("DD-MM-YYYY -- E H:m:s a");
        String mydate1 = dt.format(dtr);
        System.out.println(mydate1);

        // Yaha kya huaa Local Date Now
        /*
        * LocalDate.now()
               ↓
           2026-09-15
               ↓
           Formatter: dd-MM-yyyy
               ↓
             15-09-2026
        * */
        // Important Format Patterns
        /*
        * | Pattern | Meaning        | Example     |
| ------- | -------------- | ----------- |
| `dd`    | Day            | `15`        |
| `MM`    | Month          | `09`        |
| `yyyy`  | Year           | `2026`      |
| `HH`    | Hour (24-hour) | `14`        |
| `hh`    | Hour (12-hour) | `02`        |
| `mm`    | Minute         | `30`        |
| `ss`    | Second         | `45`        |
| `SSS`   | Millisecond    | `123`       |
| `a`     | AM/PM          | `PM`        |
| `E`     | Day name       | `Tue`       |
| `EEEE`  | Full day name  | `Tuesday`   |
| `MMM`   | Short month    | `Sep`       |
| `MMMM`  | Full month     | `September` |

        * */

       // DateTimeFormatter dtr = DateTimeFormatter.ofPattern("DD-MM-YYYY");
        DateTimeFormatter dt2 = DateTimeFormatter.ISO_LOCAL_DATE;
        String mydate = dt.format(dt2);
        System.out.println(mydate);


    }
}
