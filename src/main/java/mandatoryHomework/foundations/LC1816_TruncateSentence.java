/**
 * 
 */
package mandatoryHomework.foundations;

import org.junit.Test;

/**
 * 
 * 06-Sep-2023
 * 
 * 
 * https://leetcode.com/problems/truncate-sentence/
 * 
 * Dataset:
 * Input: s = "Hello how are you Contestant", k = 4
 * Output: "Hello how are you"
 * 
 * Input: s = "What is the solution to this problem", k = 4
 * Output: "What is the solution"
 * 
 * 
 * Input: s = "chopper is not a tanuki", k = 5
 * Output: "chopper is not a tanuki"
 * 
 * 
 * Pseudocode:
 * Declare an integer count and string s
 * iterate the characters of the string
 * increase the count variable while the char is blank space and add each character to the string
 * when the count is equal to integer k break the loop and return the string 
 *  
 * 
 * 
 */
public class LC1816_TruncateSentence {
	@Test
	public void test() {
		System.out.println(truncateSentence("Hello how are you Contestant", 4));
	}
	
	@Test
	public void test1() {
		System.out.println(truncateSentence("What is the solution to this problem", 4));
	}
	
	@Test
	public void test2() {
		System.out.println(truncateSentence("chopper is not a tanuki", 4));
	}
	
	 public String truncateSentence(String s, int k) {
	        int count=0;
	        String value="";
	        for(int i=0;i<s.length();i++) {
	        	value=value+s.charAt(i);
	        	if(s.charAt(i)==' ') {
	        		count++;
	        	}
	        	if(count==k) {
	        		break;
	        	}
	        }
	        return value.trim();
	    }
}
