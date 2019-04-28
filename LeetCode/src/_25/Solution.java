package _25;

public class Solution {

	  public ListNode reverseKGroup(ListNode head, int k) {
	        if(head == null || head.next == null)
	            return head;
	        
	        ListNode dummy = head; int len=0;
	        
	        while(dummy != null && dummy.next !=null){
	            len++;
	            dummy = dummy.next;
	        }
	        
	        len++;
	        if(k>len){
	            return null;
	        }
	        
	        len=0;
	        dummy=head;
	        
	        while(len<k-1){
	            dummy = dummy.next;
	            len++;
	        }
	        
	        ListNode nH = dummy.next;
	        ListNode t = dummy;
	        t.next = null;
	        ListNode h = head;
	        
	        ListNode nH1 = reverseNode(h);
	        ListNode nH2 = nH1;
	        while(nH2!=null & nH2.next!=null){
	            nH2 = nH2.next;
	        }
	      
	        nH2.next = nH;
	        return nH1;
	    }
	    
	    public ListNode reverseNode(ListNode t){
	        ListNode l = null;
	        if(t!=null && t.next!=null){
	            l = reverseNode(t.next);
	        }
	        
	        if(t.next == null)
	            return t;
	        
	        ListNode t1 = l;
	        while(t1.next !=null)
	            t1=t1.next;
	        
	        t1.next = t;
	        t1.next.next =null;
	        return l;
	    }
	    
	    public static void main(String[] args) {
	    	ListNode head = new ListNode(1);
	    	ListNode two = new ListNode(2);
	    	ListNode three = new ListNode(3);
	    	ListNode four = new ListNode(4);
	    	ListNode five = new ListNode(5);
	    	
	    	head.next=two;
	    	two.next=three;
	    	three.next=four;
	    	four.next=five;
	    	
	    	int k = 4;
	    	Solution s = new Solution();
	    	s.reverseKGroup(head, k);
	    }
	
}
