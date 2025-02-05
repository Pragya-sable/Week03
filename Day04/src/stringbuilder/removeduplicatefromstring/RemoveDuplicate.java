package stringbuilder.removeduplicatefromstring;
// Program that uses StringBuilder to remove all duplicate characters
// from a given string while maintaining the original order
import java.util.HashSet;

public class RemoveDuplicate {
    // Method to remove duplicate from given string
    public static String removeDuplicate(String input){
        // Create object of StringBuilder
        StringBuilder stringBuilder = new StringBuilder();

        // Initialize a HashSet to keep track of characters
        HashSet<Character> set = new HashSet<>();

        // Iterate over each character in the string
        for(int i = 0; i < input.length(); i++){
            // If the character is not in the HashSet,
            // append it to the StringBuilder and add it to the HashSet
            if(!set.contains(input.charAt(i))){
                stringBuilder.append(input.charAt(i));
                set.add(input.charAt(i));
            }
        }

        // Return the StringBuilder as a string without duplicates
        return stringBuilder.toString();
    }
}
