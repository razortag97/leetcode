package com.leetcode.mergeintervals;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Solutions {

	 public List<Interval> merge(List<Interval> intervals) {
		 if(intervals.size() < 2) {
			 return intervals;
		 }
		 
		 int len = intervals.size();
		 intervals.sort(new Comparator<Interval>() {
			@Override
			public int compare(Interval i1, Interval i2) {
				return Integer.compare(i1.start, i2.start);
			}
		});
		 
		 int j=1;
		 while(j<=len-1) {
			 int i=j-1;
			 
			 Interval e1 = intervals.get(i);
			 Interval e2 = intervals.get(j);
			 
			 if(e1.end>=e2.start) {
				 e1.end=e2.end;
				 intervals.remove(e2);
				 len = len-1;
			 }
			 j++;
		 }
		 
		 return intervals;
	 }
	
	public static void main(String[] args) {
		
		Solutions s = new Solutions();
		
		ArrayList<Interval> intervals = new ArrayList<Interval>();
		
		Interval e1 = new Interval();
		e1.start=1;
		e1.end=3;
		
		intervals.add(e1);
		
		Interval e2 = new Interval();
		e2.start=2;
		e2.end=6;
		
		intervals.add(e2);
		
		Interval e3 = new Interval();
		e3.start=8;
		e3.end=10;
		
		intervals.add(e3);
		
		Interval e4 = new Interval();
		e4.start=15;
		e4.end=18;
		
		intervals.add(e4);
		
		List<Interval> result = s.merge(intervals);
		
		for (Interval interval : result) {
			System.out.println("[" + interval.start + "," + interval.end + "]");
		}
		

	}

}
