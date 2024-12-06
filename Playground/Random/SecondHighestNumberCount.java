import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SecondHighestNumberCount {
    public static void main(String[] args) {

        List<Integer> input = Arrays.asList(10, 9, 12, 17, 15, 8, 17, 15, 9);

        input.stream()
                // .sorted(Comparator.reverseOrder())
                // .limit(2)
                // .skip(1)
                // .forEach(System.out::println);

                .collect(Collectors.groupingBy(
                        Function.identity(),
                        () -> new TreeMap<>(Comparator.reverseOrder()),
                        Collectors.counting()))
                .entrySet().stream()
                .skip(1)
                .limit(1)
                .forEach(System.out::println);

        // .skip(1).findFirst().get();
    }
}
