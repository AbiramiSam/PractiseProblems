/**
 * 
 */
package mandatoryHomework.foundations;

import org.junit.Test;

import junit.framework.Assert;

/**
 * @author abiramisa
 * Classroom
 * https://leetcode.com/problems/length-of-last-word/
 * 
 * Given a string s consisting of words and spaces, return the length of the last word in the string.
 * A word is a maximal substring consisting of non-space characters only.
 * 
 * Input: s = "Hello World"
 * Output: 5
 * Explanation: The last word is "World" with length 5.
 * 
 * 
 * Pseudocode:
 * 
 * 
 *
 */
public class LengthOfLastWord {
	@Test
	public void test() {
		Assert.assertEquals(5, findLenghtOfLastWord("Hello World"));
	}
	
	@Test
	public void test1() {
		Assert.assertEquals(4, findLenghtOfLastWord("   fly me   to   the moon  "));
	}
	
	@Test
	public void test2() {
		Assert.assertEquals(6, findLenghtOfLastWord("luffy is still joyboy"));
	}

	public int findLenghtOfLastWord(String input) {
		
		String value=input.trim();
		String result="";
		for(int i=value.length()-1;i>=0;i--) {
			if(value.charAt(i)!=' ') {
			result=result+value.charAt(i);
			}else
				break;
			
		}
		return result.length();
		
		
	}
	
	@Test
	public void findLength() {
		String value="   fly me   to   the moon  ";
		String result=value.trim();
		int spaceIndex=result.lastIndexOf(' ');
		String output=result.substring(spaceIndex+1, result.length());
		System.out.println("Output="+output);
		
		System.out.println(value.trim().length()-value.trim().lastIndexOf(' ')-1);
	}
	
	
	@Test
	public void findLengthOfLast() {
		String value="   fly me   to   the moon  ";
		String result=value.trim();
		//String output=result.split("\\s");
		for(int i=result.length()-1;i>=0;i--) {
			
		}
	}
	

}
