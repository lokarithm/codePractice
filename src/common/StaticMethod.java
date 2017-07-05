package common;

import dto.ListNode;

public class StaticMethod {
	/**
	 * Print the value of each node line by line 
	 * @param  node head node of a single linked list
	 * @return none
	 */
	public static void printNode(ListNode node){
    	while(node != null){
    		System.out.println(node.val);
    		node = node.next;
    	}
    	System.out.println("Done.");
    }
    
	/**
	 * Generate a single linked list with n nodes 
	 * @param  n number of nodes of a single linked list
	 * @return head node of a single linked list with n nodes
	 */
    public static ListNode createLinkedlistOfLengthN(int n){
    	ListNode head = new ListNode(1);
    	ListNode curr = head;
    	
    	for(int i=2;i<=n;i++){
    		curr.next = new ListNode(i);
    		curr = curr.next;
    	}
    	
    	return head;
    }
    
    /**
	 * Generate a cycled single linked list with n nodes
	 * @param  n number of nodes of a single linked list
	 * @param  m-th node before entering a loop
	 * @param  o-th node being pointed to as loop
	 * @return head node of a single linked list with n nodes
	 */
    public static ListNode createCycledLinkedlistOfLengthN(int n, int m, int o){
    	ListNode head = new ListNode(1);
    	ListNode curr = head;
    	ListNode mNode  = new ListNode(m), oNode = new ListNode(o);
    	int count=1;
    	
    	for(int i=2;i<=n;i++){
    		if(count == m){
    			mNode = curr;
    		}
    		
    		if(count == o){
    			oNode = curr;
    		}
    		count++;
    		curr.next = new ListNode(i);
    		curr = curr.next;
    		
    	}
    	
    	mNode.next = oNode;
    	
    	return head;
    }
}
