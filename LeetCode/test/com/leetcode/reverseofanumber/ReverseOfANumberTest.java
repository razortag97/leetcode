package com.leetcode.reverseofanumber;

import static org.junit.Assert.*;

import org.junit.Test;

public class ReverseOfANumberTest {

	@Test
	public void testTwo(){
		ReverseOfANumber reverseOfANumber = new ReverseOfANumber();
		int x = 312;
		int reversedNumber = reverseOfANumber.reverse(x);
		if(reversedNumber==213){
			System.out.println("True");
		}
		System.out.println("<-------------------->");
		System.out.println("Orignal Number: " + x + ", Reversed Number: " + reversedNumber);
		System.out.println("<-------------------->");
	}
	
	
	@Test
	public void test() {
		ReverseOfANumber reverseOfANumber = new ReverseOfANumber();
		int x = 24;
		int reversedNumber = reverseOfANumber.reverse(x);
		System.out.println("<-------------------->");
		System.out.println("Orignal Number: " + x + ", Reversed Number: " + reversedNumber);
		System.out.println("<-------------------->");
	}

	@Test
	public void testThree(){
		ReverseOfANumber reverseOfANumber = new ReverseOfANumber();
		int x = -412;
		int reversedNumber = reverseOfANumber.reverse(x);
		System.out.println("<-------------------->");
		System.out.println("Orignal Number: " + x + ", Reversed Number: " + reversedNumber);
		System.out.println("<-------------------->");
	}

}
