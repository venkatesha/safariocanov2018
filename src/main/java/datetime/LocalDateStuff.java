package datetime;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class LocalDateStuff {
  public static void main(String[] args) {
    String s = "Hello";
    s.concat(" world");
    System.out.println(s);

    System.out.println("010 is: " + 010); // Octal, base 8 :)

    LocalDate startDay = LocalDate.of(2018, 8, 3);
    System.out.println(startDay);
    LocalDate threeDaysLater = startDay.plusDays(3);
    System.out.println(startDay + " " + threeDaysLater);

//    LocalDate andTwoHours = threeDaysLater.plus(2,
//        ChronoUnit.HOURS);
//    System.out.println(andTwoHours);

    DateTimeFormatter fmt =
        DateTimeFormatter.ofPattern("dd MMMM yyyyy");
    System.out.println(fmt.format(startDay));

    System.out.println(fmt.format(LocalDate.of(2018, 11, 26)));

    Period oneMonth = Period.of(0, 0, 31);
    Period singleMonth = Period.of(0, 1, 0);

    LocalDate janOne = LocalDate.of(2018, 1, 1);

    System.out.println(
        "Jan 1 plus oneMonth = " + janOne.plus(oneMonth));
    System.out.println(
        "Jan 1 plus singleMonth = " + janOne.plus(singleMonth));
    System.out.println(
        "Jan 1 plus 2x oneMonth = "
            + janOne.plus(oneMonth).plus(oneMonth));
    System.out.println(
        "Jan 1 plus 2x singleMonth = "
            + janOne.plus(singleMonth).plus(singleMonth));

    Period longTime = Period.of(1, 14, 375);
    System.out.println(longTime);
    longTime = longTime.normalized();
    System.out.println(longTime);
  }
}








