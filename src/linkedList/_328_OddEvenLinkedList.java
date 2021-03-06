package linkedList;
/*
 Given a singly linked list, group all odd nodes together followed by the even nodes. Please note here we are talking about the node number and not the value in the nodes.
 
 You should try to do it in place. The program should run in O(1) space complexity and O(nodes) time complexity.
 
 Example:
 Given 1->2->3->4->5->NULL,
 return 1->3->5->2->4->NULL.
 
 Note:
 The relative order inside both the even and odd groups should remain as it was in the input. 
 The first node is considered odd, the second node even and so on ...
*/

import dto.ListNode;
import static common.StaticMethod.*;

public class _328_OddEvenLinkedList {
	
    public static ListNode oddEvenList(ListNode head) {
    	if (head != null) {
    	    
            ListNode odd = head, even = head.next, evenHead = even; 
        
            while (even != null && even.next != null) {
                odd.next = even.next;		// set next pointer of the current odd pointer to next odd number node
                odd = odd.next;				// set the current odd pointer to next odd number node
                even.next = odd.next; 		// similar steps to the even pointer 
                even = even.next;
            }
            odd.next = evenHead; 
        }
        return head;
    }
    
    public static void main(String[] args) {
    	ListNode testNode1 = createLinkedlistOfLengthN(8);    	
    	ListNode testNode2 = createLinkedlistOfLengthN(3);
    	
    	printNode(oddEvenList(testNode1));
    	printNode(oddEvenList(testNode2)); 	
	}   
    
}