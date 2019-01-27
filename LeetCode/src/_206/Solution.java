package _206;

public class Solution {
	
	public ListNode reverseList(ListNode head) {
		reverseHelper(head);
		return null;
	}
	
	public ListNode reverseHelper(ListNode currentNode) {
		if(currentNode == null) {
			return currentNode;
		}
		ListNode nextNode = currentNode.next;
		reverseHelper(nextNode);
		return null;
	}
	
	public static void main(String[] args) {
		Solution sol = new Solution();
		ListNode head = Solution.createList();
		sol.reverseList(head);
	}
	
	public static ListNode createList() {
		
		ListNode head = new ListNode(1);
		
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(5);
		
		return head;
	}

}
