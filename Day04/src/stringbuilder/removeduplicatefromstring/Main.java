package stringbuilder.removeduplicatefromstring;
// Main class for RemoveDuplicates
public class Main {
    public static void main(String[] args) {
        // Input
        String input = "aabbs";

        // Call the method removeDuplicate from RemoveDuplicate class
        String result = RemoveDuplicate.removeDuplicate(input);

        // Print the result
        System.out.println("After removing duplicates : "+result);
    }
}
