package linearsearch.searchspecificword;
// Main class for Search
public class Main {
    public static void main(String[] args) {

        // Input
        String[] sentences = {
                "This is the first sentence.",
                "Java is a powerful programming language.",
                "I love solving problems with code.",
                "Searching for specific words is fun."
        };

        // Specific word to search for
        String wordToSearch = "Java";

        // Call the search function
        String result = Search.searchSpecificWord(sentences, wordToSearch);

        // Print the result
        System.out.println(result);
    }
}

