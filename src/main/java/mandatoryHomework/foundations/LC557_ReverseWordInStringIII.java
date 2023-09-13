/**
 * 
 */
package mandatoryHomework.foundations;

import org.junit.Test;

/**
 * 28-Aug-2023
 * https://leetcode.com/problems/reverse-words-in-a-string-iii/
 * 
 * 13-Sep-2023
 * SDET challenge
 * 
 * Given a string s, reverse the order of characters in each word 
 * within a sentence while still preserving whitespace and initial word order.
 * 
 * Test Data:
 * Input: s = "Let's take LeetCode contest"
 * Output: "s'teL ekat edoCteeL tsetnoc"
 * 
 * Input: s = "God Ding"
 * Output: "doG gniD"
 * 
 * Pseudocode:
 * Declare two Strings temp,result;
 * iterate the characters of the String
 * 	temp=each character of the array
 * 	while the charater of the array  is null 
 * 	reverse the string and add it to result string
 * return result
 * 
 * 
 * 
 * 
 * 
 * 
 */
public class LC557_ReverseWordInStringIII {
	
	@Test
	public void test() {
		System.out.println(reverseWords("Let's take LeetCode contest"));
	}
	
	@Test
	public void test1() {
		System.out.println(reverseWords("God Ding"));
	}
	
	public String reverseWords(String s) {
		
		String result=" ",res=" ";
		String[] words = s.split(" ");
		System.out.println(words.length);
		
		for(int i=0;i<words.length;i++) {
			//res=res+reverseString(words[i]);
			StringBuilder sb=new StringBuilder(words[i]);
			res=res+sb.reverse()+" ";
		}
		result=result+res+" ";
		return result.trim();
	        
	 }
	
	public String reverseString(String temp) {
		String value=" ";
		for(int i=temp.length()-1;i>=0;i--) {
			value=value+temp.charAt(i);
		}
		return value;
	}

	
}
