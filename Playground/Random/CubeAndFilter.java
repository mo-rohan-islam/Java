import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CubeAndFilter {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(4, 5, 6, 7, 1, 2, 3);

        integerList.stream()
                .map(num -> num * num * num)
                .filter(num -> num > 50)
                .forEach(System.out::println);

        integerList.stream()
                .filter(n -> n * n * n > 50)
                .forEach(n -> System.out.println(n + " | " + n * n * n));

        integerList.stream()
                .collect(Collectors.toMap(Function.identity(), n -> n * n * n))
                .entrySet().stream()
                .filter(entry -> entry.getValue() > 50)
                .forEach(entry -> System.out.println(entry.getKey() + " | " + entry.getValue()));
    }
}
