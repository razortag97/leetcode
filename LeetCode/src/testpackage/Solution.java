package testpackage;

public class Solution {

	public void printNumber(Integer a, Integer b) {
		a=a+b;
		b=a+b;
		System.out.println("a:" + a + "b:" + b);
	}
	
	public void setNumbers() {
		Integer a = 23;
		Integer b = 25;
		printNumber(a, b);
		System.out.println("a: " + a + ",b:" + b);
	}
	
	
	public static void main(String[] args) {
		Solution s = new Solution();
		s.setNumbers();
	}

}
