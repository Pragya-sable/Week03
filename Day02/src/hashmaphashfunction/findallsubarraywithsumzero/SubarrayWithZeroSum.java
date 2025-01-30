package hashmaphashfunction.findallsubarraywithsumzero;
// Class with name SubarrayWithZeroSum is used to
// find all subarrays whose elements sum up to zero
import java.util.*;
public class SubarrayWithZeroSum {

    // Method to find subarrays with sum zero
    public static void findSubArrays(int arr[]) {
        int n = arr.length;
        // here we use hashmap for storing the prefix sum and its index
        Map<Integer, Integer> map = new HashMap<>();
        // Set to track printed subarrays
        Set<String> printedSubarrays = new HashSet<>();


        // Initialize the prefix sum and the map with sum 0
        // occurring at index -1
        int prefixSum = 0;
        // In case the subarray start with 0 index
        map.put(0,-1);
        // Iterate through the array
        for (int i = 0; i < n; i++){

            // updating the prefix sum
            prefixSum += arr[i];
            // Check if the prefix sum is present in map or not
            if(map.containsKey(prefixSum)) {
                // If yes, then subarray with sum 0 is present
                int startIndex = map.get(prefixSum) + 1;

                // Convert subarray to string and check if it has already been printed
                StringBuilder subarray = new StringBuilder();
                for (int j = startIndex; j <= i; j++) {
                    subarray.append(arr[j]);
                    if (j < i) {
                        subarray.append(", ");
                    }
                }

                // print the subarray
                // Print only if this subarray hasn't been printed before
                if (!printedSubarrays.contains(subarray.toString())) {
                    printedSubarrays.add(subarray.toString());
                    System.out.println("Subarray with zero sum: " + subarray);
                }
            }
            // store the current prefix sum into the map
            map.put(prefixSum,i);
        }
    }

}
