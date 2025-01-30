package stackqueue.slidingwindowmaximum;
// Main class of Sling Window Maximum
public class Main {
    public static void main(String args[]){
        // input the array element
        int arr[] = {4,1,3,5,1,2,3,2,1,1,5};
        // Window size
        int k = 3;
        // call the method which find the max of sliding window
        SlidingWindow.printMax(arr,k);
    }
}
