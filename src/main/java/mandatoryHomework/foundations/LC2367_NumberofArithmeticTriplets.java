/**
 * 
 */
package mandatoryHomework.foundations;

import org.junit.Test;

/**
 * 20-Sep-2023
 * https://leetcode.com/problems/number-of-arithmetic-triplets/description/
 * 
 * 
 * DataSet:
 * Input: nums = [0,1,4,6,7,10], diff = 3
 * Output: 2
 * 
 * Input: nums = [4,5,6,7,8,9], diff = 2
 * Output: 2
 * 
 * 
 */
public class LC2367_NumberofArithmeticTriplets {
	@Test
	public void test() {
		System.out.println(arithmeticTriplets(new int[] {0,1,4,6,7,10}, 3));
	}
	
	@Test
	public void test1() {
		System.out.println(arithmeticTriplets(new int[] {4,5,6,7,8,9}, 2));
	}
	
	 public int arithmeticTriplets(int[] nums, int diff) {
	        int count=0;
	        for(int i=0;i<nums.length;i++) {
	        	for(int j=i+1;j<nums.length;j++) {
	        		if(nums[i]+diff==nums[j]) {
	        		for(int k=j+1;k<nums.length;k++) {
	        			if(nums[j]+diff==nums[k]) {
	        				count++;
	        			}
	        		}
	        		}
	        	}
	        }
	        return count;
	    }
	 
}
