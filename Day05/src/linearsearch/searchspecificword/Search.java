package linearsearch.searchspecificword;
// Program that performs Linear Search to find the first sentence containing a specific word.
public class Search {
    // Method to search specific word
    public static String searchSpecificWord(String input[], String word){
        // Iterate through the array
        for (String sentence : input) {
            // Check if the sentence contains the word
            if (sentence.contains(word)) {
                // Return the sentence if the word is found
                return sentence;
            }
        }
        // Return "Not Found" if the word is not found in any sentence
        return "Not Found";
    }

}

