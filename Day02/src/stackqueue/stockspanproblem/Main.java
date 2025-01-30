package stackqueue.stockspanproblem;
// Main class for Stock Span Problem
public class Main {
    public static void main(String args[]){
        // Stock
        int stocks[] = {100,80,60,70,60,85,100};

        int span[] = new int[stocks.length];
        // Calculate span
        StockSpan.stockSpan(stocks,span);
        // Display span
        for(int i = 0; i < span.length ; i++){
            System.out.print(span[i]+" ");
        }
        System.out.println();
    }
}
