
// java library code is imported into our program
// java.util is the library package, Arrays is the library class
import java.util.Arrays;


// your program has to be in a .java file in a "class"
// class starts here, must match the name of .java file
// to complile your program, use command "javac"
// javac CharCounter.java 
public class CharCounter {


  // java CharCounter "hello saturday"
  // this is how to declare "main" method.
  // upon starting the program, java will look for this method/funtion
  // and if your program needs some command line arguments, then java will pass them as String[] as an input to "main" method.
  // [] means its an array
  public static void main(String[] args) {
 

    // check for at least one input from command line
    // array args length should be 1
    if (args.length != 1) {
      // tell user that we expect argument
      System.out.println("Expecting 1 argument sentence, but found this: " + Arrays.toString(args));
      // exit the program as no argument
      System.exit(1);
    }

    // pick up the first argument for counting characters
    String sentence = args[0];

    // create a storage to capture counts of 'a' - 'z' that is 26 small alphabets
    int[] counters = new int[26];

    // iterate over the sentence, one character at a time using for loop
    for (int i = 0; i < sentence.length() ; i++) {
 
      // pick up the character at 'i'th location in the array
      char c = sentence.charAt(i);

      // check if the character lies between 'a' and 'z'
      // if not, then skip further processing and go back to pick up and continue with the next character
      if (c < 'a' || c > 'z') {
        // go back to next character and re-do
        continue;
      }

      // locate index in the counters array corresponding to this character.
      int index = c - 'a';

      // increment the count in the counters array at the location of character picked up
      counters[index] ++;

    } // end the for loop

    // we present our findings using a special small method to print counters
    printChars(counters);

  }

  // small special method to print character counts found using a for loop.
  private static void printChars(int[] counters) {

    for (int i = 0; i < counters.length; i++) {
      // get count for first array location
      int count = counters[i];

      // convert array location to its meaningful character
      char c = (char) (i + 'a');

      //using "printf" library function print out the finding for this character
      System.out.printf("Count of '%c' = %d%n", c, count);
    } // end of for loop, all character addressed
  }

  /*
  walk through of the main for loop for counting characters
    characters	a	b	c
    index	0	1	2
    counters[]	0	0	0
			    
    input = b			
    counters[]	0	1	0
			    
    input = c			
    counters[]	0	1	1
			    
    input = b			
    counters[]	0	2	1
  */

}
