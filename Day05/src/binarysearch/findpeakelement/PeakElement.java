package binarysearch.findpeakelement;
// Program that performs Binary Search to find a peak element in an array.
// If there are multiple peak elements, return any one of them.
public class PeakElement {
    // Method to find the peak element
    public static int findPeakElement(int input[]){
        // Initialize left and right
        int left = 0;
        int right = input.length;

        // Perform binary search
        while(left <= right){
            // Find mid
            int mid = (left + right) / 2;

            // Check if the mid element is a peak
            if( input[mid] > input[mid - 1] && input[mid] > input[mid + 1]) {
                // If yes then return
                return mid;
            }
            // Check for left neighbor
            else if(input[mid] < input[mid - 1]){
                right = mid - 1;
            }
            // Check for right neighbor
            else{
                left = mid + 1;
            }
        }
        return -1;
    }
}
