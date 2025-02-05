package binarysearch.occurrenceofanelement;

public class Main {
    public static void main(String[] args) {
        // input
        int[] arr = {1, 2, 2, 2, 3, 3, 4, 5, 5, 6};
        int target = 2;
        int[] result = FirstAndLastOccurrence.findFirstAndLast(arr, target);

        System.out.println("First occurrence: " + result[0]);
        System.out.println("Last occurrence: " + result[1]);

    }
}
