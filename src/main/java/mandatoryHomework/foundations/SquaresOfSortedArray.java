/**
 * 
 */
package mandatoryHomework.foundations;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

/**
 * @author abiramisa
 *
 * https://leetcode.com/problems/squares-of-a-sorted-array/description/
 * 
 * Given an integer array nums sorted in non-decreasing order, 
 * return an array of the squares of each number sorted in non-decreasing order.
 * 
 * Input: nums = [-4,-1,0,3,10]
Output: [0,1,9,16,100]
Explanation: After squaring, the array becomes [16,1,0,9,100].
After sorting, it becomes [0,1,9,16,100].
 * 
 * Pseudocode:
 * input -> array of num -> nums[]
 * output -> array of integer -> nus[]
 * 
 * 
 * 
 * 
 * 
 *
 */
public class SquaresOfSortedArray {
	@Test
	public void testSample1() {
		
		int[] arr=findSquaresOfSortedArray(new int[] {-4,-1,0,3,10});
		//System.out.println(res.toString());
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.out.println(Arrays.toString(arr));
	}
	
	
	public int[] findSquaresOfSortedArray(int[] nums) {
		
		Set<Integer> set=new HashSet<Integer>();
		
		for(int i=0;i<nums.length;i++) {
			nums[i]=(nums[i]*nums[i]);
			
		}
		
		Arrays.sort(nums);
		return nums;
	}

}
