import java.util.Arrays;
import java.util.List;

public class NumbersStartingWithOne {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(10, 15, 8, 49, 25, 98, 32);
        intList.stream()
                .map(n -> Integer.toString(n))
                .filter(s -> s.startsWith("1"))
                .forEach(s -> System.out.print(s + " "));
    }
}
