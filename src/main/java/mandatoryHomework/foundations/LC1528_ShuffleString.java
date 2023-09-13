/**
 * 
 */
package mandatoryHomework.foundations;

import java.util.Arrays;

import org.junit.Test;

/**
 * @author abiramisa
 * Classroom
 * https://leetcode.com/problems/shuffle-string/description/
 * 
 * 13-Sep-2023
 * SDET Challenge
 * 
 * You are given a string s and an integer array indices of the same length. 
 * The string s will be shuffled such that the character at the ith position moves to indices[i] 
 * in the shuffled string.
	Return the shuffled string.
 * 45670213
 * codeleet
 * 
 * 
 * Input: s = "codeleet", indices = [4,5,6,7,0,2,1,3]
Output: "leetcode"
Explanation: As shown, "codeleet" becomes "leetcode" after shuffling.
 * 
 * Pseudocode:
 * int[] indices;
 * length=indices.length;
 * create new char array.
 * iterate the array
 * assign the input.charAt(i) to new array[indices[i]
 * return new array * 
 *
 */
public class LC1528_ShuffleString {
	
	@Test
	public void test() {
		System.out.println(findShuffleString(new int[] {4,5,6,7,0,2,1,3}, "codeleet"));
	}
	
	@Test
	public void test1() {
		System.out.println(findShuffleString(new int[] {0,1,2}, "abc"));
	}
	
	@Test
	public void test2() {
		System.out.println(restoreString("codeleet",new int[] {4,5,6,7,0,2,1,3}));
	}
	
	@Test
	public void test3() {
		System.out.println(restoreString("abc",new int[] {0,1,2}));
	}
	
	public char[] findShuffleString(int[] indices, String input) {
		int length=indices.length;
		char[] result=new char[length];
		for(int i=0;i<indices.length;i++) {
			result[indices[i]]=input.charAt(i);
		}
		
		return result;
	}
	
	
	public String restoreString(String s, int[] indices) {
	        char[] result=new char[s.length()];
	        String output="";
	        for(int i=0;i<indices.length;i++) {
	        	result[indices[i]]=s.charAt(i);
	        }
	        for(int i=0;i<result.length;i++) {
	        	output=output+result[i];
	        }
	        return output;
	    }

}
