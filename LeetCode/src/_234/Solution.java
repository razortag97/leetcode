package _234;

import _206.ListNode;

public class Solution {
	
	 public boolean isPalindrome(ListNode head) {

		 if(head == null)
			 return true;
        
         if(head.next == null)
             return true;
		 
		 ListNode s = head;
		 ListNode f = head.next;
		 
		 while(f!=null && f.next != null) {
			 s=s.next;
			 f=f.next.next;
		 }
		 
		 ListNode r = reverseList(s.next);
		 s.next = r;
		 
		 ListNode f1 = s.next;
		 ListNode s1 = head;
		 
		 while(f1!=null) {
			 if(s1.val != f1.val)
				 return false;
			 s1 = s1.next;
			 f1 = f1.next;
		 }
		 
	     return true;   
	 }
	 
	 public ListNode reverseList(ListNode node) {
		 ListNode prev = node;
		 node = node.next;
		 prev.next = null;
		 
		 while(node != null) {
			 ListNode newH = node.next;
			 node.next = prev;
			 prev = node;
			 node = newH;
		 }
		 
		 return prev;
	 }
	 
	 public ListNode reverseListR(ListNode node) {
		 
		 if(node == null || node.next == null)
			 return node;
		 
		 ListNode newHead = reverseListR(node.next);
		 ListNode tail = newHead;
		 while(tail.next != null)
			 tail = tail.next;
		 node.next = null;
		 tail.next = node;
		 return newHead;
	 }

	
	public static void main(String[] args) {
		
		ListNode head = new ListNode(1);
		
		head.next = new ListNode(2);
		head.next.next = new ListNode(1);
		//head.next.next = new ListNode(3);
		//head.next.next.next = new ListNode(2);
		//head.next.next.next.next = new ListNode(1);
		
		Solution s = new Solution();
		Boolean b = s.isPalindrome(head);
		System.out.println(b);
	}
	
}
