/**
 * 
 */
package mandatoryHomework.foundations;

import org.junit.Test;

import junit.framework.Assert;

/**
 * @author abiramisa
 * https://leetcode.com/problems/merge-strings-alternately/description/
 * 
 * Homework
 * 
 * You are given two strings word1 and word2. 
 * Merge the strings by adding letters in alternating order, starting with word1. 
 * If a string is longer than the other, append the additional letters onto the end 
 * of the merged string.
 * 
 * Return the merged string.
 * 
 * Input: word1 = "abc", word2 = "pqr"
Output: "apbqcr"
Explanation: The merged string will be merged as so:
word1:  a   b   c
word2:    p   q   r
merged: a p b q c r
 * 
 * 
 * 
 *
 */
public class MergeString {
	@Test
	public void test() {
		System.out.println(findMergeString("abcd", "pq"));
		Assert.assertEquals("apbqcd", findMergeString("abcd", "pq"));
	}
	
	@Test
	public void test1() {
		System.out.println(findMergeString("ab", "pqrs"));
		Assert.assertEquals("apbqrs", findMergeString("ab", "pqrs"));
	}
	
	@Test
	public void test2() {
		System.out.println(findMergeString("abc", "pqr"));
		Assert.assertEquals("apbqcr", findMergeString("abc", "pqr"));
	}
	
	public String findMergeString(String word1,String word2) {
		int length=word1.length()+word2.length();
		String res="";
		for(int i=0;i<length;i++) {
			if(i<word1.length()) {
			res=res+word1.charAt(i);
			}
			if(i<word2.length()) {
			res=res+word2.charAt(i);
			}
		}
		return res;
	}

}
