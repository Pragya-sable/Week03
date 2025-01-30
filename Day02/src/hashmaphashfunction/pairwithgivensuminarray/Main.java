package hashmaphashfunction.pairwithgivensuminarray;
// Main class for Pair with target sum
public class Main {
    public static void main(String[] args) {
        // Array
        int[] nums = {10, 15, 3, 7};
        // Target sum
        int target = 17;
        // Check target sum is exists or not
        if (PairWithTargetSum.hasPairWithSum(nums, target)) {
            System.out.println("Pair with the given sum exists");
        } else {
            System.out.println("No pair with the given sum exists");
        }
    }
}
