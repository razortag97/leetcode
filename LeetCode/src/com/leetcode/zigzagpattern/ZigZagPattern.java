package com.leetcode.zigzagpattern;

public class ZigZagPattern {
	public String convert(String s, int nRows) {
		
		if(s.length() ==1 || nRows ==1 || s.length() <= nRows){
				return s;
		}
	        
		Integer length = s.length();
		char [][]zigZagPattern = new char[nRows][length];
		int rowIndex = 0;
		int colIndex = 0;
		boolean evenCol = true;
		
		for(int i=0;i<s.length();i++){
			System.out.println(s.charAt(i) + "," + rowIndex + "," + colIndex);
			if(evenCol){
				zigZagPattern[rowIndex][colIndex] = s.charAt(i);
			}else{
				rowIndex++;
				zigZagPattern[rowIndex][colIndex] = s.charAt(i);
				if(rowIndex+1>=nRows-1){
					rowIndex++;
				}
			}
			if(rowIndex>=nRows-1){
				rowIndex=0;
				colIndex++;
				if(colIndex%2==0){
					evenCol=true;
				}else{
					evenCol=false;
				}
			}else{
				rowIndex++;
			}
		}
		
		StringBuffer reversedString = new StringBuffer(); 
		for(int i=0;i<nRows;i++){
			for(int j=0;j<length;j++){
				char c = zigZagPattern[i][j];
				if(c=='\0'){
					continue;
				}
				reversedString.append(c);
			}
		}
		
		return reversedString.toString();
	}
}
												//addCol=false
//test case: nRows = 3, PAY P ALI S HIR I NG ==> rowIndex=0, colIndex=4, CURRLETTER=H, 
//test case: nRows = 5,
//test case: nRows = 6,