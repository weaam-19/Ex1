
public class Ex1 {
    // converts a string with a specified base into an integer
    public static int number2Int(String num) {
        int ans = -1;
        if (!isNumber(num)) {
            return ans; // return -1 if the input is not a valid number
        }
        String[] parts = num.split("b"); // split the number into its value and base parts
        int base;
        if (parts.length == 2) {
            String basePart = parts[1];
            // check if the base is represented by a letter (A to G)
            if (basePart.length() == 1 && basePart.charAt(0) >= 'A' && basePart.charAt(0) <= 'G') {
                base = 10 + (basePart.charAt(0) - 'A'); // convert letter to base (A=10, B=11, etc.)
            } else {
                base = Integer.parseInt(basePart); // convert the base part to an integer
            }
        } else {
            base = 10; // default base is 10 if no base is provided
        }
        String numberPart = parts[0]; // the number part of the input
        int result = 0;
        // first loop to check if all characters are valid in the given base
        for (int i = 0; i < numberPart.length(); i++) {
            char c = numberPart.charAt(i);
            int digitValue = Character.digit(c, base); // convert the character to a digit in the given base
            if (digitValue == -1) {
                return ans; // if the digit is invalid, return -1
            }
        }

        // second loop to convert the number part to an integer based on the base
        for (int i = 0; i < numberPart.length(); i++) {
            char c = numberPart.charAt(i);
            int digitValue = Character.digit(c, base); // get the digit value
            result = result * base + digitValue; // multiply result by base and add the current digit
        }

        return result; // return the final converted integer
    }


    // checks if a string is a valid number with an optional base
    public static boolean isNumber(String a) {
        if (a == null || a.trim().isEmpty()) {
            return false; // return false if the string is null or empty
        }
        if (!a.equals(a.trim()) || a.contains(" ")) {
            return false; // return false if the string contains spaces
        }

        if (a.contains("b")) {
            String[] parts = a.split("b"); // split the string into number and base parts
            if (parts.length != 2) {
                return false;
            }

            String numberPart = parts[0];
            String basePart = parts[1];

            if (numberPart.isEmpty() || !numberPart.matches("[0-9A-G]+")) {
                return false;
            }

            // check if the base part is valid (2-9, A-G)
            if (basePart.isEmpty() || !basePart.matches("[2-9A-G]")) {
                return false;
            }

            int base;
            // convert the base part to an integer
            if (basePart.length() == 1 && basePart.charAt(0) >= 'A' && basePart.charAt(0) <= 'G') {
                base = 10 + (basePart.charAt(0) - 'A');
            } else {
                base = Integer.parseInt(basePart);
            }

            // check if all characters in the number part are valid in the given base
            for (char c : numberPart.toCharArray()) {
                int value;
                if (c >= '0' && c <= '9') {
                    value = c - '0';
                } else if (c >= 'A' && c <= 'G') {
                    value = 10 + (c - 'A');
                } else {
                    return false;
                }

                if (value < 0 || value >= base) {
                    return false; // return false if the character is not valid in the given base
                }
            }

            return true; // return true if all checks pass
        }

        return a.matches("[0-9]+"); // return true if the string contains only digits
    }



    public static String int2Number(int num, int base) {
        if (num < 0 || base < 2 || base > 16) {
            return ""; // return an empty string for invalid input
        }

        if (num == 0) {
            return "0";
        }
        // handle the case where num is 0 and a base is provided
        if (num == 0) {
            String base1 = "";
            if (base >= 2 && base <= 9) {
                base1 = "" + (char) ('0' + base);
            } else {
                base1 = "" + (char) ('A' + (base - 10));
            }
            return "0B" + base1;
        }
        String result = ""; // initialize result as an empty string
        // convert the number to the specified base
        while (num > 0) {
            int remainder = num % base; // get the remainder
            char digit;
            if (remainder < 10) {
                digit = (char) ('0' + remainder); // for digits 0-9
            } else {
                digit = (char) ('A' + (remainder - 10)); // for digits A-G
            }
            result = digit + result; // append the digit to the result string
            num /= base;
        }
        // add the base notation to the result
        char base2;
        if (base >= 2 && base <= 9) {
            base2 = (char) ('0' + base);
        } else {
            base2 = (char) ('A' + (base - 10));
        }
        return result + "b" + base2; // return the result with the base notation
    }

    // Checks if two numbers represented as strings are equal
    public static boolean equals(String n1, String n2) {
        if (!isNumber(n1) || !isNumber(n2)) {
            return false;
        }
        int value1 = number2Int(n1);
        int value2 = number2Int(n2);

        return value1 == value2; // comparing
    }

    // returns the index of the largest number in the array
    public static int maxIndex(String[] arr) {
        int ans = 0; // Default index is 0
        int maxValue = Integer.MIN_VALUE; // initialize max value to the smallest integer

        for (int i = 0; i < arr.length; i++) {
            String numStr = arr[i];
            if (numStr != null && isNumber(numStr)) {
                int value = number2Int(numStr);
                if (value != -1 && value > maxValue) {
                    maxValue = value; // update max value
                    ans = i; // update index of max value
                }
            }
        }
        return ans; // return the index of the largest number
    }
}
