/*
 Reverse a singly linked list.
 */

import dto.ListNode;
import static common.StaticMethod.*;

public class _206_ReverseLinkedList {
	public static ListNode reverseList(ListNode head) {
		if(head == null) return head;
		ListNode curr = null;

        while(head.next != null){
        	ListNode temp = head.next;	// preserve current node
    		head.next = curr;
    		curr = head;
    		head = temp;
        }
        
        head.next = curr;

        return head;
    }
	
	public static void main(String[] args) {
		ListNode testNode1 = createLinklistOfLengthN(8);    	
    	ListNode testNode2 = createLinklistOfLengthN(3);
    	
    	printNode(reverseList(testNode1));
    	printNode(reverseList(testNode2));
	}
}
