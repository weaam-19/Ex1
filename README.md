# Ex1.java
The Ex1 class offers a set of tools for handling numbers represented as strings
in various bases, ranging from base 2 (binary) to base 16 (hexadecimal).
It provides methods to:
convert numbers between different bases.
Verify if a string represents a valid number in a given base.
Compare numbers in string format.
identify the largest number in an array of string-based numbers.
This class makes it easier to work with numbers that aren't limited to the
decimal system, supporting tasks with binary, octal, hexadecimal, 
and other bases.
**_`Overview of the Ex1 Class Methods**_
`
1. number2Int
purpose: Converts a string number in a specified base into its integer value.
Input Format: A string in the form "numberPartbBasePart", 
such as "1011b2" or "A1bG".
Output: The integer equivalent of the input number. 
If the input is invalid, it returns -1.
2. isNumber
purpose: Validates if a string is a correctly formatted number with 
an optional base.
Input Format: A string in the form "numberPartbBasePart", 
such as "101b2" or "FFbG".
Output: Returns true if the string is valid, otherwise returns false.
3. int2Number
purpose: Converts an integer into a string representation in 
the specified base.
Input Format: An integer number and a base value between 2 and 16.
Output: The string representation of the number in the specified base
, appended with the base (e.g., "1101b2", "F3bG").
4. equals
purpose: Compares two numbers in string format, 
checking if they represent the same value.
Input Format: Two strings, each potentially containing a number 
and its base (e.g., "1011b2" and "11bA").
Output: Returns true if the two numbers are equivalent in value,
otherwise false.
5. maxIndex
purpose: Identifies the index of the largest number in an array of strings.
input Format: An array of strings, each potentially containing a number 
and its base (e.g., {"100bA", "110bB"}).
output: Returns the index of the largest number.
if no valid numbers are found, it defaults to 0.
this description highlights the functionality
of each method with clear inputs, outputs, and purposes.
6. Ex1Main Class

**`_Overview of Ex1Main_**
`
the Ex1Main class provides a console-based interface for users to interact with the Ex1 class. it allows users to:
input two numbers with specified bases.
validate if the input is a correct number format.
perform addition and multiplication on these numbers.
convert the results (sum and product) to a user-specified base.
determine the largest number among the results and the original inputs.
key Features
Input Validation: Ensures the numbers entered are valid.
base Conversion: Supports bases between 2 and 16.
operations: Addition and multiplication of numbers.
Max Number: Identifies the largest number in an array of results.

**`_Overview of Ex1Test_**
`
The Ex1Test class contains unit tests to verify the functionality of the Ex1 class methods. 
these tests use the JUnit framework to ensure that each method behaves as expected.
 Methods Tested:
1.computeNumberTest
tests the conversion of numbers and their equality after conversion.
2.isBasisNumberTest
tests the validation of strings as valid numbers with different bases.
3.int2NumberTest
tests the conversion of integers to string representations in various bases.
4.maxIndexTest
tests the identification of the largest number in an array of strings.
5.equalsTest
tests whether two numbers represented as strings are equal.









