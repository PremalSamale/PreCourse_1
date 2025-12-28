// Time Complexity : o(1)
// Space Complexity :o(1)
// Did this code successfully run on Leetcode : N/A it is not a leetcode problem
// Any problem you faced while coding this :No
// Your code here along with comments explaining your approach
class Stack { 
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
    private int capacity;
  
    boolean isEmpty() 
    { 
        if(top == -1){
            return true;
        }
        return false;
    } 

    public Stack(int capacity) 
    { 
        //Initialize your constructor 
        capacity = MAX;
        a[] = new int[capacity];
        top = -1;
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        if(top = capcity -1){
            return;
        }
        a[++top] =x;
        return true;
    } 
  
    int pop() 
    { 
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return -1;
        }
        return a[top--];
    } 
  
    int peek() 
    { 
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        return a[top];
    } 
} 
  
// Driver code 
class Main { 
    public static void main(String args[]) 
    { 
        Stack s = new Stack(); 
        s.push(10); 
        s.push(20); 
        s.push(30); 
        System.out.println(s.pop() + " Popped from stack"); 
    } 
}
