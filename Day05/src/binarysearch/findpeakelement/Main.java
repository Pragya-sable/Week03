package binarysearch.findpeakelement;
// Main class for PeakElement
public class Main {
    public static void main(String[] args) {
        // Input
        int input[] = {1,3,20,4,1,0};

        // Call the findPeakElement() from PeakElement
        int peak = PeakElement.findPeakElement(input);

        // Print the index of peak element and value of peak element
        System.out.println("Peak element's index : "+peak);
        System.out.println("Peak element's value : "+input[peak]);
    }
}
