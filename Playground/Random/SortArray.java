import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int arr[] = new int[] { 99, 55, 203, 99, 4, 91 };

        int max = Arrays.stream(arr).max().getAsInt();
        System.out.println("Max: " + max);
        Arrays.parallelSort(arr);
        Arrays.stream(arr).forEach(System.out::println);
    }
}
