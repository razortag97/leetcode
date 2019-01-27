package _61;

import _206.ListNode;

public class Solution {

	public ListNode rotateRight(ListNode head, int k) {
        if(k==0 || head == null || head.next == null)
            return head;
       
        ListNode curr = head;
        int len=0;
        while(curr.next!=null){
            curr = curr.next;
            len++;
        }
        
        len++;
        curr.next = head;
        curr = curr.next;
        k = k % len;
        
        int i=1;
        while(i<k){
            curr = curr.next;
            i++;
        }
        
        ListNode nH = curr.next;
        curr.next = null;
        return nH;
     }
	
	public static void main(String[] args) {
		Solution sol = new Solution();
		ListNode head = Solution.createList();
		int k=2;
		head = sol.rotateRight(head, k);
		System.out.println(head.val);
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
