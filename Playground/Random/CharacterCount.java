import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterCount {
    public static void main(String[] args) {

        String str = "String Data To Count Each Character.";

        Map<String, Long> map = Arrays.stream(str.split(""))
                .map(String::toLowerCase)
                .collect(Collectors.groupingBy(s -> s, LinkedHashMap::new, Collectors.counting()));
        System.out.println(map);

        Map<Character, Long> charCountMap = str.chars()
                .mapToObj(ch -> Character.toLowerCase(Character.valueOf((char) ch)))
                // .map(Character::toLowerCase)
                // .filter(ch -> ch >= 'a' && ch <= 'z')
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
        System.out.println(charCountMap);

        // Count the frequency of characters in a string
        Map<Character, Long> frequencyMap = str.toLowerCase().chars()
                .mapToObj(ch -> (char) ch)
                // .filter(Character::isLetter)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(frequencyMap);
    }
}
