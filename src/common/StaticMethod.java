package common;

import dto.ListNode;

public class StaticMethod {
	public static void printNode(ListNode node){
    	while(node != null){
    		System.out.println(node.val);
    		node = node.next;
    	}
    	System.out.println("Done.");
    }
    
    public static ListNode createLinklistOfLengthN(int n){
    	ListNode head = new ListNode(1);
    	ListNode curr = head;
    	
    	for(int i=2;i<=n;i++){
    		curr.next = new ListNode(i);
    		curr = curr.next;
    	}
    	
    	return head;
    }
}
