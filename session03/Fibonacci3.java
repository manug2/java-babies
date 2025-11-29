
import java.util.*;

/*
Fibonacci number calculator using Recursion with Memoization.
Took about 68 ms on apple m1 chip for calculating the 40th number.
 */
public class Fibonacci3 {

    public static void main(String[] args) {

        // expecting 1 and only 1 argument from command line
        if (args == null || args.length != 1) {
            throw new IllegalArgumentException("Expecting 1 command line argument");
        }

        System.out.printf("First input value to my program is: '%s'\n", args[0]);
	
	int n;

        // parse the first argument as an integer
        n = Integer.parseInt(args[0]);

        int num = fiboMemo(n);

        System.out.printf("The value for %d Fibonacci is = %d\n", n, num);
    }


    static HashMap<Integer, Integer> map = new HashMap<>();
    static int fiboMemo(int n) {

        if (n == 1) return 1;
        if (n == 2) return 1;

        if (map.containsKey(n)) { // if my memory already has the solution
            return map.get(n);     // re-use the solution.
        } else {
            int num = fiboMemo(n - 1) + fiboMemo(n - 2);    // calculate the solution using fiboMemo
            map.put(n, num);      // remember new solution
            return num;
        }
    }

}
