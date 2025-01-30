package stackqueue.slidingwindowmaximum;
import java.util.*;
public class SlidingWindow {
    public static void printMax(int arr[], int k){
        Deque<Integer>deque = new ArrayDeque<Integer>();

        // Process first k element of window
        int i;
        for( i =0; i < k; ++i){
            while(!deque.isEmpty() && arr[i] >= arr[deque.peekLast()])
                // remove from rear
                deque.removeLast();

            // Add new element at rear of queue
            deque.addLast(i);
        }

        // Process rest of the element
        // from arr[k] to arr[arr.length-1]
        for(;i < arr.length; ++i){
            // the element at the front of the
            // queue is the largest element of the
            // previous window so print it
            System.out.print(arr[deque.peek()]+" ");

            // Remove the element which are out of this window
            while((!deque.isEmpty()) && deque.peek() <= i-k)
                deque.removeFirst();
            // Remove all elements smaller than the currently being
            // added element (remove useless element)
            while(!deque.isEmpty() && arr[i] >= arr[deque.peekLast()])
                // remove from rear
                deque.removeLast();

            // Add new element at rear of queue
            deque.addLast(i);
        }
        // Print the maximum element of last window
        System.out.print(arr[deque.peek()]+" ");
    }
}
