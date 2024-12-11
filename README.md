# Ex1.java
The Ex1 class offers a set of tools for handling numbers represented as strings
in various bases, ranging from base 2 (binary) to base 16 (hexadecimal).
It provides methods to:

Convert numbers between different bases.
Verify if a string represents a valid number in a given base.
Compare numbers in string format.
Identify the largest number in an array of string-based numbers.
This class makes it easier to work with numbers that aren't limited to the
decimal system, supporting tasks with binary, octal, hexadecimal, 
and other bases.
**_`Overview of the Ex1 Class Methods**_
`
1. number2Int
Purpose: Converts a string number in a specified base into its integer value.
Input Format: A string in the form "numberPartbBasePart", 
such as "1011b2" or "A1bG".
Output: The integer equivalent of the input number. 
If the input is invalid, it returns -1.
2. isNumber
Purpose: Validates if a string is a correctly formatted number with 
an optional base.
Input Format: A string in the form "numberPartbBasePart", 
such as "101b2" or "FFbG".
Output: Returns true if the string is valid, otherwise returns false.
3. int2Number
Purpose: Converts an integer into a string representation in 
the specified base.
Input Format: An integer number and a base value between 2 and 16.
Output: The string representation of the number in the specified base
, appended with the base (e.g., "1101b2", "F3bG").
4. equals
Purpose: Compares two numbers in string format, 
checking if they represent the same value.
Input Format: Two strings, each potentially containing a number 
and its base (e.g., "1011b2" and "11bA").
Output: Returns true if the two numbers are equivalent in value,
otherwise false.
5. maxIndex
Purpose: Identifies the index of the largest number in an array of strings.
Input Format: An array of strings, each potentially containing a number 
and its base (e.g., {"100bA", "110bB"}).
Output: Returns the index of the largest number.
If no valid numbers are found, it defaults to 0.
This description highlights the functionality
of each method with clear inputs, outputs, and purposes.







