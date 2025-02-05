package stringbuilder.reverseastring;
// program that uses StringBuilder to reverse a given string
public class ReverseString {
    // Method for reverse the input string
    public static String reverseString(String input){
        // Create object of StringBuilder
        StringBuilder stringBuilder = new StringBuilder();

        // Append the input string to the StringBuilder
        stringBuilder.append(input);

        // reverse the string using reverse() method
        stringBuilder.reverse();

        // Convert the StringBuilder back to a string and then
        // return the reverse string
        return stringBuilder.toString();
    }


}
