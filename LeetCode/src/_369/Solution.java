package _369;

public class Solution {
	
	public ListNode plusOne(ListNode head) {
		int carry = h(head);
		if(carry > 0) {
			ListNode n = new ListNode(carry);
			n.next=head;
			head=n;
		}
		return head;
    }

	public int h(ListNode n) {
		int c=0;
		
		if(n.next!=null)
			c = h(n.next);
		if(n.next == null)
			n.val = n.val+c+1;
		else
			n.val = n.val+c;
		int carry = n.val/10;
		int val = n.val/10;
		n.val = val;
		return carry;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
