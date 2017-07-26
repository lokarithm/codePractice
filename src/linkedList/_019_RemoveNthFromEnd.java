package linkedList;

/*
	Given a linked list, remove the nth node from the end of list and return its head.
	
	For example,
	
	   Given linked list: 1->2->3->4->5, and n = 2.
	
	   After removing the second node from the end, the linked list becomes 1->2->3->5.
	Note:
	Given n will always be valid.
	Try to do this in one pass.
 */

import static common.StaticMethod.createLinkedlistOfLengthN;
import static common.StaticMethod.printNode;

import dto.ListNode;

public class _019_RemoveNthFromEnd {
	public static ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode pre = new ListNode(0);
		pre.next = head;
		ListNode parent = new ListNode(0);
		parent.next = head;
		
		ListNode curr = parent.next;
		
		while(curr != null){
			if(nodeIsFound(curr, n)){
				parent.next = curr.next;
				return curr == pre.next ? curr.next : pre.next;
			}
			else{
				parent = parent.next;
				curr = curr.next;
			}
		}
		
        return pre.next;
    }
	
	public static boolean nodeIsFound(ListNode curr, int n){
		while(n > 0){
			curr = curr.next;
			n--;
		}
		
		return curr == null;
	}
	
	public static void main(String[] args) {
    	ListNode testNode1 = createLinkedlistOfLengthN(1);
    	
    	printNode(removeNthFromEnd(testNode1, 1));
	}
}

