package com.leetcode.permutation;

public class Solution {
	
	public void nextPermutation(int[] nums) {
		  if(nums == null || nums.length <=1)
		        return;
		        
		    int p=0;
		    for(int i=nums.length-2;i>=0;i--)
		        if(nums[i]<nums[i+1]){
		            p=i;   
		            break;
		        }
		        
		    int q=0;
		    for(int j=nums.length-1;j>p;j--)
		        if(nums[j]>nums[p]){
		            q=j;
		            break;
		        }
		        
		    if(p==0 && q==0){
		        int l=0; int r=nums.length-1;
		        while(l<r){
		            int temp=nums[l];
		            nums[l]=nums[r];
		            nums[r]=temp;
		            l++; r--;
		        }      
		        return;
		    }
		        
		    int temp=nums[p];
		    nums[p]=nums[q];
		    nums[q]=temp;
		        
		    int l=p+1;
		    int r=nums.length-1;
		    while(l<r){
		        temp = nums[l];
		        nums[l]=nums[r];
		        nums[r]=temp;
		        l++; r--;
		    }
	}

	public static void main(String[] args) {
		Solution s = new Solution();
		int[] arr = new int[] {1,2,3};
		s.nextPermutation(arr);
		for (int i : arr) {
			System.out.println(i);
		}
	}

}
