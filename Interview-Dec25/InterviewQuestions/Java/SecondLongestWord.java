import java.util.Arrays;
import java.util.Comparator;
import java.util.NoSuchElementException;
// import java.util.Map;
// import java.util.TreeMap;
// import java.util.function.Function;
// import java.util.stream.Collectors;

public class SecondLongestWord {

    public static void main(String[] args) {
        String sentence = "Find the longest word in this sentence";
        String secondLongestWord = secondLongestWord(sentence);
        System.out.printf("\"%s\" : %d\n", secondLongestWord, secondLongestWord.length());
        // secondLongestEntry(sentence);
    }

    private static String secondLongestWord(String sentence) throws NoSuchElementException {
        return Arrays.stream(sentence.split(" "))
                .sorted(Comparator.comparingInt(String::length).reversed())
                .distinct()
                .skip(1)
                .findFirst()
                .orElseThrow();
        // .length()
    }

    // DO NOT USE
    // private static void secondLongestEntry(String sentence) {
    //     Map.Entry<Integer, String> value = Arrays.stream(sentence.split(" "))
    //             // .sorted(Comparator.comparingInt(String::length).reversed())
    //             .collect(Collectors.toMap(word -> word.length(), Function.identity(), (n1, n2) -> n1, TreeMap::new))
    //             .reversed()
    //             .entrySet().stream()
    //             .distinct()
    //             .skip(1)
    //             .findFirst().get();
    //     System.out.printf("\"%s\" : %d\n", value.getValue(), value.getKey());
    // }
}
