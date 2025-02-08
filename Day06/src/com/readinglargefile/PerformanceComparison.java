package com.readinglargefile;

import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.FileInputStream;
import java.io.IOException;
// Program to compare FileReader (Character Stream)
// and InputStreamReader (Byte Stream) when reading a large file
public class PerformanceComparison {

    // Method for read a file using FileReader
    public static void readUsingFileReader() throws IOException{
        String filePath = "D:/Capgemini Training/File.txt";
        // FileReader Object
        FileReader fileReader = new FileReader(filePath);
        int character;
        while ((character = fileReader.read()) != -1) {
            // Just reading the file character by character
        }
        // Close the reader after use
        fileReader.close();
    }

    // Method for read a file using InputStreamReader
    public static void readWithInputStreamReader() throws IOException {
        String filePath = "D:/Capgemini Training/File.txt";
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(filePath));
        int character;
        while ((character = inputStreamReader.read()) != -1) {
            // Just reading the file character by character
        }
        // Close the reader after use
        inputStreamReader.close();
    }

    // Method to test the performance
    public static void testPerformance(String fileName) throws IOException {
        // Measure time taken by FileReader

        long startTime = System.nanoTime();
        readUsingFileReader();
        long endTime = System.nanoTime();
        long fileReaderTime = endTime - startTime;
        System.out.println("FileReader time: " + fileReaderTime / 1_000_000 + " ms");

        // Measure time taken by InputStreamReader
        startTime = System.nanoTime();
        readWithInputStreamReader();
        endTime = System.nanoTime();
        long inputStreamReaderTime = endTime - startTime;
        System.out.println("InputStreamReader time: " + inputStreamReaderTime / 1_000_000 + " ms");
    }
}
