package inputstreamreader.conversionofstream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
//Program that uses InputStreamReader to read binary data from a file and print it as characters
public class ByteStreamToCharacterStream {
    public static void main(String[] args) {
        // The path of the file we want to read
        String filePath = "D:/Capgemini Training/File.txt";

        // Try-with-resources: This ensures resources are closed automatically after usage.
        try (
                // Open the file as a stream of bytes
                FileInputStream fileInputStream = new FileInputStream(filePath);

                // Convert the byte stream to characters using InputStreamReader
                InputStreamReader inputStreamReader= new InputStreamReader(fileInputStream, "UTF-8"); // Using UTF-8 encoding.

                // Wrap the InputStreamReader in BufferedReader to read data line by line
                BufferedReader reader = new BufferedReader(inputStreamReader)
        ) {
            String line;

            // Read the file line by line
            while ((line = reader.readLine()) != null) {
                // Print the content of the file as characters (not bytes).
                System.out.println(line);
            }

        } catch (UnsupportedEncodingException e) {
            // If the encoding is not supported, print an error.
            System.err.println("Error: Unsupported encoding format");
            e.printStackTrace();
        } catch (IOException e) {
            // If there is any error reading the file, print an error.
            System.err.println("Error: File reading failed");
            e.printStackTrace();
        }
    }
}
