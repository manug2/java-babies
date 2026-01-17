
import java.time.LocalDateTime;


public class HourAndMinuteProvider implements TimeProvider {

  public String get() {
    LocalDateTime now = LocalDateTime.now();

    String result = "" + now.getHour() + ":" + now.getMinute();

    return result;
  }

  public static void main(String[] args) {

    HourAndMinuteProvider provider = new HourAndMinuteProvider();

    System.out.println(provider.get());
  }

}

