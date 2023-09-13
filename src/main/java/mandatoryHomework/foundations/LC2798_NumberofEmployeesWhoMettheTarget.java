/**
 * 
 */
package mandatoryHomework.foundations;

import org.junit.Test;

/**
 * 13-Sep-2023
 * Vel
 * https://leetcode.com/problems/number-of-employees-who-met-the-target/
 * 
 * 
 * DataSet:
 * Input: hours = [0,1,2,3,4], target = 2
 * Output: 3
 * 
 * Input: hours = [5,1,4,2,2], target = 6
 * Output: 0
 * 
 * Input: hours = [4], target = 4
 * Output: 1
 * 
 * Input: hours = [4], target = 5
 * Output: 0
 * 
 * 
 * Pseudocode:
 * Declare integer output
 * iterate through the hours array
 * if the element of the hours is greater than or equal to target
 * increase the output
 * return output
 * 
 */
public class LC2798_NumberofEmployeesWhoMettheTarget {
	@Test
	public void test() {
		System.out.println(numberOfEmployeesWhoMetTarget(new int[] {0,1,2,3,4}, 2));
	}
	
	@Test
	public void test1() {
		System.out.println(numberOfEmployeesWhoMetTarget(new int[] {5,1,4,2,2}, 6));
	}
	
	@Test
	public void test2() {
		System.out.println(numberOfEmployeesWhoMetTarget(new int[] {4}, 4));
	}
	
	@Test
	public void test3() {
		System.out.println(numberOfEmployeesWhoMetTarget(new int[] {4}, 5));
	}
	
	
	public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
	        int output=0;
	        for(int i=0;i<hours.length;i++) {
	        	if(hours[i]>=target) {
	        		output++;
	        	}
	        }
	        return output;
	    }

}
