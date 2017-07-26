package common;

public class QueueOfLinkedList {
	public class MyLinkedListQueue {
	    public class Node{
	        protected int val;
	        protected Node next;

	        public Node(){
	            val = 0;
	            next = null;
	        }
	        
	        public Node(int x){
	            val = x;
	            next = null;
	        }
	    }
	    
	    private Node front;		//front most node in the queue
	    private Node tail;      //newest node in the queue
	    protected int size;

	    /** Initialize your data structure here. */
	    public MyLinkedListQueue() {
	        this.size = 0;
	    }

	    /** Push element x to the back of queue. */
	    public void push(int x) {
	        Node newNode = new Node(x);
	        
	        if(this.front == null){
	            this.front = newNode;
	            this.tail = newNode;
	        }
	        else{
	            newNode.next = this.tail;
	            this.tail = newNode;
	        }

	        this.size += 1;
	    }

	    /** Removes the element from in front of queue and returns that element. */
	    public int pop() {
	        Node curr = this.tail;
	        int result = front.val;

	        if(this.size > 1){
	            while(curr != front){
	                if(curr.next == front){
	                    break;
	                }

	                curr = curr.next;
	            }

	            this.front = curr;
	            curr.next = null; 
	        }
	        else{
	            this.front=null;
	            this.tail=null;
	        }

	        this.size -= 1;
	        
	        return result;
	    }

	    /** Get the front element. */
	    public int peek() {
	        return this.front.val;
	    }

	    /** Returns whether the queue is empty. */
	    public boolean empty() {
	        return this.size == 0;
	    }

	}
}
