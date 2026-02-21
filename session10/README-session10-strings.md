*String in Java*

Methods in String class and their uses

`new String();`	Create an empty string

`String s = "MG";`	create a string variable and assign to a string literal

`String.format();`	Helps prepare a string with inputs and a template	String.format("Today, the time is %d am and day is %s%n", 11, "Saturday");

`s1.equals(s2);`	String equality 	

`o1.equals(o2);`	Object equality

`s.length();`	length of a string

`s.strip();`	remove leading and trailing spaces.

`s.charAt();`	get a character at 0-starting index

`char[] ca = s1.toCharArray();`	convert string data into a array of char type

`s.intern()`	To yield unique copy of the same string in memory - save space.

`s.isBlank()`  check for no characters or with white spaces only	

`s.isEmpty()`   check for no characters

`boolean isMyStringNullOrBlank = Objects.isNull(s) || s.isBlank();`

`Objects.isNull(o)`    checks if an object is null

`Objects.equals(s1, s2);`		

`boolean areTheseStringEqual = Objects.equals(s1, s2);`		

`boolean areTheseStringEqual = Objects.equals(s1, s2);`	

`s1 == s2`	String equality special case, comparing reference not value. only true if both are same instance

`System.identityHashCode(s1);`  returns a unique value belonging to the underlying object in JVM




`String main = "Hi there, what is the time?";`		

`main.contains("what");`    returns true if a string contains the second string

`main.startsWith("Hi");`    returns true if a string starts with the second string	

`main.endsWith("time?");`		returns true if a string ends with the second string

`s1.equalsIgnoreCase(s2);`	compares string if same case-insensitive	

`s1.equalsIgnoreCase(s2);`		

`s1.toUpperCase();`	    "hi" -> "HI"

`s1.toLowerCase();`		"Bye" -> "bye"

`main.split(" ");`	returns a string array after splitting by " " -> `String[6] { "Hi", "there,", "what", "is", "the", "time?" }`

`main.split(",");`	-> `String[2] { "Hi there", " what is the time?" }`

`main.replace("what", "why");`	-> "Hi there, why is the time?"


`main = main.replaceAll(".", ",");`     replace all occurrences of regex matched sub-strings. in this case it matches each character

https://regex101.com/		

`main = main.replaceAll("\\.", ",");`   looks for '.' character only and replaces with ','

`String.join(" ", "Hi", "there.", "who", "are", "you");`    combines given strings with delimiter supplied -> "Hi there. who are you"

