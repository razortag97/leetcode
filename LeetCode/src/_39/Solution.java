package _39;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
	
	 public List<List<Integer>> combinationSum(int[] candidates, int target){
	        ArrayList<List<Integer>> sols = new ArrayList<List<Integer>>();
	        Arrays.sort(candidates);
	        sols = h(candidates, target, sols, new ArrayList<Integer>(), 0);
	        return sols;
	        
	    }
	    
	    private ArrayList<List<Integer>> h(int[] c, int target, ArrayList<List<Integer>> sols, ArrayList<Integer> c1, int cIndex){
	        if(target == 0){
	            sols.add(new ArrayList<Integer>(c1));
	            return sols;
	        }
	        
	        if(target < 0){
	            return null;
	        }
	        
	        for(int i=cIndex; i<c.length; i++){
	        	c1.add(c[i]);
	            h(c, target-c[i], sols, c1, i);
	            c1.remove(c1.size()-1);
	        }
	        return sols;
	    }

	public static void main(String[] args) {
		Solution sol = new Solution();
		int[] c = new int[]{2,3,6,7};
		int target = 7;
		List<List<Integer>> s = sol.combinationSum(c, target);
		for (List<Integer> list : s) {
			for (Integer integer : list) {
				System.out.print(integer + " ");
			}
			System.out.println();
		}

	}

}
