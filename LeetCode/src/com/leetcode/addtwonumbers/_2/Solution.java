package com.leetcode.addtwonumbers._2;

public class Solution {
	
	class ListNode {
		ListNode next;
		int val;
		ListNode(int value){
			val = value;
		}
	}
	
	   public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	        int carry=0;
	        int sum=0;
	        ListNode fakeNode = new ListNode(0);
	        ListNode currNode = fakeNode;
	        
	        while(l1 !=null || l2 != null){
	            
	            if(l1 != null && l2 != null)
	                sum = l1.val + l2.val +  carry;
	            else if(l1 != null && l2 == null)
	                sum = l1.val +  carry;
	            else if(l1 == null && l2 != null)
	                sum = l2.val +  carry;
	            
	            carry = sum / 10;
	            sum = sum % 10;
	            
	            ListNode newNode = new ListNode(sum);
	            currNode.next = newNode;
	            currNode = newNode;
	            
	            if(l1 != null)
	                l1 = l1.next;
	            if(l2 != null)
	                l2 = l2.next;
	        }
	        
	        if(carry > 0) {
	        	ListNode newNode = new ListNode(carry);
	            currNode.next = newNode;
	            currNode = newNode;
	        }
	        
	        return fakeNode.next;
	    }

	public static void main(String[] args) {
		
		// 6 -> 7 -> 8  876+321 = 1197
		// 1 -> 2 -> 3  
		
		
	}

}
