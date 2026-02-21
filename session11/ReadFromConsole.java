
import java.util.Scanner;

public class ReadFromConsole {


  // https://docs.oracle.com/javase/8/docs/api/java/util/Scanner.html

  public static void main(String[] args) {

    System.out.println("Please enter some words:");

    Scanner sc = new Scanner(System.in);

    String allValues = "";

    while (sc.hasNext()) {

      String str = sc.next();

      if ("quit".equalsIgnoreCase(str)) {
        break;
      }

      allValues += ", " + str;

    }

    System.out.println("Received following inputs:");
    System.out.println(allValues);
  }

}
