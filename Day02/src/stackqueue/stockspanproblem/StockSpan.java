package stackqueue.stockspanproblem;

import java.util.Stack;
// Class with name StockSpan for the purpose of calculate the span (number of consecutive days the price was less than or equal to the current day's price)
public class StockSpan {

    public static void stockSpan(int stocks[], int span[]){
        // Use a stack to keep track of indices of prices
       Stack<Integer>stack = new Stack<>();
       // At first index of span assign 1
       span[0] = 1;
       // push the 0 index into the stack
       stack.push(0);
       for(int i = 1; i < stocks.length; i++){
           // Store the current price of stock
           // into the currentPrice variable
           int currentPrice = stocks[i];
           // Iterate loop until the stack is empty and check the current price is greater than
           // the stock which is present at the peek of stack
           while(!stack.isEmpty() && currentPrice > stocks[stack.peek()]) {
               stack.pop();
           }
           // After iterating the loop check the stack is empty or not
           // if it is empty then
           // in span add 1 with index
           if(stack.isEmpty()){
               span[i] = i+1;
           }
           // if it is not empty then
           // do peek()operation store it in prevHigh variable
           // and subtract with index and store it in span
           else {
               int prevHigh = stack.peek();
               span[i] = i - prevHigh;
           }
           // push index into the stack
           stack.push(i);
       }
    }
}
