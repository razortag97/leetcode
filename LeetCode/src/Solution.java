
public class Solution {
	
		class Node {
		  public int value;
		  public Node next;
		}

		 public static Node reverse(Node head){
		    if(head == null || head.next != null)
		        return head;
		    
		    Node nextNode = head.next;
		    head.next = null;
		    
		    Node node = reverse(nextNode);
		    node.next = head;
		    
		    return node;  
		 }
		 
		 public void createAndReverse() {
			 
		 }
		    
		 
	public static void main(String[] args) {
	
	}
}
