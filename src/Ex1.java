
public class Ex1 {

    public static int number2Int(String num) {
        int ans = -1;
        if (!isNumber(num)) {
            return ans;
        }
        String[] parts = num.split("b");

        int base;
        if (parts.length == 2) {
            String basePart = parts[1];
            if (basePart.length() == 1 && basePart.charAt(0) >= 'A' && basePart.charAt(0) <= 'G') {
                base = 10 + (basePart.charAt(0) - 'A');
            } else {
                base = Integer.parseInt(basePart);
            }
        } else {
            base = 10;
        }

        String numberPart = parts[0];
        int result = 0;
        for (int i = 0; i < numberPart.length(); i++) {
            char c = numberPart.charAt(i);
            int digit;
            if (c >= '0' && c <= '9') {
                digit = c - '0';
            } else if (c >= 'A' && c <= 'G') {
                digit = 10 + (c - 'A');
            } else {
                return ans;
            }



            result = result * base + digit;
        }


        return result;
    }



    public static boolean isNumber(String a) {
        if (a == null || a.trim().isEmpty()) {
            return false;
        }
        if (!a.equals(a.trim()) || a.contains(" ")) {
            return false;
        }

        if (a.contains("b")) {
            String[] parts = a.split("b");
            if (parts.length != 2) {
                return false;
            }

            String numberPart = parts[0];
            String basePart = parts[1];

            if (numberPart.isEmpty() || !numberPart.matches("[0-9A-G]+")) {
                return false;
            }

            if (basePart.isEmpty() || !basePart.matches("[2-9A-G]")) {
                return false;
            }

            int base;
            if (basePart.length() == 1 && basePart.charAt(0) >= 'A' && basePart.charAt(0) <= 'G') {
                base = 10 + (basePart.charAt(0) - 'A');
            } else {
                base = Integer.parseInt(basePart);
            }

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
                    return false;
                }
            }

            return true;
        }

        return a.matches("[0-9]+");
    }



    public static String int2Number(int num, int base) {
        if (num < 0 || base < 2 || base > 16) {
            return "";
        }

        if (num == 0) {
            return "0";
        }

        StringBuilder result = new StringBuilder();

        while (num > 0) {
            int remainder = num % base;
            if (remainder < 10) {
                result.append((char) ('0' + remainder));
            } else {
                result.append((char) ('A' + (remainder - 10)));
            }
            num /= base;
        }

        return result.reverse().toString();

    }



    /**
     * Checks if the two numbers have the same value.
     * @param n1 first number
     * @param n2 second number
     * @return true iff the two numbers have the same values.
     */
    public static boolean equals(String n1, String n2) {

        if (!isNumber(n1) || !isNumber(n2)) {
            return false;
        }

        int value1 = number2Int(n1);
        int value2 = number2Int(n2);

        return value1 == value2;
    }




    public static int maxIndex(String[] arr) {
        int ans = 0;
        int maxValue = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            String numStr = arr[i];
            if (numStr != null && isNumber(numStr)) {
                int value = number2Int(numStr);
                if (value != -1 && value > maxValue) {
                    maxValue = value;
                    ans = i;
                }
            }
        }

        return ans;
    }

}
