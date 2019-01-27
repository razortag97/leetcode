package _82;

public class Solution {
	 public ListNode deleteDuplicates(ListNode head) {
	        if(head == null || head.next == null)
	            return head;
	        
	        ListNode slow=null;
	        ListNode fast=null;
	        
	        ListNode fakeHead = new ListNode(0);
	        fakeHead.next = head;
	        
	        slow=fakeHead;
	        fast=head;
	        
	        while(fast!=null && fast.next!=null){//questionable condition
	            if(fast.val == fast.next.val){
	                while(fast.next!=null && fast.val == fast.next.val){
	                    fast = fast.next;
	                }
	                slow.next=fast.next;
	                fast = fast.next;
	                continue;
	            }//if ends
	            if(fast == null)
	                break;
	            slow=fast;
	            fast=fast.next;
	        }//while ends
	        
	        return fakeHead.next;
	    }
}
