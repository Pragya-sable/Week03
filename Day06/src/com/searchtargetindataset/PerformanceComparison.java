package com.searchtargetindataset;

import java.util.Arrays;
import java.util.Random;
// Program to compare the performance of Linear Search (O(N))
// and Binary Search (O(log N)) on different dataset sizes
public class PerformanceComparison {
    // Method for linearSearch
    public static int linearSearch(int input[], int target){
        for(int i = 0; i < input.length; i++){
            if(input[i] == target){
                // when target found return the index
                return i;
            }
        }
        return -1;
    }
    // Method for binarySearch
    public static int binarySearch(int input[], int target){
        int start = 0;
        int end = input.length - 1;

        while(start <= end){
            // calculate mid
            int mid = (start + end) / 2;
            // check if target is present at mid
            if(input[mid] == target){
                return mid;
            }

            // If target greater, ignore left half
            if(input[mid] < target)
            {
                start = mid + 1;
            }
            // If target smaller, ignore right half
            else {
                end = mid - 1;
            }
        }
        return -1;
    }

    // Method for performance check
    public static void performanceTest(int n){
        // Create random array
        Random random = new Random();
        int input [] = new int[n];
        for(int i = 0; i < n; i++){
            input[i] = random.nextInt(100000);
        }

        // For Linear Search
        long startTime = System.nanoTime();
        // Search for a random target
        int linearSearchResult = linearSearch(input, random.nextInt(100000));
        long endTime = System.nanoTime();
        long linearSearchTime = endTime - startTime;
        System.out.println("Linear Search time for "+n+": " +linearSearchTime+ " ns");

        // For Binary Search
        // Sort the array first
        Arrays.sort(input);
        startTime = System.nanoTime();
        // Search for a random target
        int binaryResult = binarySearch(input,random.nextInt(100000));
        endTime = System.nanoTime();
        long binarySearchTime = endTime - startTime;
        System.out.println("Binary Search time for "+n+": "  +binarySearchTime+ " ns");
    }

}
