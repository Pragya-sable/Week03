package stackqueue.sortastack;
import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Create a stack
        Stack<Integer> s = new Stack<>();

        // Push elements into the stack
        s.push(34);
        s.push(3);
        s.push(31);
        s.push(98);
        s.push(92);
        s.push(23);

        // Sort the stack
        SortStack.sort(s);

        // Print the sorted elements
        System.out.print("Sorted numbers are: ");
        System.out.println("Sorted Stack: " + s);
    }
}
