package com.leetcode.groupanagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Solution {
	
	public List<List<String>> groupAnagrams(String[] strs){
		
		HashMap<String, ArrayList<String>> strMap 
			= new HashMap<String, ArrayList<String>>();
		
		for (String str : strs) {
			char[] charArr = str.toCharArray();
			Arrays.sort(charArr);
			String val = String.valueOf(charArr);
			if(strMap.containsKey(val)) {
				strMap.get(val).add(str);
			}else {
				ArrayList<String> lst = new ArrayList<String>();
				lst.add(str);
				strMap.put(val, lst);
			}
		}
		
		List<List<String>> result = new LinkedList<List<String>>();
		
		for (String val : strMap.keySet()) {
			ArrayList<String> arrList = strMap.get(val);
			result.add(arrList);
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		
	}
}
