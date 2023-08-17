/**
 * 
 */
package mandatoryHomework.foundations;

import org.junit.Test;

/**
 * @author abiramisa
 * Classroom
 * https://leetcode.com/problems/shuffle-string/description/
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
public class ShuffleString {
	
	@Test
	public void test() {
		System.out.println(findShuffleString(new int[] {4,5,6,7,0,2,1,3}, "codeleet"));
	}
	
	@Test
	public void test1() {
		System.out.println(findShuffleString(new int[] {0,1,2}, "abc"));
	}
	
	public char[] findShuffleString(int[] indices, String input) {
		int length=indices.length;
		char[] result=new char[length];
		for(int i=0;i<indices.length;i++) {
			result[indices[i]]=input.charAt(i);
		}
		
		return result;
	}
	

}
