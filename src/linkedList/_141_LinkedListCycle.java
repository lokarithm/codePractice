/*
 Given a linked list, determine if it has a cycle in it.

 */
package linkedList;

import static common.StaticMethod.*;
import dto.ListNode;

public class _141_LinkedListCycle {
	public static boolean hasCycle(ListNode head){
		if(head == null){
			return false;
		}
		
		ListNode slowNode = head;
		ListNode fastNode = head.next;
		
		while(slowNode != null && fastNode != null){
			if(slowNode == fastNode){
				return true;
			}
			else{
				slowNode = slowNode.next;
				fastNode = fastNode.next.next;
			}
		}
		
		return false;
	}
	
	public static void main(String[] args) {
    	//printNode(createCycledLinkedlistOfLengthN(5, 4, 2));
		System.out.println(hasCycle(createLinkedlistOfLengthN(1)));
    	System.out.println(hasCycle(createCycledLinkedlistOfLengthN(5, 4, 2)));
	}
}
