/**
 * 
 */
package mandatoryHomework.foundations;

import org.junit.Test;

/**
 * 19-Sep-2023
 * https://leetcode.com/problems/lexicographically-smallest-palindrome/description/
 * 
 * 
 * Input: s = "egcfe"
 * Output: "efcfe"
 * 
 * Input: s = "abcd"
 * Output: "abba"
 * 
 * Input: s = "a"
 * Output: "a"
 * 
 * Pseudocode:
 * Declare integer variable pointer1=0 and pointer2=s.length-1
 * while pointer1 is less than pointer 2
 * if s.charAt of pointer1!= s.charAt of pointer2
 * if s.charAt of pointer1 is less than s.charAt of pointer2
 * s.replace pointer2 to pointer1
 * pointer1++;
 * pointer2--;
 * return s.
 * 
 * 
 */
public class LC2697_LexicographicallySmallestPalindrome {
	
	@Test
	public void test() {
		System.out.println(makeSmallestPalindrome("egcfe"));
	}
	
	@Test
	public void test1() {
		System.out.println(makeSmallestPalindrome("abcd"));
	}
	
	@Test
	public void test2() {
		System.out.println(makeSmallestPalindrome("a"));
	}
	
	public String makeSmallestPalindrome(String s) {
		int pointer1=0,pointer2=s.length()-1;
		char ch[]=s.toCharArray();
		if(s.length()==1) {
			return s;
		}
		while(pointer1<pointer2) {
			if(ch[pointer1]!=ch[pointer2]) {
				if(ch[pointer1]<ch[pointer2]) {
					ch[pointer2]=ch[pointer1];
				}else {
					ch[pointer1]=ch[pointer2];
				}
			}
				pointer1++;
				pointer2--;
		}
		
	      return String.valueOf(ch);  
	    }
}
