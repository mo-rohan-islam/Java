import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SuppressWarnings(value = { "unused" })
public class StringReverse {
    public static void main(String[] args) {

        final String SPACE_REGEX = "\\s+";
        final char SPACE = ' ';

        String str = "How are you doing today?";
        // String palindromeInput = "Madam";
        String palindromeInput = "Rohar";
        String strReversed = "";

        // Expected Output: "woh are uoy doing ?yadot"

        // List<String> splitSringList = splitStringByRegex(str, SPACE_REGEX);
        List<String> splitSringList = splitStringByChar(str, SPACE);

        for (int i = 0; i < splitSringList.size(); i++) {
            String word = splitSringList.get(i);
            strReversed += ((i % 2 == 0) ? reverseString(word) : word) + SPACE;
        }

        strReversed = reverseString(palindromeInput);
        System.out.println("Is Palindrome? " +
                checkPalindromeInsensitive(palindromeInput, strReversed));

        System.out.println(strReversed);
    }

    private static List<String> splitStringByChar(String input, char delimeter) {
        input = input.trim();
        List<String> splitStringList = new ArrayList<>();

        String word = "";
        int lastIndex = input.length() - 1;
        for (int i = 0; i <= lastIndex; i++) {
            char ch = input.charAt(i);
            if (ch == delimeter || i == lastIndex) {
                if (i == lastIndex) {
                    word += ch;
                }
                splitStringList.add(word);
                word = "";
            } else {
                word += ch;
            }
        }

        return splitStringList;
    }

    private static List<String> splitStringByRegex(String input, String delimeter) {
        String[] words = input.split(delimeter);
        List<String> splitStringList = Arrays.asList(words);
        return splitStringList;
    }

    private static String reverseString(String str) {
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        return rev;
    }

    private static Boolean checkPalindromeInsensitive(String input, String reverse) {
        boolean result = true;
        input = input.toLowerCase();
        reverse = reverse.toLowerCase();
        for (int i = 0; i < input.length(); i++) {
            char inputChar = input.charAt(i);
            char reverseChar = reverse.charAt(i);
            // System.out.println((int) inputChar + " - " + (int) reverseChar);
            System.out.println(inputChar + " - " + reverseChar);
            // if ((int) inputChar != (int) reverseChar) {
            if (inputChar != reverseChar) {
                result = false;
                break;
            }
        }
        return result;
    }
}
