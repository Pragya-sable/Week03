package stringbuffer.concatenatestring;
// Program that uses StringBuffer to concatenate
// all the strings in the array efficiently
public class StringConcatenation {
    // Method to concatenate all the strings in the array
    public static String concatenateStrings(String input[]){
        // Create object of StringBuilder
        StringBuffer stringBuffer = new StringBuffer();

        // Iterate over each string present in the array
        for(int i = 0; i < input.length; i++){
            stringBuffer.append(input[i]);
        }
        // Return the StringBuilder as a string
        // after concatenation
        return stringBuffer.toString();
    }
}
