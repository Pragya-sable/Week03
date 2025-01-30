package stackqueue.sortastack;
import java.util.*;
public class InsertSorted {
    public static void insertSorted(Stack<Integer> stack, int element) {
        // Base case: if the stack is empty or the element is greater than the top of the stack
        if (stack.isEmpty() || element > stack.peek()) {
            stack.push(element);
            return;
        }

        // Pop the top element and recursively insert the element in the sorted stack
        int top = stack.pop();
        insertSorted(stack, element);

        // Push the popped element back to maintain the sorted order
        stack.push(top);
    }
}