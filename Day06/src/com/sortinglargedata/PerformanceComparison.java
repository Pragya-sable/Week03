package com.sortinglargedata;

import java.util.Arrays;
import java.util.Random;
// Program to compare sorting algorithms Bubble Sort (O(N²)),
// Merge Sort (O(N log N)), and Quick Sort (O(N log N)).
public class PerformanceComparison {

    // Method for bubble sort
    public static void bubbleSort(int input[]){
        boolean swap;
        // Iterate over the array
        for(int i = 0; i < input.length; i++){
            swap = false;
            for(int j = 0; j < input.length - i -1; j++){
                // Compare adjacent elements
                if(input[j] > input[j+1]) {
                    // Swap
                    int temp = input[j];
                    input[j] = input[j+1];
                    input[j+1] = temp;
                    swap = true;
                }
            }
            // if no swap is occurred
            if(swap == false)
                break;
        }
    }
    // Method for Merge sort
    public static void mergeSort(int input[], int start, int end){
        if(start >= end) {
            return;
        }
        // Find the mid of the  array
        int mid = (start + end) / 2;
        // sort the left part of  array
        mergeSort(input, start,mid - 1);
        // sort the right part of array
        mergeSort(input, mid + 1, end);
        // merge the left and right part
        merge(input, start, mid, end);
    }
    // Method for merge the sorted array
    public static void merge(int input[], int start, int mid, int end){

        int temp[] = new int[end - start +1];
        // iterate for left part
        int i = start;
        // iterate for right part
        int j = mid + 1;
        // iterate for temp array
        int k = 0;
        // iterate for left and right part
        while(i <= mid && j <= end){
            if(input[i] < input[j]){
                temp[k] = input[i];
                i++;
            }
            else {
                temp[k] = input[j];
                j++;
            }
            k++;
        }
        // iterate for left part
        while(i <= mid){
            temp[k++] = input[i++];
        }
        // iterate for right part
        while(j <= end){
            temp[k++] = input[j++];
        }
        // Copy temp to original array
        for(k = 0, i = start; k < temp.length; k++, i++){
            input[i] = temp[k];
        }
    }

    // Method for Quick sort
    public static void quickSort(int input[], int start, int end){
        if(start >= end){
            return;
        }
        int pIndex = partition(input, start, end);
        // Left Part
        quickSort(input, start, pIndex-1);
        // Right Part
        quickSort(input, pIndex+1, end);
    }
    // Method for partition
    public static int partition(int input[], int start, int end){
        int pivot = input[end - 1];
        // make place for element smaller than pivot
        int i = start - 1;
        for(int j = start; j < input.length; j++){
            if(input[j] <= pivot){
                i++;
                // Swap
                int temp = input[j];
                input[j] = input[i];
                input[i] = temp;
            }
        }
        i++;
        // Swap
        int temp = pivot;
        input[end] = input[i];
        input[i] = temp;
        return i;
    }

    public static void performanceTest(int n){
        // Create random array
        Random random = new Random();
        int input [] = new int[n];
        for(int i = 0; i < n; i++){
            input[i] = random.nextInt(100000);
        }

        // Measure time for Bubble Sort
        int[] bubbleArray = Arrays.copyOf(input, input.length);
        long startTime = System.nanoTime();
        bubbleSort(bubbleArray);
        long endTime = System.nanoTime();
        long bubbleSortTime = endTime - startTime;
        System.out.println("Bubble sort time for " +n+ ": " +bubbleSortTime+ " ns");

        // Measure time for Merge Sort
        int[] mergeArray = Arrays.copyOf(input, input.length);
         startTime = System.nanoTime();
         mergeSort(mergeArray,0, mergeArray.length - 1);
         endTime = System.nanoTime();
         long mergeSortTime = endTime - startTime;
         System.out.println("Merge sort time for " +n+ ": " +mergeSortTime+ " ns");

        // Measure time for Quick Sort
        int[] quickArray = Arrays.copyOf(input, input.length);
        startTime = System.nanoTime();
        mergeSort(quickArray,0, mergeArray.length - 1);
        endTime = System.nanoTime();
        long quickSortTime = endTime - startTime;
        System.out.println("Quick sort time for " +n+ ": " +quickSortTime+ " ns");

    }

}
