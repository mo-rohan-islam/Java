import java.util.Arrays;
import java.util.Random;

public class BinarySearch {

    private final static int ARRAY_LENGTH = 20000;
    private final static int RANDOM_ORIGIN = 1;
    private final static int RANDOM_BOUND = 30000;
    private final static Random rand = new Random();

    public static void main(String[] args) {
        int[] arr = generateArray(ARRAY_LENGTH);
        int key = rand.nextInt(RANDOM_ORIGIN, RANDOM_BOUND);
        // int key = 50;
        // System.out.println("Key: " + key);

        int index = search(arr, key);
        System.out.printf((index == -1)
                ? "Key %s not found!\n"
                : "Key %s found at index %s\n"
            , key, index);
    }

    private static int search(int[] arr, int key) {
        long startTime = System.currentTimeMillis();

        int index = binarySearch(arr, key, 0, arr.length - 1);
        // int index = LinearSearch.linearSearch(arr, key);

        long endTime = System.currentTimeMillis();
        long timeTaken = endTime - startTime;
        System.out.println("Time taken to search: " + timeTaken);
        return index;
    }

    public static int[] generateArray(final int LIMIT) {
        int[] arr = new int[LIMIT];
        for (int i = 0; i < LIMIT; i++) {
            arr[i] = rand.nextInt(RANDOM_ORIGIN, RANDOM_BOUND);
        }
        // System.out.print("Unsorted Array: ");
        // printArray(arr);
        // arr = Arrays.stream(arr).sorted().toArray();
        sort(arr);
        System.out.print("Sorted Array: ");
        printArray(arr);
        return arr;
    }

    private static void sort(int[] arr) {
        long startTime = System.currentTimeMillis();
        
        // BubbleSort.bubbleSort(arr);
        // SelectionSort.selectionSort(arr);
        InsertionSort.insertionSort(arr);
        
        long endTime = System.currentTimeMillis();
        long timeTaken = endTime - startTime;
        System.out.println("Time taken to sort: " + timeTaken);
    }

    public static void printArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    public static int binarySearch(int[] arr, int key, int low, int high) {
        if (low > high)
            return -1;

        int mid = (low + high) / 2;
        if (arr[mid] == key)
            return mid;

        return key < arr[mid]
                ? binarySearch(arr, key, low, mid - 1)
                : binarySearch(arr, key, mid + 1, high);
    }
}
