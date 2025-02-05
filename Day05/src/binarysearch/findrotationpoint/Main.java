package binarysearch.findrotationpoint;
// Main class of RotationalPoint
public class Main {
    public static void main(String[] args) {
        // Input
        int input[] = {6,7,9,15,19,2,3};

        // Call the findRotationalPoint() from RotationalPoint class
        int rotationPoint = RotationalPoint.findRotationalPoint(input);

        // Print the result
        System.out.println("Rotation point is at index : "+ rotationPoint);
    }
}
