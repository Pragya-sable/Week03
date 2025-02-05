package challengeproblem;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.File;
public class StringAndFileComparison {
    public static void main(String[] args) throws IOException {
        // 1. Compare String concatenation using String array

        String inputString = "hello";
        String[] strArray = new String[1000000];

        // Fill the array with "hello"
        for (int i = 0; i < strArray.length; i++) {
            strArray[i] = inputString;
        }

        // Concatenation using String array and simple for loop
        long startTime = System.nanoTime();
        String concatenatedStr = "";
        for (String str : strArray) {
            concatenatedStr += str;
        }
        long endTime = System.nanoTime();
        long arrayConcatenationTime = endTime - startTime;
        System.out.println("Time taken for concatenation using String array: " + arrayConcatenationTime / 1_000_000 + " ms");

        // 2. Compare file reading using Scanner and BufferedInputStream

        String filePath = "D:/Capgemini Training/File.txt";
        countWordsUsingScanner(filePath);
        countWordsUsingBufferedInputStream(filePath);
    }

    // Method to count words using Scanner
    public static void countWordsUsingScanner(String filePath) throws IOException {
        long startTime = System.nanoTime();
        int wordCount = 0;

        // Create a Scanner object to read the file
        try (Scanner scanner = new Scanner(new File(filePath))) {
            while (scanner.hasNext()) {
                // Read each word from the file and increment word count
                scanner.next();
                wordCount++;
            }
        }
        long endTime = System.nanoTime();
        long scannerTime = endTime - startTime;
        System.out.println("Time taken by Scanner: " + scannerTime / 1_000_000 + " ms");
        System.out.println("Word count using Scanner: " + wordCount);
    }

    // Method to count words using BufferedInputStream
    public static void countWordsUsingBufferedInputStream(String filePath) throws IOException {
        long startTime = System.nanoTime();
        int wordCount = 0;

        // Create BufferedInputStream to read file as bytes
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(filePath));
             InputStreamReader isr = new InputStreamReader(bis);
             BufferedReader br = new BufferedReader(isr)) {

            String line;
            while ((line = br.readLine()) != null) {
                // Split each line into words based on whitespace
                String[] words = line.split("\\s+");
                wordCount += words.length;
            }
        }
        long endTime = System.nanoTime();
        long bufferedInputStreamTime = endTime - startTime;
        System.out.println("Time taken by BufferedInputStream: " + bufferedInputStreamTime / 1_000_000 + " ms");
        System.out.println("Word count using BufferedInputStream: " + wordCount);
    }
}
