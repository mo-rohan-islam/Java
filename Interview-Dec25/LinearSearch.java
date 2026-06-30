import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class LinearSearch {

    private final static Random rand = new Random();
    private final static int ARRARY_LENGTH = 20;

    public static void main(String[] args) {
        int[] arr = populateIntArray(ARRARY_LENGTH);
        int key = rand.nextInt(ARRARY_LENGTH);
        printArray(arr);
        System.out.printf("Key %s found in index: %s", key, linearSearch(arr, key));
    }

    public static void printArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    public static int[] populateIntArray(final int LIMIT) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= LIMIT; i++) {
            list.add(i);
        }
        Collections.shuffle(list);
        
        int[] arr = new int[LIMIT];
        for (int i = 0; i < LIMIT; i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }

    public static int linearSearch(int[] arr, int key) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                index = i;
                break;
            }
        }
        return index;
    }
}
