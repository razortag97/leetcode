package com.leetcode.restoreipaddress;

import java.util.ArrayList;
import java.util.List;

public class Solution_Backtracking {

	public void printSol(ArrayList<String> sol) {
		for (String s : sol) {
			System.out.println(s);
		}
	}
	
	private boolean isValid(String c) {
		if(c.length() > 1 && c.startsWith("0"))
			return false;
		if(c.length()>=1 && c.length() < 4 && Integer.parseInt(c) >=0 && Integer.parseInt(c)<=255)
			return true;
		return false;
	}
	
	public List<String> restoreIpAddresses(String input) {
		if(input == null || input.isEmpty())
			return new ArrayList<String>();
		
		List<String> solution = new ArrayList<String>(); 
		
		help(input, 0, new ArrayList<String>(), solution);
		
		return solution;
	}
	
	private void help(String ip, int sInd, ArrayList<String> c1, List<String> sol){
		
		if(ip.isEmpty() && c1.size()==4) {
			constructSol(c1, sol);
			return;
		}
		
		if(c1.size() == 4 && !ip.isEmpty())
			return;
		
		for(int i=sInd; i<=ip.length();i++) {
			String c= ip.substring(0, i);
			if(c.startsWith("0"))
				return;
			if(!isValid(c))
				continue;
			c1.add(c);
			ip = ip.substring(i);
			help(ip, sInd, c1, sol);
			ip = c+ip;
			c1.remove(c1.size()-1);
		}
	}
	
	private void constructSol(List<String> can, List<String> sol1) {
		String sol = new String();
		for (String s3 : can) {
			if(sol.isEmpty()) {
				sol=s3;
				continue;
			}
			sol = sol + "." + s3;
		}
		sol1.add(sol);
	}
	
	public static void main(String[] args) {
		Solution_Backtracking s = new Solution_Backtracking();
		s.restoreIpAddresses("1010111");
	}

}
