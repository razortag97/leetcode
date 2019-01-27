package com.leetcode.pathsumII._113;

import java.util.ArrayList;
import java.util.List;

public class Solution {

	class TreeNode {
		TreeNode left;
		TreeNode right;
		int val;
	}
	
	public List<List<Integer>> pathSum(TreeNode root, int sum) {
		
		
		return new ArrayList<List<Integer>>();
    }
	
	private void traverseAndCompute(TreeNode root, TreeNode currentNode, int currentSum, int targetSum) {
		if(currentNode == root) {
			currentSum = currentNode.val;
			if(currentNode.left != null) {
				traverseAndCompute(root, currentNode.left, currentSum, targetSum);
			}else if(currentNode.left == null && currentSum == targetSum) {
				System.out.println("Found Target Sum");
			}
		}
	}
	
	public static void main(String[] args) {
		
	}
}
