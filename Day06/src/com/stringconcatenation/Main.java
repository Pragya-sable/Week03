package com.stringconcatenation;
// Main class
public class Main {
    public static void main(String[] args) {
        // Test performance for various dataset sizes
        int[] sizes = {1000, 10000, 100000, 1000000};
        for (int size : sizes) {
            PerformanceComparison.performanceTest(size);
        }
    }
}
