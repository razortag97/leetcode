package _141;

import java.util.HashSet;
import java.util.Set;

public class Solution {
	
	public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null)
            return false;
        
        Set<ListNode> set = new HashSet<ListNode>();
        ListNode c = head;
        while(c.next!=null){
            if(set.contains(c))
                return true;
            else
                set.add(c);
            c = c.next;
        }
        return false;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
