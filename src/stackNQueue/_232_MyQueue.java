package stackNQueue;

/*
	Implement the following operations of a queue using stacks.
	
	push(x) -- Push element x to the back of queue.
	pop() -- Removes the element from in front of queue.
	peek() -- Get the front element.
	empty() -- Return whether the queue is empty.
	Notes:
	You must use only standard operations of a stack -- which means only push to top, peek/pop from top, size, and is empty operations are valid.
	Depending on your language, stack may not be supported natively. You may simulate a stack by using a list or deque (double-ended queue), as long as you use only standard operations of a stack.
	You may assume that all operations are valid (for example, no pop or peek operations will be called on an empty queue).
 */

import java.util.Stack;

public class _232_MyQueue {
	public class MyQueue {
	    private Stack<Integer> nodes;

	    /** Initialize your data structure here. */
	    public MyQueue() {
	        this.nodes = new Stack<>();
	    }

	    /** Push element x to the back of queue. */
	    public void push(int x) {
	        this.nodes.push(x);
	    }

	    /** Removes the element from in front of queue and returns that element. */
	    public int pop() {
	        int result = this.nodes.elementAt(0);
	        this.nodes.remove(0);
	        return result;
	    }

	    /** Get the front element. */
	    public int peek() {
	        return this.nodes.elementAt(0);
	    }

	    /** Returns whether the queue is empty. */
	    public boolean empty() {
	        return this.nodes.size()==0;
	    }
	}
	
	public static void main(String[] args) {
		MyQueue testQueue = new _232_MyQueue().new MyQueue();
		testQueue.push(1);
		testQueue.push(2);
		testQueue.push(3);
    	
		System.out.println(testQueue.pop());
		System.out.println(testQueue.peek()); 	
	}
}

