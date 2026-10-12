package _59CollectionFramework;
import java.util.Scanner;
import java.util.Calendar;
/*
java.time
   │
   ├── LocalDate       → Date
   ├── LocalTime       → Time
   ├── LocalDateTime   → Date + Time
   ├── ZonedDateTime   → Date + Time + Time Zone
   ├── Instant         → UTC timestamp
   ├── Period          → Date ka difference
   ├── Duration        → Time ka difference
   └── DateTimeFormatter → Formatting / Parsing
* */
/*Date and Time in Java
Java provides different classes to work with date, time, formatting,
comparison, and time zones. For modern Java applications, the java.time package is preferred.*/
/*❤️1. Main Date-Time Classes
| Class               | Use                      |
| ------------------- | ------------------------ |
| `LocalDate`         | Date only                |
| `LocalTime`         | Time only                |
| `LocalDateTime`     | Date + time              |
| `ZonedDateTime`     | Date + time + time zone  |
| `Instant`           | Exact moment in UTC      |
| `Duration`          | Difference between times |
| `Period`            | Difference between dates |
| `DateTimeFormatter` | Formatting/parsing       |

2. LocalDate —
Date only
import java.time.LocalDate;
LocalDate today = LocalDate.now();
System.out.println(today);
Example output: 2026-09-13

Create a specific date
LocalDate date = LocalDate.of(2026, 9, 13);
System.out.println(date);

Get individual values
System.out.println(date.getYear());
System.out.println(date.getMonth());
System.out.println(date.getDayOfMonth());

3. LocalTime — Time only
import java.time.LocalTime;
LocalTime time = LocalTime.now();
System.out.println(time);
Ex :-  10:30:45.123
LocalTime time = LocalTime.of(10, 30, 45);

Get values:
time.getHour();
time.getMinute();
time.getSecond();
*/
public class _10DateAndTimeInJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(System.currentTimeMillis()/1000/3600/24/365);
        
    }
}
