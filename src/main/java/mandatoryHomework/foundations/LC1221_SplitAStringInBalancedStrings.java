/**
 * 
 */
package mandatoryHomework.foundations;

import org.junit.Test;

/**
 * 29-Aug-2023
 * 
 * https://leetcode.com/problems/split-a-string-in-balanced-strings/
 * 
 * Balanced strings are those that have an equal quantity of 'L' and 'R' characters.
 * Given a balanced string s, split it into some number of substrings such that:
 * Each substring is balanced.
 * Return the maximum number of balanced strings you can obtain
 * 
 * Dataset:
 * Input: "RLRRLLRLRL"
 * Output: 4
 * 
 * Input: "RLRRRLLRLL"
 * Output: 2
 * 
 * Input: "LLLLRRRR"
 * Output: 1
 * 
 * Pseudocode:
 * Declare integer varialbe count1,cout2 and result
 * Iterate the length of the string
 * if the character is r increase the count1
 * if the character is l increase the count2
 * if count1 and count2 is equal increase the result
 * return result 
 * 
 * 
 * 
 */
public class LC1221_SplitAStringInBalancedStrings {
	
		@Test
		public void test() {
			System.out.println(balancedStringSplit("RLRRLLRLRL"));
		}
		
		@Test
		public void test1() {
			System.out.println(balancedStringSplit("RLRRRLLRLL"));
		}
		
		@Test
		public void test2() {
			System.out.println(balancedStringSplit("LLLLRRRR"));
		}
	
		public int balancedStringSplit(String s) {
		        int count1=0,count2=0,result=0;
		        for(int i=0;i<s.length();i++) {
		        	if(s.charAt(i)=='R') {
		        		count1++;
		        	}
		        	if(s.charAt(i)=='L') {
		        		count2++;
		        	}
		        	if(count1==count2) {
		        		result++;
		        	}
		        }
		        return result;
		    }

}
