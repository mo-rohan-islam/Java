public class PalindromicWords {
    public static int countPalindromicWords(String sentence) {
        // Split the sentence into words
        String[] words = sentence.split(" ");
        int count = 0;

        // Check each word
        for (String word : words) {
            if (isPalindrome(word)) {
                count++;
            }
        }
        return count;
    }

    // Helper function to check if a word is a palindrome
    public static boolean isPalindrome(String word) {
        int left = 0, right = word.length() - 1;

        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        // Example Input
        String input1 = "the fastest racecar";
        String input2 = "wow mom";

        // Example Output
        System.out.println(countPalindromicWords(input1)); // Output: 1
        System.out.println(countPalindromicWords(input2)); // Output: 2
    }
}
