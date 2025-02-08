package com.readinglargefile;
import java.io.IOException;
// Main class
public class Main {
    public static void main(String[] args) {
        String filePath = "D:/Capgemini Training/File.txt";
        String filePath2 = "\"D:\\Tailwind\\package.json\"";
        String filePath3 = "\"D:\\Tailwind\\package-lock.json\"";
        // Test with file
            try {
                // Test for 500MB size file
                PerformanceComparison.testPerformance(filePath);
                PerformanceComparison.testPerformance(filePath2);
                PerformanceComparison.testPerformance(filePath3);
            } catch (IOException e) {
                System.out.println("An error occurred while reading the file");
            }
    }
}

