
/*
Fibonacci number calculator using Recursion.
Took about 280 ms on apple m1 chip for calculating the 40th number.
 */
public class Fibonacci2 {

    public static void main(String[] args) {

        // expecting 1 and only 1 argument from command line
        if (args == null || args.length != 1) {
            throw new IllegalArgumentException("Expecting 1 command line argument");
        }

        System.out.printf("First input value to my program is: '%s'\n", args[0]);
	
	int n;

        // parse the first argument as an integer
        n = Integer.parseInt(args[0]);

        int num = fiboRecursive(n);

        System.out.printf("The value for %d Fibonacci is = %d\n", n, num);
    }
    
    static int fiboRecursive(int n) {

        if (n == 1) return 1;
        if (n == 2) return 1;

        return fiboRecursive(n-1) + fiboRecursive(n-2);

    }

}
