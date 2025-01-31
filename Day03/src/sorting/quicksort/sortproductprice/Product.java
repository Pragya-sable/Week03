package sorting.quicksort.sortproductprice;
// Class Product used for sort the price of product
public class Product {
    public static void sortProductPrice(int price[], int startIndex, int endIndex){
        if(startIndex >= endIndex){
            return;
        }
        int pIndex = partition(price,startIndex,endIndex);
        // Left Part
        sortProductPrice(price,startIndex,pIndex-1);
        // Right Part
        sortProductPrice(price,pIndex+1,endIndex);
    }

    public static int partition(int price[],int startIndex,int endIndex){
        int pivot = price[endIndex];
        // make place for element smaller than pivot
        int i = startIndex-1;

        for(int j = startIndex; j < endIndex ; j++){
            if(price[j] <= pivot){
                i++;
                //Swap
                int temp = price[j];
                price[j] = price[i];
                price[i] = temp;
            }
        }
        i++;
        // Swap
        int temp = pivot;
        price[endIndex] = price[i];
        price[i] = temp;
        return i;
    }
    // Method for display
    public static void prints(int price[]){
        System.out.print(" Sorted Product Price : ");
        for(int i = 0; i < price.length; i++){
            System.out.print(price[i] +" ");
        }
        System.out.println();
    }
}
