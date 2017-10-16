package com.leetcode.four.medianoftwosortedarrays;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i=0;
        int j=0;
        int k=0;
        
        int mMax = nums1.length; // Max length of the first array
        int nMax = nums2.length; // Max length of the second array
        
        if(nMax == 0 && mMax ==0){
            double error = -1.0;
            return error;
        }
        
        int maxMerge = mMax + nMax - 1; // Max Length of the new Array
        
        int mergeArr[] = new int[maxMerge];
        
        while(i < mMax && j < nMax){
            if(nums1[i] < nums2[j]){ 
                mergeArr[k] = nums1[i];
                k++;
                i++;
            }else{
                mergeArr[k]=nums2[j];
                k++;
                j++;
            }
        }
        
        while(i<mMax){
            mergeArr[k] = nums1[i];
            i++;
            k++;
        }
        
        while(j<nMax){
            mergeArr[k] = nums2[j];
            j++;
            k++;
        }
        
        int temp = maxMerge + 1;
        int t1 = temp % 2;
        int medianIndex = -1;
        double median = 0;
        
        if(t1 > 0){
            medianIndex = temp / 2;
            median = (double) mergeArr[medianIndex];
        }else{
            medianIndex = temp / 2;
            median = (mergeArr[medianIndex] + mergeArr[medianIndex -1])/2;
        }
        
        return median;
    }

	public static void main(String[] args) {
		int nums1[] = new int[]{1,3};
		int nums2[] = new int[]{2};
		
		Solution solution = new Solution();
		double median = solution.findMedianSortedArrays(nums1, nums2);
		System.out.println(median);

	}

}
