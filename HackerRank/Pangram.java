import java.io.BufferedReader;
// import java.io.BufferedWriter;
// import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

class Pangram {

    /*
     * Complete the 'pangrams' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    // private static char SPACE = ' ';
    private static int TOTAL_ALPHABETS = 26;

    public static String pangrams(String s) {
        // Write your code here

        /*
         * s = s.toLowerCase();
         * Set<Character> inputSet = new HashSet<>();
         * for (int i = 0; i < s.length(); i++) {
         * Character ch = Character.valueOf(s.charAt(i));
         * inputSet.add(ch);
         * }
         * int setSize = inputSet.contains(SPACE) ? inputSet.size() - 1 :
         * inputSet.size();
         * String result = setSize == TOTAL_ALPHABETS ? "pangram" : "not pangram";
         * 
         * return result;
         */

        // Optimized code using streams
        long distinctAlphabets = s.toLowerCase()
                .chars()
                .filter(Character::isLetter)
                .distinct()
                .count();
        return distinctAlphabets == TOTAL_ALPHABETS ? "pangram" : "not pangram";
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Pangram.pangrams(s);
        System.out.println(result);

        // bufferedWriter.write(result);
        // bufferedWriter.newLine();

        bufferedReader.close();
        // bufferedWriter.close();
    }
}
