import java.util.Arrays;
import java.util.List;

public class CubeAndFilter {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(4, 5, 6, 7, 1, 2, 3);

        integerList.stream()
                .map(num -> num * num * num)
                .filter(num -> num > 50)
                .forEach(System.out::println);

    }
}
