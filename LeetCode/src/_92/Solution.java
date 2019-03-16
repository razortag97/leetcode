package _92;

public class Solution {

	public ListNode reverseBetween(ListNode head, int m, int n) {
		 if(m==n)
	            return head;
		
		ListNode fakeHead = new ListNode(0);
		fakeHead.next = head;
		
		ListNode mH = fakeHead;
		int im=1;
		
		while(im < m) {
			mH = mH.next; im++;
		}
		
		ListNode nH = fakeHead;
		int in=1;
		while(in < n) {
			nH = nH.next; in++;
		}
		
		ListNode nNHead = nH.next.next;
		ListNode nMHead = reverseMN(mH.next, nH.next);
		mH.next = nMHead;
		
		while(mH!= null && mH.next != null) {
			mH=mH.next;
		}
		
		mH.next = nNHead;
		
		return fakeHead.next;
    }
	
	public ListNode reverseMN(ListNode m, ListNode n) {
		ListNode prev = m;
		ListNode curr = m.next;
		prev.next=null;
		while(curr!=null) {
			ListNode c = curr.next;
			curr.next = prev;
			prev = curr;
			if(curr==n) {
				break;
			}
			curr=c;
		}
		
		return curr;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
