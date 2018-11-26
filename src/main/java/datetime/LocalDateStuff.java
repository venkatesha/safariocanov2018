package datetime;

import java.time.LocalDate;

public class LocalDateStuff {
  public static void main(String[] args) {
    LocalDate startDay = LocalDate.of(2018, 8, 3);
    System.out.println(startDay);
    startDay = startDay.plusDays(3);
    System.out.println(startDay);

    String s = "Hello";
    s.concat(" world");
    System.out.println(s);
  }
}
