package sorting.mergesort.sortbookprice;
// Class Book used for sort the book price in ascending order
public class Book {
    // Method for divide the array into small parts and sort them
    public static void sortBookPrice(int price[],int startIndex,int endIndex){
        if(startIndex >= endIndex)
        {
            return;
        }
        // Find the mid of the price array
        int mid = startIndex + (endIndex - startIndex) / 2;
        // sort the left part of price array
        sortBookPrice(price,startIndex,mid);
        // sort the right part of price array
        sortBookPrice(price,mid+1,endIndex);
        // merge the left and right part
        mergeSortedBookPrice(price,startIndex,mid,endIndex);
    }

    // Method for merge the sorted array
    public static void mergeSortedBookPrice(int price[],int startIndex,int mid, int endIndex){
        int temp[] = new int[endIndex-startIndex+1];
        // iterate for left part
        int i = startIndex;
        // iterate for right part
        int j = mid+1;
        // iterate for temp array
        int k = 0;
        // iterate for left and right part
        while(i <= mid && j <= endIndex){
            if(price[i] < price[j]){
                temp[k] = price[i];
                i++;
            }
            else {
                temp[k] = price[j];
                j++;
            }
            k++;
        }
        // iterate for left part
        while(i <= mid){
            temp[k++] = price[i++];
        }

        // iterate for right part
        while(j <= endIndex){
            temp[k++] = price[j++];
        }

        // Copy temp to original array
        for(k = 0, i = startIndex; k < temp.length; k++, i++){
            price[i] = temp[k];
        }
    }

    // Method for display
     public static void prints(int price[]){
         System.out.print("Sorted Book Price : ");
        for(int i=0;i<price.length;i++){
            System.out.print(price[i] +" ");
        }
        System.out.println();
    }
}
