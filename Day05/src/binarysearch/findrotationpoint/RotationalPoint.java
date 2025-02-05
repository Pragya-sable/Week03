package binarysearch.findrotationpoint;
// Program that performs Binary Search to
// find the index of the smallest element in the array
public class RotationalPoint {
    // Method to find rotation point in a rotated sorted array
    public static int findRotationalPoint(int input[]){
        // Initialize left and right;
        int left = 0;
        int right = input.length - 1;
        // Iterate
        while(left < right){
            // find the mid
            int mid = (left + right) / 2;
            if(input[mid] > input[right]){
                left = mid + 1;
            }
            if(input[mid] < input[right]){
                right = mid ;
            }
        }
        return left;
    }
}
