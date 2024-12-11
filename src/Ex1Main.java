import java.util.Arrays;
import java.util.Scanner;
/**
 * The main method serves as the entry point for the Ex1 program.
 * It allows the user to input two numbers with specified bases,
 * performs addition and multiplication on these numbers,
 * converts the results to a specified base, and finds the largest number.
 */
public class Ex1Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num1 = "", num2 = "", quit = "quit";
        while (!num1.equals(quit) && !num2.equals(quit)) {
            System.out.println();
            System.out.println("Ex1 class solution:");
            System.out.print("Enter a string as number#1 (or \"quit\" to end the program): ");
            num1 = sc.nextLine();
            // Check if the user wants to quit
            if (!num1.equals("quit")) {
                // Validate the first number
                boolean NumberInFormat = Ex1.isNumber(num1);
            if (NumberInFormat) {

                System.out.println("num1= " + num1 + " is number: true, value: " + Ex1.number2Int(num1));

            }
             else {
              System.out.println("num1= " + num1 + " is number: false, value: -1");
             System.out.println("ERR: num1 is in the wrong format! (" + num1 + ")");
             continue;
               }
                // Prompt the user to enter the second number
                System.out.print("Enter a string as number#2 (or \"quit\" to end the program);");
               num2 = sc.nextLine();
             if (!num2.equals(quit)) {
                 // validate the second number
                 boolean NumberInFormat2 = Ex1.isNumber(num2);

              if (NumberInFormat2) {
                System.out.println("num2= " + num2 + " is number: true, value: " + Ex1.number2Int(num2));
                 }else {
                  System.out.println("num2= " + num2 + " is number: false, value: -1");
                  System.out.println("ERR: num2 is in the wrong format! (" + num2 + ")");
                   continue;// restart the loop if the second number is invalid
                    }
                    }
                // Convert the valid numbers to integers
                int number1 = Ex1.number2Int(num1);
                       int number2 = Ex1.number2Int(num2);
                        System.out.println("Enter a base (between 2 and 16): ");
                        int base = sc.nextInt();
                        sc.nextLine();
                // Check if the base is within the valid range
                if (base<2 || base>16){
                            System.out.println("ERR: Invalid base! Please enter a base between 2 and 16.");
                            continue;
                        }
                // Perform addition and multiplication of the two numbers
                int sum = number1 + number2;
                    int product = number1 * number2;
                // Convert the sum and product to the specified base
                        String convertedNumber1 = Ex1.int2Number(sum, base);
                        String convertedNumber2 = Ex1.int2Number(product, base);
                      System.out.println(num1 + " + " + num2 + " = " + convertedNumber1 );
                       System.out.println(num1 + " * " + num2 + " = " + convertedNumber2 );
                // create an array with the sum, product, and original numbers
                String[] numbers = {String.valueOf(sum),String.valueOf(product),num1,num2} ;
                // find the index of the largest number in the array
                int index = Ex1.maxIndex(numbers);
                        System.out.println("Max number over " + Arrays.toString(numbers) + " is: " + numbers[index]);
                    }
                    }
        System.out.println("Quitting now...");
                }
    }








