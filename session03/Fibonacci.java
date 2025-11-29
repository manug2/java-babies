
/*
Fibonacci number calculator using for loop.
Took about 67 ms on apple m1 chip for calculating the 40th number.
 */
public class Fibonacci {

    public static void main(String[] args) {

        // expecting 1 and only 1 argument from command line
        if (args == null || args.length != 1) {
            throw new IllegalArgumentException("Expecting 1 command line argument");
        }

        System.out.printf("First input value to my program is: '%s'\n", args[0]);
	
	int n;

        // parse the first argument as an integer
        n = Integer.parseInt(args[0]);

        int num = fiboUsingFor(n);

        System.out.printf("The value for %d Fibonacci is = %d\n", n, num);
    }


    static int fiboUsingFor(int n) {

        int num1;
        int num2;

        num1 = 1;
        num2 = 1;


        int num = 0;

        for (int i = 3; i <= n; i++ ) {
            num = num1 + num2;

            num1 = num2;
            num2 = num;
        }
        
        return num;

     }

}
