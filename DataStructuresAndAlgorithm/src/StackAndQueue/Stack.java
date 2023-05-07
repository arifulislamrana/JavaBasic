
package StackAndQueue;


public class Stack {
    int[] arr = new int[5];
    int top = 0;
    public void push(int data){
        arr[top] = data;
        top++;
    }
    public void show(){
        for(int n : arr){
            System.out.print(n+" ");
        }
        System.out.println();
    }
    
    public int size(){
        return top;
    }
    
    public int pop(){
        top--;
        int data = arr[top];
        arr[top]=0;
        
        return data;
    }
    
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(12);
        stack.push(14);
        stack.push(16);
        stack.show();
        System.out.println(stack.pop());
        stack.show();
        System.out.println(stack.pop());
        stack.show();
        
    }
}
