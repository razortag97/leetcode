package com.leetcode.zigzagpattern;

import static org.junit.Assert.*;

import org.junit.Test;

public class ZigZagPatternTest {

	@Test
	public void testConvert() {
		ZigZagPattern z = new ZigZagPattern();
		String revString = z.convert("PAYPALISHIRING", 3);
		System.out.println(revString);
	}
	
	@Test
	public void testConvertEdge() {
		ZigZagPattern z = new ZigZagPattern();
		String revString = z.convert("A", 1);
		System.out.println(revString);
	}

	@Test
	public void testConvertEdge2() {
		ZigZagPattern z = new ZigZagPattern();
		String revString = z.convert("PAYPALISHIRING", 3);
		Long t1 = System.currentTimeMillis();
		//String revString = z.convert("esviallcaelwbrcfkxvoojbsxyaffbkluftuteztkmslfwqqtmgjxhbwhecphmaduuapazillawtwpjsdpbazd",11);
		Long t2 = System.currentTimeMillis();
		System.out.println(revString);
		System.out.println( "Time required in millisec: " + ((t2-t1)));
	}
	
}


