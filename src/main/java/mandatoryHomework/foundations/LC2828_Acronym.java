/**
 * 
 */
package mandatoryHomework.foundations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

/**
 * 
 * 04-Sep-2023
 * 
 * https://leetcode.com/problems/check-if-a-string-is-an-acronym-of-words/
 * 
 * Given an array of Strings words and a string s, determine if s is an acronym of words.
 * 
 * The String s is considered an acronym of words if it can be formed by concatenating the first character 
 * of each string in words in order. 
 * 
 * DataSet:
 * Input: ["apple","banana"], s= "ab"
 * Output: true [ab]
 * 
 * 
 * Input: ["alice","bob","charlie"] , s ="abc"
 * Output: true [abc]
 * 
 * Input: ["bear","aardvark"], s="ba"
 * Output: false [ba] order is different
 * 
 * 
 * Pseudocode:
 * Declare a string s and integer temp
 * iterate the words of the array and store the first letter of each word to the string s
 * Iterate through the characters of the string 
 * If the next char is greater by 1 from the first character return true
 * else return false
 * 
 * 
 * 
 */
public class LC2828_Acronym {
	@Test
	public void test() {
		System.out.println(findAcronym(new ArrayList<String>(Arrays.asList("apple","banana")),"ab"));
	}
	
	@Test
	public void test1() {
		System.out.println(findAcronym(new ArrayList<String>(Arrays.asList("alice","bob","charlie")),"abc"));
	}
	
	@Test
	public void test2() {
		System.out.println(findAcronym(new ArrayList<String>(Arrays.asList("bear","aardvark")),"ab"));
	}
	
	@Test
	public void test3() {
		System.out.println(findAcronym(new ArrayList<String>(Arrays.asList("never","gonna","give","up","on","you")),"ngguoy"));
	}
	
	
	@Test
	public void test4() {
		System.out.println(findAcronym(new ArrayList<String>(Arrays.asList("an","apple")),"a"));
	}
	
	@Test
	public void test5() {
		System.out.println(findAcronym(new ArrayList<String>(Arrays.asList("l","m","n","o","p")),"lmnop"));
	}
	
	public boolean findAcronym(List<String> words,String s) {
		String value="";
		for(int i=0;i<words.size();i++){ 
			  value=value+words.get(i).charAt(0); 
		}
		  System.out.println(s);
		if(s.equals(value)) {
			return true;
		}
		return false;
	}

}
