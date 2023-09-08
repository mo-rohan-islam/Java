import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMap {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("5.6", "7.4", "4", "1", "2.3");

        // list.stream().flatMap(num -> Stream.of(num)).forEach(System.out::println);
        FlatMap object = new FlatMap();
        list.stream().flatMap(num -> Stream.of(num)).forEach(object::print);

        List<Integer> listOfInts = Arrays.asList(20, 10, 22, 25, 30);
        listOfInts.stream().filter(item -> item / 10 == 2).forEach(System.out::println);

        String word = "APPLE";
        Map<Character, Long> charCount = word.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
        System.out.println(charCount);

        Long count = word.chars().mapToObj(c -> (char) c).collect(Collectors.counting());
        System.out.println(count);

    }

    // int sum(Integer a, Integer b) {
    // return a + b;
    // }

    void print(Object s) {
        System.out.println(s);
    }

}
