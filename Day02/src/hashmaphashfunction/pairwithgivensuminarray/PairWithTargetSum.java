package hashmaphashfunction.pairwithgivensuminarray;
// Class with name PairWithTragetSum is use for finding the target sum is exist or not
import java.util.*;
public class PairWithTargetSum {
    public static boolean hasPairWithSum(int[] nums, int target) {
        // Initialize a HashMap to store the numbers
        HashMap<Integer, Integer> map = new HashMap<>();

        // Iterate through the array
        for (int num : nums) {
            // Check if the complement (target - num) is in the map
            int complement = target - num;
            if (map.containsKey(complement)) {
                // Found the pair
                return true;
            }
            // Add the current number to the map
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // No pair found
        return false;
    }

}
