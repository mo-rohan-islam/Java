import java.util.Arrays;
import java.util.List;

public class FindMaxElement {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);

        Integer max = myList.stream().max(Integer::compare).get();
        // Integer max = myList.stream().max(Comparator.comparingInt(n -> n)).get();
        System.out.println(max);
    }
}
