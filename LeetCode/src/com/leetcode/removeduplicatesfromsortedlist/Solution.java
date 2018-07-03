package com.leetcode.removeduplicatesfromsortedlist;

public class Solution {
	
	class ListNode {
		ListNode next;
		Integer val;
	}

	  public ListNode deleteDuplicates(ListNode head) {
          if(head == null || head.next == null)
           return head;
        
        ListNode p = null;
        ListNode c = head;
        
        while(c!= null & c.next != null){
            p=c;
            c=c.next;
            
            if(p.val == c.val){
                while(p.val == c.val && c.next != null && p.val == c.next.val){
                    c=c.next;
                }
                p.next = c.next;
                c.next = null;
                c=p.next;
            }
        }
        
        return head;
    }
}
