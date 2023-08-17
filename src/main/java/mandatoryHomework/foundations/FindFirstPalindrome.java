/**
 * 
 */
package mandatoryHomework.foundations;

import org.junit.Test;

import junit.framework.Assert;

/**
 * @author abiramisa
 * https://leetcode.com/problems/find-first-palindromic-string-in-the-array/description/
 * 
 * Homework
 * Given an array of strings words, return the first palindromic string in the array. 
 * If there is no such string, return an empty string "".
A string is palindromic if it reads the same forward and backward.
 * 
 * Pseudocode:
 * 
 * 
 * 
 *
 */
public class FindFirstPalindrome {
	@Test
	public void test() {
		System.out.println(findFirstPalindrome(new String[] {"abc","car","ada","racecar","cool"}));
		Assert.assertEquals("ada", findFirstPalindrome(new String[] {"abc","car","ada","racecar","cool"}));
	}
	
	@Test
	public void test1() {
		System.out.println(findFirstPalindrome(new String[] {"notapalindrome","racecar"}));
		Assert.assertEquals("racecar", findFirstPalindrome(new String[] {"notapalindrome","racecar"}));
	}
	
	@Test
	public void test2() {
		System.out.println(findFirstPalindrome(new String[] {"def","ghi"}));
		Assert.assertEquals("", findFirstPalindrome(new String[] {"def","ghi"}));
	}
	
	public String findFirstPalindrome(String[] words) {
		String result="";
		for(int i=0;i<words.length;i++) {
			int length=words[i].length();
			if(words[i].equals(reverseString(words[i],length))) {
			result=words[i].toString();
			break;
			}
		}
		return result;
	}
	
	
	public String reverseString(String word,int length) {
		String reverse="";
		for(int i=length-1;i>=0;i--) {
			reverse=reverse+word.charAt(i);
		}
		return reverse;
	}

}
