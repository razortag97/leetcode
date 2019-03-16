package _445;

public class Solution {
	
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		int i1=1,i2=1;
		
		ListNode sl1=l1,sl2=l2,l3=null;
		
		i1=lenOfL(sl1);
		i2=lenOfL(sl2);
		
		if(i1>i2) {
			l2 = normL(sl2, i1-i2);
			l3=this.createL3(i1);
		}else if(i2>i1){
			l1 = normL(sl1, i2-i1);
			l3=this.createL3(i2);
		} else{
            l3=this.createL3(i2);
        }
		
		int c = addTwoNH(l1, l2, l3);
		
		if(c>0) {
			ListNode temp = new ListNode(c);
			temp.next=l3;
			l3=temp;
		}
		return l3;
		
	}
	
	public int addTwoNH(ListNode l1, ListNode l2, ListNode l3) {
		int c=0;
		if(l1.next!=null)
			c = addTwoNH(l1.next, l2.next, l3.next);
		
		int sum = l1.val+l2.val+c;
		c=sum/10;
		sum=sum%10;
		l3.val = sum;
		return c;
	}
	
	public int lenOfL(ListNode l1) {
		int len=0;
		while(l1!=null) {
			l1=l1.next;
			len++;
		}
		return len;
	}
	
	public ListNode normL(ListNode l1, int nL) {
		int i=0;
		while(i<nL) {
			i++;
			ListNode n = new ListNode(0);
			n.next=l1;
			l1=n;
		}
		return l1;
	}
	
	public ListNode createL3(int l) {
		ListNode head = null;
		ListNode t = null;
		int i=0;
		while(i<l) {
			if(head == null) {
				head = new ListNode(0);
				t=head;
				i++;
				continue;
			}
			t.next = new ListNode(0);
			t=t.next;
			i++;
		}
		return head;
	}
	
	public static void main(String[] args) {
		ListNode l1=new ListNode(7);
		l1.next=new ListNode(2);
		l1.next.next=new ListNode(4);
		l1.next.next.next=new ListNode(3);
		
		ListNode l2=new ListNode(5);
		l2.next=new ListNode(6);
		l2.next.next=new ListNode(4);
		
		Solution s = new Solution();
		ListNode l3 = s.addTwoNumbers(l1, l2);
		while(l3!=null){
			System.out.println(l3.val);
			l3=l3.next;
		}

	}

}
