package com.stringconcatenation;
// Program to compare the performance of String (O(N²)),
// StringBuilder (O(N)), and StringBuffer (O(N)) when concatenating a million strings.
public class PerformanceComparison {

    // Method for Concatenate Strings
    public static String concatenation(int n){
        String result = "";
        for (int i = 0; i < n; i++) {
            // Concatenating using String
            result += "test";
        }
        return result;
    }

    // Method for Concatenate Strings using StringBuffer
    public static String concatenationUsingStringBuffer(int n){
        StringBuffer result = new StringBuffer();
        for (int i = 0; i < n; i++) {
            // Concatenating using String
            result.append("test");
        }
        return result.toString();
    }

    // Method for Concatenate Strings using StringBuffer
    public static String concatenationUsingStringBuilder(int n){
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            // Concatenating using String
            result.append("test");
        }
        return result.toString();
    }


    // Method to concatenate using StringBuffer (Thread-safe but slower than StringBuilder)
    public static String concatenateUsingStringBuffer(int n) {
        StringBuffer result = new StringBuffer();
        for (int i = 0; i < n; i++) {
            result.append("test");  // Concatenating using StringBuffer (thread-safe but slower)
        }
        return result.toString();
    }

    // Performance testing method
    public static void performanceTest(int n) {
        // Measure time for String concatenation
        long startTime = System.nanoTime();
        concatenation(n);
        long endTime = System.nanoTime();
        long stringTime = endTime - startTime;
        System.out.println("String concatenation time for " + n + " concatenations: " + stringTime / 1_000_000 + " ms");

        // Measure time for StringBuilder concatenation
        startTime = System.nanoTime();
        concatenationUsingStringBuilder(n);
        endTime = System.nanoTime();
        long stringBuilderTime = endTime - startTime;
        System.out.println("StringBuilder concatenation time for " + n + " concatenations: " + stringBuilderTime / 1_000_000 + " ms");

        // Measure time for StringBuffer concatenation
        startTime = System.nanoTime();
        concatenateUsingStringBuffer(n);
        endTime = System.nanoTime();
        long stringBufferTime = endTime - startTime;
        System.out.println("StringBuffer concatenation time for " + n + " concatenations: " + stringBufferTime / 1_000_000 + " ms");
    }

}
