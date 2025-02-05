package filereader.occurrenceofword;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class CountOccurrenceOfWord {
    public static void main(String[] args) {
        // Path to the file you want to read
        String filePath = "D:/Capgemini Training/File.txt";

        // The word you want to count in the file
        String targetWord = "Hello";

        // Counter to keep track of how many times the word appears
        int wordCount = 0;

        // Create FileReader and BufferedReader to read the file
        try (FileReader fileReader = new FileReader(filePath);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {

            String line;
            // Read each line of the file
            while ((line = bufferedReader.readLine()) != null) {
                // Split the line into words
                String[] words = line.split("\\s+");

                // Check each word
                for (String word : words) {
                    // Compare the word with the target word
                    if (word.equalsIgnoreCase(targetWord)) {
                        wordCount++;
                    }
                }
            }

            // Output the final count of the word
            System.out.println("The word '" + targetWord + "' appears " + wordCount + " times ");

        } catch (IOException e) {
            // Handle errors
            e.printStackTrace();
        }
    }
}
