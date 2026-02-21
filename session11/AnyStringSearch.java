

public class AnyStringSearch {

    // Search the given array of countries for any string from command line inputs
    // If any country name matches the patter, print it out

  public static void main(String[] args) {

    String[] array = new String[] {"Singapore", "India", "Thailand", "Australia" };

    if (args == null || args.length < 1) {
      System.err.println("Require at least one command line string to search for");
      System.exit(1);
    }

    System.out.println("Going to search for any of the input string.");

    for (int i=0; i < array.length; i++) {
      String countryName = array[i];
 
      if (countryNameContainsAnyOf(countryName, args)) {
        System.out.println(countryName);
      }

    }

    System.out.println("Finished searching!");

  } // end of main

  private static boolean countryNameContainsAnyOf(String countryName, String[] searchFor) {

    for (String str : searchFor) {
      if (countryName.toLowerCase().contains(str.toLowerCase())) {
        return true;
      }
    }

    return false;
  }

}
