import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BinaryConversionMaxConsecutive {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String binaryString = convertDecimalToBinary(n);
        int maxConsecutive = maxConsecutive(binaryString, 1);
        System.out.println(maxConsecutive);

        bufferedReader.close();
    }

    static private int maxConsecutive(String binary, int checkParam) {
        String splitParam = checkParam == 1 ? "0" : "1";
        String[] parts = binary.split(splitParam);
        int max = 0;
        for (String part : parts) {
            if (part.length() > max) {
                max = part.length();
            }
        }
        return max;
    }

    static private String convertDecimalToBinary(int number) {
        // divide number by 2 -> store remainder
        // divide quotient by 2 until 0
        // reverse of remainder

        // String reverseBinary = "";
        StringBuilder reverseBinary = new StringBuilder();
        int quotient = number;
        while (quotient > 0) {
            int remainder = quotient % 2;
            quotient = quotient / 2;
            // reverseBinary += remainder;
            reverseBinary.append(remainder);
        }

        String binaryString = reverseString(reverseBinary.toString());
        return binaryString;
    }

    static private String reverseString(String input) {
        // String reverseString = "";
        StringBuilder reverseString = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            char ch = input.charAt(i);
            // reverseString += ch;
            reverseString.append(ch);
        }
        return reverseString.toString();
    }
}


/*
 * =============================
 * OPTIMIZED CODE FROM CHATGPT
 * =============================
 * 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BinaryConversionMaxConsecutive {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String binaryString = Integer.toBinaryString(n);  // Use built-in method
        int maxConsecutive = maxConsecutive(binaryString);
        System.out.println(maxConsecutive);

        bufferedReader.close();
    }

    private static int maxConsecutive(String binary) {
        int maxCount = 0, currentCount = 0;
        for (char ch : binary.toCharArray()) {
            if (ch == '1') {
                currentCount++;
                maxCount = Math.max(maxCount, currentCount);
            } else {
                currentCount = 0;
            }
        }
        return maxCount;
    }
}
 * 
 */