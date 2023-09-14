/**
 * 
 */
package mandatoryHomework.foundations;

import org.junit.Test;

/**
 * 14-Sep-2023
 * Vel
 * https://www.hackerrank.com/challenges/camelcase/problem
 * 
 * DataSet:
 * Input: s="saveChangesInTheEditor"
 * Output: 5
 * 
 * Input: s="oneTwoThree"
 * Output: 3
 * 
 * Input: s="onetwothree"
 * Output: 0
 * 
 * Input: s="a"
 * Output: 1
 * 
 * Input: s="A"
 * Output: 0
 * 
 * Pseudocode:
 * Declare an integer output
 * iterate the elements of the String
 * if ascii code of the character of the String is less than 97
 * increment the counter
 * return the output
 * 
 * 
 * 
 */
public class HR_CamelCase {
	@Test
	public void test() {
		System.out.println(camelcase("saveChangesInTheEditor"));
	}
	
	public static int camelcase(String s) {
	    int output=1;
	    for(int i=0;i<s.length();i++) {
	    	if((int)s.charAt(i)<97 && i!=0) {
	    		output=output+1;
	    	}
	    	if(i==0 && s.charAt(i)<97) {
	    		output=0;
	    	}
	    }
	    return output;
	    }
}
