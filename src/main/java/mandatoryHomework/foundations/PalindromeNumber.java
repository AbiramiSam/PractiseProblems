/**
 * 
 */
package mandatoryHomework.foundations;

import org.junit.Test;

/**
 * @author abiramisa
 * https://leetcode.com/problems/palindrome-number/description/
 * 
 * Given an integer x, return true if x is a palindrome, and false otherwise.
 * 
 * Input: x = 121
	Output: true
	Explanation: 121 reads as 121 from left to right and from right to left.
 *
 *pseudocode:
 *input integer
 *output boolean
 *
 *pseudocode:
 *1.convert the integer to string
 *2.iterater through the length of the integer
 *3.store the string.charAt(i) to new string
 *4.  
 *
 *
 * 
 */
public class PalindromeNumber {
	@Test
	public void testSample1() {
		System.out.println(findPalindrome(121));
	}
	
	
	public boolean findPalindrome(int num) {
		
		String actual=Integer.toString(num);
		String converted="";
		
		
		for(int i=actual.length()-1;i>=0;i--) {
			converted=converted+actual.charAt(i);
		}
		
		System.out.println(converted);
		if(actual.equals(converted)) {
			return true;
		}
		
		return false;
		
	}

}
