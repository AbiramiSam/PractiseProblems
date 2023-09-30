/**
 * 
 */
package mandatoryHomework.foundations;

import java.util.HashMap;

import org.junit.Test;

/**
 * 20-Sep-2023
 * https://leetcode.com/problems/number-of-substrings-containing-all-three-characters/description/
 * 
 * 
 * Input: s = "abcabc"
 * Output: 10
 * 
 * Input: s = "aaacb"
 * Output: 3
 * 
 * Input: s = "abc"
 * Output: 1
 * 
 * 
 * Pseudocode:
 * Declare integer pointer1 and pointer 2
 * if map.size=3
 * 
 * count=count+length-end
 * 
 * 
 */
public class LC1358_NumberofSubstringsContainingAllThreeCharacters {
		
	@Test
	public void test1() {
		System.out.println(numberOfSubstrings("aaacb"));
	}
	
	  public int numberOfSubstrings(String s) { 
		  int pointer1=0,count=0;
		  HashMap<Character, Integer> hmap=new HashMap<Character, Integer>();
	  
		  while(pointer1<s.length()) {
			 int temp=0;
			 hmap.put(s.charAt(pointer1), temp++);
			 if(hmap.size()==3) {
				 count=count+s.length()-pointer1;
			}
			 pointer1++;
		  }
		  return count;
	  }
	 

}
