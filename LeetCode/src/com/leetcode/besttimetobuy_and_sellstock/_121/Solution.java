package com.leetcode.besttimetobuy_and_sellstock._121;

public class Solution {

	// 6 1 5 3 7 1
	// 9 8 7 6 5 1
	public int maxProfit(int[] prices) {
		int maxPrice = 0;
		int minPrice = Integer.MAX_VALUE;
		for(int i=0;i<prices.length;i++) {
			if(prices[i] < minPrice)
				minPrice = prices[i];
			else if(prices[i] - minPrice > maxPrice) {
				maxPrice = prices[i]-minPrice;
			}
		}
		return maxPrice;
	}
	
	public static void main(String[] args) {
		Solution s = new Solution();
		//int[] prices = new int[] {6, 1, 5, 3, 7, 1};
		int[] prices = new int[] {9, 8, 7, 6, 5 , 1};
		int maxProfit = s.maxProfit(prices);
		System.out.println("MaxProfit: " + maxProfit);
	}
}
