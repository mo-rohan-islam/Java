import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class HourGlassSum {
    public static void main(String[] args) throws IOException {
    
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(Collectors.toList()));
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
        bufferedReader.close();

        int maxHourGlassSum = calculateMaxHourGlassSum(arr);
        System.out.println(maxHourGlassSum);
    }

    private static int calculateMaxHourGlassSum(List<List<Integer>> arr) {
        int max = -9 * 7; // max negative value (-9) times number of values (7)
        for (int i = 0; i <= 3; i++) {
            int sumOfHourGlass = 0;
            for (int j = 0; j <= 3; j++) {
                sumOfHourGlass = calculateHourGlassSum(arr, i, j);
                // max = (sumOfHourGlass > max) ? sumOfHourGlass : max;
                max = Math.max(sumOfHourGlass, max);    // for better readability
            }
        }
        return max;
    }
    
    private static int calculateHourGlassSum(List<List<Integer>> arr, int row, int col) {
        return arr.get(row).get(col) + arr.get(row).get(col + 1) + arr.get(row).get(col + 2)
                + arr.get(row + 1).get(col + 1)
                + arr.get(row + 2).get(col) + arr.get(row + 2).get(col + 1) + arr.get(row + 2).get(col + 2);
    }
}
