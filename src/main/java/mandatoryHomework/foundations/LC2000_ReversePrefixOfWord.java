/**
 * 
 */
package mandatoryHomework.foundations;

import java.util.Arrays;

import org.junit.Test;

/**
 * 29-Aug-2023
 * https://leetcode.com/problems/reverse-prefix-of-word/
 * 
 * Test Data:
 * Input: String and a character
 * Output: String
 * 
 * Input: word = "abcdefd", ch = "d"
 * Output: "dcbaefd"
 * 
 * 
 * Input: word = "xyxzxe", ch = "z"
 * Output: "zxyxxe"
 * 
 * Input: word = "abcd", ch = "z"
 * Output: "abcd"
 * 
 * Input: word = "a", ch ="a"
 * Output: "a"
 * 
 * 
 * Pseudocode:
 * Declare String variables firstHalf, secondHalf, result;
 * Declare an integer variable index
 * Store the substring value in the firstHalf if the character is present in the String
 * Iterate the firstHalf and reverse the string
 * Join firstHalf and secondHalf
 * return the String
 *  * 
 * 
 */
public class LC2000_ReversePrefixOfWord {
	@Test
	public void test() {
		System.out.println(reversePrefix("abcdefd", 'd'));
	}
	
	@Test
	public void test1() {
		System.out.println(reversePrefix("xyxzxe", 'z'));
	}
	
	 public String reversePrefix(String word, char ch) {
		 String result=" ",firstHalf="",secondHalf="";
		 int index=word.indexOf(ch);
		 System.out.println(index);
		 firstHalf=word.substring(0,index+1);
		 secondHalf=word.substring(index+1,word.length());
		 	 
		 if(index>=1) {
				StringBuilder sb=new StringBuilder(firstHalf);
				result=result+sb.reverse()+secondHalf;
		 }else
			 result=word;
		 
		 
		 return result;
	        
	    }
}
