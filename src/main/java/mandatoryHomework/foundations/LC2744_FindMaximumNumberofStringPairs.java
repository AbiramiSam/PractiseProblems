/**
 * 
 */
package mandatoryHomework.foundations;

import org.junit.Test;

/**
 * 14-Sep-2023
 * https://leetcode.com/problems/find-maximum-number-of-string-pairs/description/
 * 
 * DataSet:
 * Input: words = ["cd","ac","dc","ca","zz"]
 * Output: 2
 * 
 * Input: words = ["ab","ba","cc"]
 * Output: 1
 * 
 * Input: words = ["aa","ab"]
 * Output: 0
 * 
 * Pseudocode:
 * Declare an integer count
 * Declare a string temp 
 * iterate the array from i to length
 * reverse the string 
 * iterate the array from j to length
 * if the reverse string is equal to the string of the array
 * increase the count
 * return count 
 * 
 */
public class LC2744_FindMaximumNumberofStringPairs {
	@Test
	public void test() {
		System.out.println(maximumNumberOfStringPairs(new String[]{"cd","ac","dc","ca","zz"}));
	}
	
	@Test
	public void test1() {
		System.out.println(maximumNumberOfStringPairs(new String[]{"ab","ba","cc"}));
	}
	
	@Test
	public void test2() {
		System.out.println(maximumNumberOfStringPairs(new String[]{"aa","ab"}));
	}
	
	 public int maximumNumberOfStringPairs(String[] words) {
		 int count=0;	
		 for(int i=0;i<words.length;i++) {
			 String temp="";
			 temp=temp+words[i].charAt(1)+words[i].charAt(0);
			 for(int j=i+1;j<words.length;j++) {
				 if(words[j].equals(temp)) {
					 count=count+1;
				 }
			 }
		 }
		 return count;
	        
	    }

}
