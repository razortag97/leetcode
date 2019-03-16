package _113;

import java.util.ArrayList;
import java.util.List;

public class Solution {

   public List<List<Integer>> pathSum(TreeNode root, int sum) {
     List<List<Integer>> sol = new ArrayList<List<Integer>>();
     p(root, sum, 0, sol, new ArrayList<Integer>());
     return sol;
   }
   
   public List<List<Integer>> p(TreeNode n, int t, int cSum, List<List<Integer>> sol, List<Integer> temp){
	   if(n==null)
		   return sol;
	   temp.add(n.val);
	   
	   p(n.left,t, cSum + n.val, sol, temp);
	   p(n.right,t, cSum + n.val, sol, temp);
	   if(n.left==null && n.right == null && (cSum + n.val) == t) {
		   sol.add(new ArrayList<Integer>(temp));
	   }
	   temp.remove(temp.size()-1);
	   return sol;
   }
	    
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
