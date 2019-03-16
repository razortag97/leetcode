package _90;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
	 public List<List<Integer>> subsetsWithDup(int[] nums) {
		 	ArrayList<List<Integer>> sol = new ArrayList<List<Integer>>();
	        Arrays.sort(nums);
	        h(nums, 0, sol, new ArrayList<Integer>());
	        sol.add(new ArrayList<Integer>());
	        return sol;
	    }
	    
	    public List<ArrayList<Integer>> h(int[] nums, int s, ArrayList<List<Integer>> sol, List<Integer> t){
	        for(int i=s;i<nums.length;i++){
	            if(i>s && nums[i] == nums[i-1])
	                continue;
	            t.add(nums[i]);                
	            sol.add(new ArrayList<Integer>(t));
	            h(nums, i+1, sol, t);
	            t.remove(t.size()-1);
	        }
	        
	        return null;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
