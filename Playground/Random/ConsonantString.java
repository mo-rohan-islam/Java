import java.util.Arrays;
import java.util.List;
// import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ConsonantString {
    public static void main(String[] args) {
        String text = "MynameisAnthony";
        String output = "";

        // Predicate<Character> checkVowel = ch -> ch == 'a' || ch == 'e' || ch == 'i'
        // || ch == 'o' || ch == 'u'
        // || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';

        List<Character> vowelList = Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
        // Predicate<Character> checkVowelFromList = ch -> vowelList.contains(ch);

        output = text.chars().mapToObj(ch -> Character.valueOf((char) ch))
                // .filter(ch -> !checkVowelFromList.test(ch))
                .filter(ch -> !vowelList.contains(ch))
                .map(Object::toString)
                .collect(Collectors.joining());

        System.out.println(output);
    }
}
