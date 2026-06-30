import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KidsWithCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int highestCandyCount = Arrays.stream(candies).max().getAsInt();
        
        List<Boolean> result = new ArrayList<>();
        for (int i = 0; i < candies.length; i++) {
            result.add((candies[i] + extraCandies) > highestCandyCount);
        }
        return result;
    }
}
