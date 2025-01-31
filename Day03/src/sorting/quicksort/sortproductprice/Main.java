package sorting.quicksort.sortproductprice;
// Main class for Sort The Product Price
public class Main {
    public static void main(String[] args) {
        int price[] = {250,150,894,550,426};
        // call sortProductPrice method from Product
        Product.sortProductPrice(price,0,price.length-1);
        // call for prints()
        Product.prints(price);

    }
}
