/**
 * 
 */
package mandatoryHomework.foundations;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

/**
 * 05-Oct-2023
 * https://leetcode.com/problems/count-the-number-of-consistent-strings/
 * 
 * 
 * DataSet:
 * Input: allowed = "ab", words = ["ad","bd","aaab","baa","badab"]
 * Output: 2
 * 
 * Input: allowed = "abc", words = ["a","b","c","ab","ac","bc","abc"]
 * Output: 7
 * 
 * Input: allowed = "cad", words = ["cc","acd","b","ba","bac","bad","ac","d"]
 * Output: 4
 * 
 * 
 * Pseudocode:
 * Declare integer count
 * Declare set of character to store the values in the set
 * Declare a character array and convert the allowed string to charArray
 * iterate the elements of the array
 * 	 iterate each character of the string
 * 		check if set doesn't contains the character of the string in array
 * 		if it doesn't contain break the loop and go to next string in the array
 * 		else if the loop reaches the length of the string increment the counter
 * return counter 
 * 
 */
public class LC1684_CounttheNumberofConsistentStrings {
		@Test
		public void test() {
			System.out.println(countConsistentStrings("ab", new String[] {"ad","bd","aaab","baa","badab"}));
		}
	
		public int countConsistentStrings(String allowed, String[] words) {
		        int count=0;
		        Set<Character> allowedSet=new HashSet<Character>();
		        char[] allowArray=allowed.toCharArray();
		        for (char c : allowArray) {
					allowedSet.add(c);
				}
		        for(int i=0;i<words.length;i++) {
		        	for(int j=0;j<words[i].length();j++) {
		        		if(!allowedSet.contains(words[i].charAt(j)))
		        			break;
		        		if(j==words[i].length()-1)
		        			count++;
		        	}
		        }
		        return count;
		    }

}
