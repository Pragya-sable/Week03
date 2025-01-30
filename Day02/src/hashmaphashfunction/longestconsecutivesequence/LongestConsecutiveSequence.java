package hashmaphashfunction.longestconsecutivesequence;
import java.util.HashMap;
public class LongestConsecutiveSequence {
    public static int findLengthOfConsecutiveSequence(int array[]) {
        // If the array is empty then return 0
        if(array == null || array.length == 0)
        {
            return 0;
        }
        // Use hashmap for initialize the element and their sequences
        HashMap<Integer, Boolean>map = new HashMap<>();

        // Put all element into the map with false value
        for(int num : array){
            // false indicates that the element hasn't been processed
            map.put(num, false);
        }
        int longestLength = 0;

        // Iterate the array to find the length of longest consecutive sequence
        for(int num : array){
            // If the element has already been processed
            // then skit that element
            if(map.get(num))
            {
                continue;
            }

            // Mark that current element as processed
            map.put(num, true);

            int currentLength = 1;

            //Check for the previous element in the sequence
            int currentNum = num - 1;
            while(map.containsKey(currentNum) && !map.get(currentNum)){
                map.put(currentNum, true);
                currentLength++;
                currentNum--;
            }

            // Check for the next element in the sequence
            currentNum = num + 1;
            while (map.containsKey(currentNum) && !map.get(currentNum)) {
                map.put(currentNum, true);
                currentLength++;
                currentNum++;
            }
            // Update the longest streak
            longestLength = Math.max(longestLength, currentLength);

        }
        return longestLength;

    }
}
