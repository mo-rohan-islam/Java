import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LongestString {

    public static void main(String[] args) {

        List<String> listOfStrings = Arrays.asList("Rohan", "Aman", "Muhammad");

        String longestString = listOfStrings.stream().max(Comparator.comparingInt(String::length)).get();
        System.out.println(longestString);

        String combinedString = String.join(",", listOfStrings);
        System.out.println(combinedString);
        // System.out.println(listOfStrings.toString());

    }
}
