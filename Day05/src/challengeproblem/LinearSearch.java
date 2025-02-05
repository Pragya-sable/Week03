package challengeproblem;

import java.util.LinkedList;
import java.util.List;

public class LinearSearch {
    List<Integer> list = new LinkedList<Integer>();
    public static int findMissingNumber(List<Integer> list){
     int n = list.size();

        // Step 1: Mark elements that are out of range or non-positive as n+1 (they are irrelevant)
        for (int i = 0; i < n; i++) {
            if (list.get(i) <= 0 || list.get(i) > n) {
                list.set(i, n + 1);  // Mark them as out of range
            }
        }

        // Step 2: Use negative marking to indicate that a number exists in the list
        for (int i = 0; i < n; i++) {
            int num = Math.abs(list.get(i));  // Get the absolute value
            if (num <= n && list.get(num - 1) > 0) {
                list.set(num - 1, -list.get(num - 1));  // Mark the number as visited
            }
        }

        // Step 3: Find the first positive number (the missing number)
        for (int i = 0; i < n; i++) {
            if (list.get(i) > 0) {
                return i + 1;  // Return the first missing positive number
            }
        }

        return n + 1;  // If no missing number found, return n + 1

    }
}
