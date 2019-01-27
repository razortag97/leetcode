package _19;

public class Solution {
	
	class ListNode {
		int val;
		ListNode next;
		ListNode(int i){
			val = i;
		}
	}
	
	public ListNode removeNth1Pass(ListNode head, int n) {
        ListNode dummy = new ListNode(-95);
        dummy.next = head;
        
        ListNode current = dummy;
        for(int i=0;i<n+1;i++){
            current = current.next;
        }
        
        ListNode slow = dummy;
        while(current != null){
            current = current.next;
            slow = slow.next;
        }
        
        slow.next = slow.next.next;
        return dummy.next;
	}
	
	public ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode dummy = new ListNode(-95);
        dummy.next = head;
        int l =0;
        ListNode first = head;
        while(first != null){
            l++;
            first = first.next;
        }
        
        int k = l - n;
        int m = 0;
        first = dummy;
        while(m < k){
            first = first.next;
            m++;
        }
        
        first.next = first.next.next;
        return dummy.next;
    }
	
	public void removeNode() {
		ListNode n = new ListNode(1);
		/*ListNode n1 = new ListNode(2);
		n.next = n1;
		ListNode n2 = new ListNode(3);
		n1.next = n2;
		ListNode n3 = new ListNode(4);
		n2.next = n3;
		ListNode n4 = new ListNode(5);
		n3.next = n4;*/
		
		//ListNode head = removeNthFromEnd(n, 2);
		ListNode head = removeNthFromEnd(n, 1);
		while(head.next!=null) {
			System.out.println(head.val);
			head = head.next;
		}
		System.out.println(head.val);
	}

	public static void main(String[] args) {
		Solution sol = new Solution();
		sol.removeNode();
	}

}
