/**
 * 
 */
package mandatoryHomework.foundations;

import org.junit.Test;

/**
 * 14-Sep-2023
 * Vel
 * https://leetcode.com/problems/sum-of-squares-of-special-elements/
 * 
 * DataSet:
 * Input: nums = [1,2,3,4]
 * Output: 21
 * 
 * Input: nums = [2,7,1,19,18,3]
 * Output: 63
 * 
 * Pseudocode:
 * Declare int output, temp, len.
 * len=no of elements of array
 * iterate through the array
 * if the element of the array is divisible by len
 * square the element and add it to output
 * return the output 
 * 
 */
public class LC2778_SumofSquaresofSpecialElements {
	@Test
	public void test() {
		System.out.println(sumOfSquares(new int[] {1,2,3,4}));
	}
	
	@Test
	public void test1() {
		System.out.println(sumOfSquares(new int[] {2,7,1,19,18,3}));
	}
	
	 public int sumOfSquares(int[] nums) {
	        int output=0,n=0;
	        n=nums.length;
	        for(int i=0;i<nums.length;i++) {
	        	int temp=i+1;
	        	if(n%temp==0) {
	        		output=output+(nums[i]*nums[i]);
	        	}
	        }
	        return output;
	    }

}
