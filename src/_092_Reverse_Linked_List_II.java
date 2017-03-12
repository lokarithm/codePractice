/*
 Reverse a linked list from position m to n. Do it in-place and in one-pass.
 
 For example:
 Given 1->2->3->4->5->NULL, m = 2 and n = 4,
 
 return 1->4->3->2->5->NULL.
 
 Note:
 Given m, n satisfy the following condition:
 1 ≤ m ≤ n ≤ length of list.
*/

import static common.StaticMethod.*;

import dto.ListNode;

public class _092_Reverse_Linked_List_II {
	public static ListNode reverseBetween(ListNode head, int m, int n) {
		if(m == n || m > n || head == null) return head;
		
        /*
         result - a dummy node the point to head, so we can start at node 0-th
         pre	- the node right before m-th node
         rHead	- the m-th node, head of the reverse link list
         curr	- the iterator node 
         */
        ListNode result = new ListNode(0), pre = result, rHead = null, curr = null;
        result.next = head;
        
        for(int i=0;i<=n;i++){
        	if(i < m-1){
        		pre = pre.next; // keep iterating to the (m-1)-th node with pre 
        	}
        	else if(i == m){
        		rHead = pre.next;	// set pre as the m-th node
        		curr = rHead.next;	// set curr node as the next node
        	}
        	else if(i > m){
        		/*
        		 * this part insert every next node in the iteration as
        		 * the next node of pre node
        		 */
        		rHead.next = curr.next;	// points rHead to the next node of the iteration
        		curr.next = pre.next;	// points iterator node to the node right after the pre node
        		pre.next = curr;		// points the pre node to iterator node
        		curr = rHead.next;		// points the iterator node to the next node of the iteration
        	}
        }
        
        return result.next;
    }
	
	public static void main(String[] args) {
    	ListNode testNode1 = createLinklistOfLengthN(5);
    	
    	printNode(reverseBetween(testNode1, 2, 5));
	}
}
