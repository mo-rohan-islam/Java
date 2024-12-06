import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * CheckUniqueArray
 */
public class CheckUniqueArray {

    public static void main(String[] args) {
        int[] nums1 = new int[] { 1, 2, 3, 1 };
        int[] nums2 = new int[] { 1, 2, 3, 4 };

        System.out.println(Arrays.toString(nums1) + ": " + CheckUniqueArray.uniqueArrayCheck(nums1));
        System.out.println(Arrays.toString(nums2) + ": " + CheckUniqueArray.uniqueArrayCheck(nums2));
    }

    protected static boolean uniqueArrayCheck(int[] nums) {
        List<Integer> list = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.toList());
        Set<Integer> set = new HashSet<>(list);

        if (set.size() == list.size()) {
            return true;
        }
        return false;
    }
}