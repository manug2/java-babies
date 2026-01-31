

public class PrimeChecker {

  public static void main(String[] args) {

    if (args.length == 0) {
      System.err.println("One input argument expected. Pls try again.");
      System.exit(1);
    }
  
    System.out.println("Input = " + args[0]);    

    try {

      int input = Integer.parseInt(args[0]);

      System.out.println("Input integer = " + input);

      boolean check = isPrime(input);

      if (check) {
        System.out.println("Prime.");
      } else {
        System.out.println("Not Prime.");
      }

    } catch (NumberFormatException e) {
     
      System.err.println("Bad number. Please try again.");
    }

  }

  public static boolean isPrime(int input) {
    if (input == 2) return true;
    
    int count = 0;
    for (int i = 2; i < input; i++) {
      
      int remainder = input % i;
      
      if (remainder == 0) {
        count ++;
      } 
    } 
    
    return count == 0;
  }

}
