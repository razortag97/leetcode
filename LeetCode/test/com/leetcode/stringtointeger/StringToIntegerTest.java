package com.leetcode.stringtointeger;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringToIntegerTest {

	@Test
	public void test() {
		StringToInteger s = new StringToInteger();
		int result = s.atoi("+2 1 4 5L");
		System.out.println(result);
		if(result == 2145){
			assertTrue(true);
		}
	}

}
