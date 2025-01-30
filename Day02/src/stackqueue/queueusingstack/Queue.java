package stackqueue.queueusingstack;
import java.util.*;
// Class with name Queue is used for implementation of queue using stack
public class Queue {
    // Here we use java's stack class
    Stack<Integer>stack1 = new Stack<>();
    Stack<Integer>stack2 = new Stack<>();

    // Check the stack1 is empty or not
    public  boolean isEmpty(){
        return stack1.isEmpty();
    }

    // Add data
    public  void add(int data){
        // Check if the fist stack is empty or not
        // if it is not empty then pop from stack1
        // and push into stack2
        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        // if it is empty then push the data into stack1
        stack1.push(data);
        while(!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
    }

    // Remove
    public  int remove(){
        while(stack1.isEmpty()){
            System.out.println("Queue is empty");
        }
        return stack1.pop();
    }

    // Peek
    public  int peek(){
        while(stack1.isEmpty()){
            System.out.println("Queue is empty");
        }
        return stack1.peek();
    }


}
