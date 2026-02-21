

public class StringSearch {

    // Search the given array of countries for string "in"
    // If any country name matches the patter, print it out

  public static void main(String[] args) {

    String[] array = new String[] {"Singapore", "India", "Thailand", "Australia" };

    if (args == null || args.length < 1) {
      System.err.println("Require one command line string to search for");
      System.exit(1);
    }

    String searchFor = args[0];

    System.out.println("Going to search for input string = " + searchFor);

    for (int i=0; i < array.length; i++) {
      String country = array[i];
 
      if (country.toLowerCase().contains(searchFor.toLowerCase())) {
        System.out.println(country);
      }

    }

    System.out.println("Finished searching!");

  }

}
