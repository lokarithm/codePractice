package string;

/*
	The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)
	
	P   A   H   N
	A P L S I I G
	Y   I   R
	And then read line by line: "PAHNAPLSIIGYIR"
	Write the code that will take a string and make this conversion given a number of rows:
	
	string convert(string text, int nRows);
	convert("PAYPALISHIRING", 3) should return "PAHNAPLSIIGYIR".
 */

public class _006_ZigZagConversion {
	public static String convert(String s, int numRows) {
		int len = s.length();
		
		if(len <= 2){
			return s;
		}
		
		char[] inputArray = s.toCharArray();
		StringBuilder [] result = new StringBuilder[numRows];
		
		for(int i=0;i<numRows;i++){
			result[i] = new StringBuilder();
		}
		
		int pos = 0;
		
		while(pos < len){
			//loop until the vertical is filled up with numRows of char
			for(int i=0;i<numRows && pos<len;i++){
				result[i].append(inputArray[pos++]);
			}
			//loop for the diagonals, i=numRows-2 and i>=1 because we don't need to fill the first and last row
			for(int i=numRows-2;i>=1 && pos<len;i--){
				result[i].append(inputArray[pos++]);
			}
		}
		
		for (int i = 1; i < result.length; i++)
			result[0].append(result[i]);
		
		return result[0].toString();
    }
	
	public static void main(String[] args) {
    	String result = convert("0123456789", 4);
    	System.out.println("result:");
    	System.out.println(result);
    	System.out.println("Expected result:");
    	System.out.println("0615724839");
     }
}
