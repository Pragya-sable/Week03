package sorting.mergesort.sortbookprice;
// Main class for Sort Book Price
public class Main {
    public static void main(String[] args) {
        int price[] = {500,850,640,790,1000,150};
        // call sortBookprice() from Book
        Book.sortBookPrice(price,0,price.length-1);
        Book.prints(price);
    }
}
