package linearsearch.searchfirstnegativenumber;
// Main class for SearchNegative
public class Main {
    public static void main(String[] args) {
        // Input
        int input[] = {1,2,4,-5,6,4};

        // Call findNegativeNumber() from SearchNegative
        int result = SearchNegative.findNegativeNumber(input);

        // Print the result
        System.out.println(result);
    }
}

