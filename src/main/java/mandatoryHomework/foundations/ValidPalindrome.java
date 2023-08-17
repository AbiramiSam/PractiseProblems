/**
 * 
 */
package mandatoryHomework.foundations;

import java.util.regex.Pattern;

import org.junit.Test;

import junit.framework.Assert;

/**
 * @author abiramisa
 * Classroom
 * https://leetcode.com/problems/valid-palindrome/description/
 * 
 * A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
Given a string s, return true if it is a palindrome, or false otherwise.
 * 
 * Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
 * 
 * Pseudocode:
 * String s;
 * s.toLowercase
 * s.remove
 * 
 *
 */
public class ValidPalindrome {
	@Test
	public void test1() {
		Assert.assertEquals(true, findValidPalindrome("A man, a plan, a canal: Panama"));
	}
	@Test
	public void test2() {
		Assert.assertEquals(false, findValidPalindrome("race a car"));
	}
	@Test
	public void test3() {
		Assert.assertEquals(true, findValidPalindrome("ab_a"));
	}
	
	@Test
	public void test4() {
		Assert.assertEquals(true, findValidPalindrome(" "));
	}
	
	
	public boolean findValidPalindrome(String input) {
		String reverseString="";
		String remSpace=input.replaceAll("[^a-zA-Z0-9]","");
		String lowerCase=remSpace.toLowerCase();
		char[] inputChar=lowerCase.toCharArray();
		for(int i=inputChar.length-1;i>=0;i--) {
			reverseString=reverseString+inputChar[i];
		}
		
		if(reverseString.equals(lowerCase)) {
			return true;
		}
		
		return false;
	}
}
