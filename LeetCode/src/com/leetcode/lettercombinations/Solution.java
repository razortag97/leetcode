package com.leetcode.lettercombinations;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution {

	public List<String> letterCombinations(String digits){
		if(digits.length() < 1)
			return new ArrayList<String>();
		
		HashMap<String, String> tbl = creTbl();
		ArrayList<StringBuffer>  hs = new ArrayList<StringBuffer>();
		int j=0;
		
		while(j<digits.length()) {
			char cj = digits.charAt(j);
			hs = det(cj, tbl, hs);
			j++;
		}
		
		ArrayList<String> as = new ArrayList<String>();
		for (StringBuffer sb : hs) {
			as.add(sb.toString());
		}
		
		return as;
	}
	
	public ArrayList<StringBuffer> det(char ci, HashMap<String, String> tbl, ArrayList<StringBuffer> hs) {
		String cis = tbl.get(String.valueOf(ci));
		ArrayList<StringBuffer> bs = new ArrayList<StringBuffer>();
		char[] cic = cis.toCharArray();
		if(hs.isEmpty()) {
			int i=0;
			while(i<cic.length) {
				StringBuffer sb = new StringBuffer();
				sb.append(cic[i]);
				hs.add(sb);
				i++;
			}
			return hs;
		}
		
		for(int i=0; i<hs.size(); i++) {
			StringBuffer sb = hs.get(i);
			for(int j=0; j<cic.length;j++) {
				StringBuffer b = new StringBuffer(sb.toString());
				b.append(cic[j]);
				bs.add(b);
			}
		}
		hs=null;
		return bs;
	}
	
	public HashMap<String, String> creTbl(){
		HashMap<String, String> tbl = new HashMap<String, String>();
		
		tbl.put("1", "");
		tbl.put("2", "abc");
		tbl.put("3", "def");
		tbl.put("4", "ghi");
		tbl.put("5", "jkl");
		tbl.put("6", "mno");
		tbl.put("7", "pqrs");
		tbl.put("8", "tuv");
		tbl.put("9", "wxyz");
		
		return tbl;
	}
	
	public static void main(String[] args) {
		Solution s = new Solution();
		s.letterCombinations("234");
	}

}
