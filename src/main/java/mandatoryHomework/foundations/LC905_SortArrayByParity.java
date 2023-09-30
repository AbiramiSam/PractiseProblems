/**
 * 
 */
package mandatoryHomework.foundations;

import java.util.Arrays;

import org.junit.Test;

/**
 * https://leetcode.com/problems/sort-array-by-parity/description/
 * 18-Sep-2023
 * 
 * DataSet:
 * Input: nums = [3,1,2,4]
 * Output: [2,4,3,1]
 * 
 * Input: nums = [0]
 * Output: [0]
 * 
 * Input: nums = [1,3,5,7,9,15,17]
 * Ouptut: [1,3,5,7,9,15,17]
 * 
 * Input: nums = [2,4,6,8,10]
 * Output: [2,4,6,8,10]
 * 
 * 
 * 
 * 
 */
public class LC905_SortArrayByParity {
	
	@Test
	public void test() {
		System.out.println(Arrays.toString(sortArrayByParity(new int[] {3,1,2,4})));
	}
	
	@Test
	public void test1() {
		System.out.println(Arrays.toString(sortArrayByParity(new int[] {0})));
	}
	
	@Test
	public void test2() {
		System.out.println(Arrays.toString(sortArrayByParity(new int[] {1,3,5,7,9,15,17})));
	}
	
	@Test
	public void test3() {
		System.out.println(Arrays.toString(sortArrayByParity(new int[] {2,4,6,8,10})));
	}
	
		public int[] sortArrayByParity(int[] nums) {
			int pointer1=0, pointer2=pointer1+1;
			while(pointer1<nums.length && pointer2<nums.length) {
				if(!(nums[pointer1]%2==0)) {
					if(nums[pointer2]%2==0) {
						int temp=nums[pointer2];
						nums[pointer2]=nums[pointer1];
						nums[pointer1]=temp;
						pointer1++;
					}else {
						pointer2++;
					}
				}else {
					pointer1++;
					pointer2++;
				}
			}
			return nums;
		}

}
