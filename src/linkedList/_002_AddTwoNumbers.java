package linkedList;

/*
	You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
	
	You may assume the two numbers do not contain any leading zero, except the number 0 itself.
	
	Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
	Output: 7 -> 0 -> 8
 */

import static common.StaticMethod.createLinkedlistOfLengthN;
import static common.StaticMethod.printNode;

import dto.ListNode;

public class _002_AddTwoNumbers {
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		int carrier = 0, tempSum = 0;
		
		ListNode curr1 = l1, curr2 = l2, sum = new ListNode(0), result = new ListNode(0);
		
		result.next = sum;
		
		while(curr1 != null && curr2 != null){
			tempSum = carrier + curr1.val + curr2.val;
			curr1 = curr1.next;
			curr2 = curr2.next;
            
            carrier = tempSum/10;
			sum.val = tempSum%10;
			
			if(curr1 == null && curr2 != null){
				curr1 = new ListNode(0);
			}
			else if(curr1 != null && curr2 == null){
				curr2 = new ListNode(0);
			}
            else if(curr1 == null && curr2 == null){
                sum.next = carrier > 0 ? new ListNode(carrier) : null;
                break;
            }
			
			sum.next = new ListNode(carrier);
			sum = sum.next;
		}

		
        return result.next;
    }
	
	public static void main(String[] args) {
    	ListNode testNode1 = createLinkedlistOfLengthN(5);
    	ListNode testNode2 = createLinkedlistOfLengthN(5);
    	
    	printNode(addTwoNumbers(testNode1, testNode2));
	}
}
