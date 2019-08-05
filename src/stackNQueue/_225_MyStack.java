package stackNQueue;

import java.util.LinkedList;

/*
	Implement the following operations of a stack using queues.
	
	push(x) -- Push element x onto stack.
	pop() -- Removes the element on top of the stack.
	top() -- Get the top element.
	empty() -- Return whether the stack is empty.
	Notes:
	You must use only standard operations of a queue -- which means only push to back, peek/pop from front, size, and is empty operations are valid.
	Depending on your language, queue may not be supported natively. You may simulate a queue by using a list or deque (double-ended queue), as long as you use only standard operations of a queue.
	You may assume that all operations are valid (for example, no pop or top operations will be called on an empty stack).
 */

import java.util.Queue;

public class _225_MyStack {
	public class MyStack {
		private Queue<Integer> nodes;
		private int top;
		
	    /** Initialize your data structure here. */
	    public MyStack() {
	        this.nodes = new LinkedList<Integer>();
	    }
	    
	    /** Push element x onto stack. */
	    public void push(int x) {
	        this.nodes.add(x);
	        top = x;
	    }
	    
	    /** Removes the element on top of the stack and returns that element. */
	    public int pop() {
	        int result = top;

	        this.nodes.remove(top);
	        Queue<Integer> newQueue = new LinkedList<Integer>();

	        while(this.nodes.size()>1){
	        	newQueue.add(this.nodes.remove());
	        }
	        
	        if(this.nodes.size()==1){
	        	top = this.nodes.remove();
	        }
	        
	        this.nodes = newQueue;

	        return result;
	    }
	    
	    /** Get the top element. */
	    public int top() {
	    	return this.top;
	    }
	    
	    /** Returns whether the stack is empty. */
	    public boolean empty() {
	        return this.nodes.isEmpty();
	    }
	}
	
	public static void main(String[] args) {
		MyStack testStack = new _225_MyStack().new MyStack();
		testStack.push(1);
		testStack.push(2);
		testStack.push(3);
    	
		System.out.println(testStack.pop());
		System.out.println(testStack.top()); 
		System.out.println(testStack.pop()); 
	}
}
