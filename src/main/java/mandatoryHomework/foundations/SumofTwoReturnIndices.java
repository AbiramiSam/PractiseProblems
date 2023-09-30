/**
 * 
 */
package mandatoryHomework.foundations;

import java.util.Arrays;
import java.util.HashMap;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author abiramisa
 * 
 * https://leetcode.com/problems/two-sum/description/
 * Given an array of integers nums and an integer target, return indices of the two numbers
 *  such that they add up to target.
	You may assume that each input would have exactly one solution, 
	and you may not use the same element twice.
	You can return the answer in any order.
	Input: nums = [2,7,11,15], target = 9
	Output: [0,1]
	Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 *
 *
 1. Get the int[]  and int target element
     * 2.A nested loops to compare the values from nums[i] and nums[j]
       if (nums[i]+nums[j]=target element)
           return new int[] {i,j}
           return new int[] {-1,-1}
 */
public class SumofTwoReturnIndices {
	@Test
	public void test1() {
		
		int[] result=findSumofTwoReturnIndices(new int[] {2,7,11,15},9);
		System.out.println(Arrays.toString(result));
		Assert.assertArrayEquals(new int[] {0,1}, findSumofTwoReturnIndices(new int[] {2,7,11,15},9));
	}
	
	public int[] findSumofTwoReturnIndices(int[] num, int target) {
		for(int i=0;i<num.length;i++) {
			for(int j=i+1;j<num.length;j++) {
				if(num[i]+num[j]==target) {
					return new int[] {i,j};
				}
			}	
		}
		return new int[] {-1,-1};
	}

	
	/*
	 * public int[] twoSum(int[] nums, int target) { HashMap<Integer,Integer>
	 * hmap=new HashMap<Integer, Integer>();
	 * 
	 * }
	 */
}
