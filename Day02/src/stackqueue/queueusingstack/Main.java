package stackqueue.queueusingstack;
// Main class of Queue
public class Main {
 public static void main(String []args){
     // Object of Queue
     Queue queue = new Queue();
     // Add data
     queue.add(10);
     queue.add(20);
     queue.add(30);
     // Display the peek element and pop it
     while(!queue.isEmpty()){
         System.out.println(queue.peek());
         queue.remove();
     }
 }
}
