package stackqueue.sortastack;
import java.util.*;
public class SortStack {
    public static void sort(Stack<Integer>stack){
        // If the stack is empty, return
        if(stack.isEmpty())
        {
            return;
        }
        int top = stack.pop();
        // Sort the remaining elements in the stack using
        // recursion
        sort(stack);
        // Insert the popped element back in sorted order
        InsertSorted.insertSorted(stack, top);


    }
}
