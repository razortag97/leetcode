package _328;

public class Solution {

	public ListNode oddEvenList(ListNode head) {
        ListNode oH = new ListNode(0);
        ListNode eH = new ListNode(0);
        ListNode e = eH;
        ListNode o = oH;
        ListNode curr = head;
        int i=1;
        while(curr!=null){
            ListNode temp = curr.next;
            curr.next=null;
            if(i%2==0){
                e.next = curr;
                e=e.next;   
            }else{
                o.next = curr;
                o=o.next;
            }
            curr = temp;
            i++;
        }
        
        o.next=eH.next;
        return oH.next;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
