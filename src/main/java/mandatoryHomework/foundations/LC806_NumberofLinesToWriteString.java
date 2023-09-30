/**
 * 
 */
package mandatoryHomework.foundations;

import java.util.Arrays;

import org.junit.Test;

/**
 * 12-Sep-2023
 * https://leetcode.com/problems/number-of-lines-to-write-string/description/
 * 
 * DataSet:
 *Input: widths = [10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10]
 *s = "abcdefghijklmnopqrstuvwxyz"
 *Output: [3,60]
 *
 *Input: widths = [4,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,,10,10,10,10]
 *s = "bbbcccdddaaa"
 *Output: [2,4]
 *
 *
 * 
 * 
 * 
 * 
 */
public class LC806_NumberofLinesToWriteString {
	@Test
	public void test() {
		int[] output=numberOfLines(new int[] {4,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10},"bbbcccdddaaa");
		System.out.println(Arrays.toString(output));
	}
	
	@Test
	public void test1() {
		int[] output=numberOfLines(new int[] {10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10},"abcdefghijklmnopqrstuvwxyz");
		System.out.println(Arrays.toString(output));
	}
	
	 public int[] numberOfLines(int[] widths, String s) {
		 int temp=0,rowCount=1;
		 for(int i=0;i<s.length();i++) {
			 int ascii=widths[s.charAt(i)-'a'];
			 if(temp+ascii<=100) {
				 temp=temp+ascii;
				 
			 }
			 else {
				rowCount++;
			 	temp=ascii;
			 }
		 }
		 return new int[] {rowCount,temp};
	        
	    }

}
