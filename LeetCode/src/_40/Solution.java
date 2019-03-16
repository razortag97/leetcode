package _40;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
	public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        System.out.println("Sorted Array");
        for (int i : candidates) {
			System.out.print(i + " ");
		}
        System.out.println();
        System.out.println("<---------->");
        ArrayList<List<Integer>> sol = new ArrayList<List<Integer>>();
        h(candidates, target, sol, new ArrayList<Integer>(), 0);
        return sol;
    }

	private ArrayList<List<Integer>> h(int[] c, int target, ArrayList<List<Integer>> s, ArrayList<Integer> sol, int index){
		if(target == 0)
			s.add(new ArrayList<Integer>(sol));
		if(target < 0)
			return null;
		
		for (int i=index; i<c.length;i++) {
			if(i>index && c[i]==c[i-1]) continue;
			sol.add(c[i]);
			h(c, target-c[i], s, sol, i+1);
			sol.remove(sol.size()-1);
		}
		
		return s;
	}
	
	public static void main(String[] args) {
		int[] arr = new int[]{10,1,2,7,6,1,5};
		int target = 8;
		Solution s = new Solution();
		List<List<Integer>> sol = s.combinationSum2(arr, target);
		for (List<Integer> list : sol) {
			for (Integer integer : list) {
				System.out.print(integer + " ");
			}
			System.out.println();
		}
	}

}
