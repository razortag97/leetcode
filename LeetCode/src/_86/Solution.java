package _86;

public class Solution {
	
	public ListNode partition(ListNode head, int x) {
		
		ListNode fh = new ListNode(0);
		fh.next = head;
		
		ListNode l = fh;
		ListNode g = fh;
		
		while(g!=null && g.next!=null) {
			while(l!=null && l.next!=null && l.next.val<x) {
				l=l.next;
			}
			if(l.next == null)
				break;
			
			g=l;
			
			while(g!=null && g.next!=null && g.next.val >= x)
				g=g.next;
			if(g.next==null)
				break;
			
			ListNode t = g.next;
			g.next=g.next.next;
			ListNode m = l.next;
			l.next=t;
			t.next=m;
		}
		
		return fh.next; 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
