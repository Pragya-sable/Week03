package binarysearch.occurrenceofanelement;
//Program that uses Binary Search to find the first and last
// occurrence of the target element in the array
public class FirstAndLastOccurrence {
    // Method to find the first Occurrence
    public static int findFirstOccurrence(int input[], int target){
        // Initialise left and right
        int left = 0;
        int right = input.length - 1;
        int result = 0;

        // Perform binary search for first Occurrence
        while(left <= right){
            // Find mid
            int mid = (left + right) / 2;
            // If the target is found at mid index
            // the update the result and
            if(input[mid] == target){
                result = mid;
                right = mid - 1;
            }
            // Search for left part
            else if(input[mid] < target){
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        return result;

    }
    public static int findLastOccurrence(int input[], int target){
        // Initialise left and right
        int left = 0;
        int right = input.length - 1;
        int result = 0;

        // Perform binary search for first Occurrence
        while(left <= right){
            // Find mid
            int mid = (left + right) / 2;
            if(input[mid] == target){
                result = mid;
                left =mid + 1;
            }
            // Search for right part
            else if(input[mid] < target){
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        return result;

    }

    // Method to find both first and last occurrence of the target element
    public static int[] findFirstAndLast(int[] arr, int target) {
        int first = findFirstOccurrence(arr, target);
        if (first == -1) {
            return new int[] {-1, -1};  // If target is not found, return [-1, -1]
        }
        int last = findLastOccurrence(arr, target);
        return new int[] {first, last};
    }
}
