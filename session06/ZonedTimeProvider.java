
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class ZonedTimeProvider implements TimeProvider {

  public String get() {
    //LocalDateTime now = LocalDateTime.now();
    ZonedDateTime now = ZonedDateTime.now();
   
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MM dd 'T' HH:mm zZ");
    //DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm zZ");
    //DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm VV");
    //DateTimeFormatter formatter = DateTimeFormatter.RFC_1123_DATE_TIME;

    String result = formatter.format(now);

    return result;
  }

  public static void main(String[] args) {

    ZonedTimeProvider provider = new ZonedTimeProvider();
    System.out.println(provider.get());


    LocalDateTime parsedTime = LocalDateTime.parse("20251231 04:15", DateTimeFormatter.ofPattern("yyyyMMdd HH:mm"));
    System.out.println("Parser date time = " + parsedTime);
  }

}
