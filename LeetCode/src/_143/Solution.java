package _143;

import java.util.List;

public class Solution {
	
	public void reorderList(ListNode head) {
		ListNode slow = head;
		ListNode n1 = slow;
		ListNode fast = head.next;
		ListNode fR = null;
		
		while(fast!=null && fast.next!=null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		
		fR = rList(slow.next);
		slow.next=null;
		ListNode n = n1;
		int i=0;
		ListNode k=null;
		while(fR!=null) {
			ListNode t = n.next;
			ListNode u = fR.next;
			n.next=fR;
			fR.next = null;
			if(i>0) {
				k.next=n;
			}else {
				head = n;
			}
			k=fR;
			n=t;
			fR=u;
			i++;
		}
	}
	
	public ListNode rList(ListNode node) {
		if(node.next == null || node.next == null)
			return node;
		int i =0;
		ListNode prev = null;
		while(node !=null && node.next!=null) {
			ListNode n = node.next.next;
			ListNode t1 = node;
			ListNode t2 = node.next;
			if(i==0) {
				t1.next=null;
			}else {
				t1.next=prev;
			}
			t2.next=t1;
			prev = t2;
			node = n;
			i++;
		}
		
		if(node!=null) {
			node.next = prev;
			prev = node;
		}
		
		return prev;
	}

	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(5);
		head.next.next.next.next.next = new ListNode(6);
		head.next.next.next.next.next.next = new ListNode(7);
		head.next.next.next.next.next.next.next = new ListNode(8);
		head.next.next.next.next.next.next.next.next = new ListNode(9);
		head.next.next.next.next.next.next.next.next.next = new ListNode(10);
		head.next.next.next.next.next.next.next.next.next.next = new ListNode(11);
		
		Solution s = new Solution();
		s.reorderList(head);

	}
}
