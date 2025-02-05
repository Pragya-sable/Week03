package inputstreamreader.readuserinputandwritetofile;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.FileWriter;
// Program that uses InputStreamReader to read user input from the console and write the input to a file
public class UserInputToFile {
    public static void main(String[] args) {
        // Specify the file path where the input will be written. You can change this as needed
        String filePath = "D:/Capgemini Training/File.txt";

        // Use try-with-resources to automatically close the resources after use
        try (
                // Create InputStreamReader to read from System.in (console input)
                InputStreamReader inputStreamReader = new InputStreamReader(System.in);

                // Wrap InputStreamReader in BufferedReader to read lines of text
                BufferedReader reader = new BufferedReader(inputStreamReader);

                // Create FileWriter to write to the file. Set append mode to true to add to the file
                FileWriter writer = new FileWriter(filePath, true)
        ) {
            String userInput;

            System.out.println("Enter text : ");

            // Read input until the user types "exit".
            while (true) {
                // Read user input
                userInput = reader.readLine();

                // If the input is "exit", break out of the loop to stop the program
                if ("exit".equalsIgnoreCase(userInput)) {
                    break;
                }

                // Write the user input to the file followed by a new line
                writer.write(userInput + System.lineSeparator());
            }

            System.out.println("Input has been written to " + filePath);

        } catch (IOException e) {
            // Handle possible input/output exceptions.
            System.err.println("Error: An exception occurred while reading input or writing to the file");
            e.printStackTrace();
        }
    }

}
