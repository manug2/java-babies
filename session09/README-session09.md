**Arrays in java**

*Creating Arrays*

Declaration	
`int[] myArray`

Declare and Initialize empty with size `int[] myArray = new int[5];`

Declare and Assign with values `int[] myArray = new int[] {1, 2, 5, 9, 4};`



Declaration	`String[] names;`

Declare and Initialize empty `String[] fiveNames = new String[5];`

Declare and Assign with values `String[] threeNames = new String[] {"MG", "HK", "RN"};`


*Printing Arrays*

Arrays cannot be printed directly.
`System.out.println(myArray);`

Need to use library method from `java.util.Arrays` class.

`import java.util.Arrays;`

`System.out.println(Arrays.toString(myArray));`


*Array length & indexing*

Every array has a built in `length` property to denote its size.

`myArray.length`

Array indices start at element `0` and go up to `length - 1`.

`myArray[0] = 1001;` // First element
`myArray[1] = 2002;` // Second element
`myArray[myArray.length-1] = 4004;` // Last element

Accessing inappropriate indices cause error
`myArray[100];`
` Exception java.lang.ArrayIndexOutOfBoundsException: Index 100 out of bounds for length 5`


*Iterating Arrays*

Start a counting for loop.

Extract element at index 'i' and use it.

Finish loop.


`for (int i = 0; i < myArray.length; i++) {`

	`System.out.println(myArray[i] * myArray[i]);`

`}`


*For-each loop (enhanced for loop)*

Start an iterating loop and assign element from array.

Use the element.

Finish loop.


`for (int num : myArray) {`

    `System.out.println(num * num);`

`}`

Variable `num` is scoped inside the for loop only.


*Down casting is non-obvious*

Down casting works at individual element level
int[] myArray = new int[]{1, 2, 3 ,4, 6};

myArray[4] = 3.45
| Error:
| incompatible types: possible lossy conversion from double to int


myArray[4] = 300L;
| Error:
| incompatible types: possible lossy conversion from long to int


myArray[3] = Long.MAX_VALUE;
| Error:
| incompatible types: possible lossy conversion from long to int

myArray[3] = (int) Long.MAX_VALUE;
$5 ==> -1


long[] longArray = new long[3];
longArray ==> long[3] { 0, 0, 0 }



Cannot cast whole array

jshell> int[] myArray = {1};
myArray ==> int[1] { 1 }

jshell> long[] longArray = {1L};
longArray ==> long[1] { 1 }

jshell> myArray = longArray;
| Error:
| incompatible types: long[] cannot be converted to int[]
| myArray = longArray;
| ^-------^

jshell> myArray = (int[]) longArray;
| Error:
| incompatible types: long[] cannot be converted to int[]
| myArray = (int[]) longArray;
| ^-------^


