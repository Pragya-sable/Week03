
package linearsearch.searchfirstnegativenumber;
// Program that performs Linear Search to
// find the first negative number in the array.
public class SearchNegative {
    // Method to find first negative number in the array
    public static int findNegativeNumber(int input[]){
        // Iterate through the array from the start
        for(int i = 0; i < input.length; i++ ){
            // Check if the current element is negative
            // If a negative number is found, return its index
            if(input[i]<0){
                return i;
            }
        }

        // If the loop completes without finding a negative number, return -1
        return -1;
    }

}

