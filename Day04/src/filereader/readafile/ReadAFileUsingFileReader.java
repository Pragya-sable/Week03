package filereader.readafile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// Program that uses FileReader to read a text file line by line and print each line to the console
public class ReadAFileUsingFileReader {
    public static void main(String[] args) {
        // Give path of the file
        String filePath = "D:/Capgemini Training/File.txt";
        String line = null;

        // Initialize FileReader and BufferedReader objects
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        try{
            // Create a FileReader object to read from the file
             fileReader = new FileReader(filePath);

            // Wrap the FileReader in a BufferedReader to read lines efficiently
             bufferedReader = new BufferedReader(fileReader);

            // Use a loop to read each line using the readLine()
            // method and print it to the console
            while((line = bufferedReader.readLine()) != null){
                System.out.println(line);
            }

            // Close the file after reading all the lines
            fileReader.close();
            bufferedReader.close();
        }
        catch (IOException e){
            System.out.println("Error Occurred while reading a file ");
        }finally {
            // Close the BufferedReader and FileReader to release resources
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
                if (fileReader != null) {
                    fileReader.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

    }
}
