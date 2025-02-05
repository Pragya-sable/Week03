package stringbuffer.concatenatestring;
// Main class for StringConcatenation
public class Main {
    public static void main(String[] args) {
        // Input
        String input[] = {"String","Buffer","Builder"};

        // Call the concatenateString() from StringConcatenation class
        String result = StringConcatenation.concatenateStrings(input);

        // Print the result
        System.out.println("After Concatenation : "+result);
    }
}
