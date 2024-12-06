import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMap {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("5.6", "7.4", "4", "1", "2.3");
        Consumer<String> print = s -> System.out.print(s + " ");

        // list.stream().flatMap(num -> Stream.of(num)).forEach(System.out::println);
        list.stream()
                .flatMap(num -> Stream.of(num))
                .forEach(print);

        System.out.println();
        List<Integer> listOfInts = Arrays.asList(20, 10, 22, 25, 30);
        listOfInts.stream()
                .filter(item -> item / 10 == 2)
                .forEach(System.out::println);
    }

    // int sum(Integer a, Integer b) {
    // return a + b;
    // }

    public static void print(Object s) {
        System.out.print(s + " ");
    }

}
