/**
 * 
 */
package mandatoryHomework.foundations;

import java.util.Arrays;

import org.junit.Test;

/**
 * 23-Sep-2023
 * https://leetcode.com/problems/sort-array-by-parity-ii/description/
 * 
 * 
 * Input: nums = [4,2,5,7]
 * Output: [4,5,2,7]
 * 
 * Input: nums = [2,3]
 * Output: [2,3]
 * 
 * Pseudocode:
 * declare integer pointer1=0 and pointer2=pointer1+1 temp=0
 * while pointer1 less than nums of length
 * if(pointer1%2==0 && nums[pointer1]%2==0) pointer1++;
 * else if(pointer1%2!=0 && nums[pointer1]%2!=0) pointer1++;
 * else if(pointer1%2==0 && nums[pointer1]%2!=0) 
 * 	if(nums[pointer2]%2==0)
 * 		temp=nums[pointer1]
 * 		nums[pointer1]=nums[pointer2]
 * 		nums[pointer2]=temp;
 * 	else
 * 		pointer2++;
 * 
 * return nums;
 * 
 */
public class LC922_SortArrayByParityII {
		@Test
		public void test() {
			String output=Arrays.toString(sortArrayByParityII(new int[] {4,2,5,7}));
			System.out.println(output);
		}
		
		@Test
		public void test1() {
			String output=Arrays.toString(sortArrayByParityII(new int[] {3,1,4,2}));
			System.out.println(output);
		}
	
		public int[] sortArrayByParityII(int[] nums) {
		        int pointer1=0,pointer2=pointer1+1,temp=0;
		        while(pointer1<nums.length && pointer2<nums.length) {
		        	if((pointer1%2==0 && nums[pointer1]%2!=0) || (pointer1==0 && nums[pointer1]%2!=0)) {
		        		if(nums[pointer2]%2==0) {
		        			temp=nums[pointer1];
		        			nums[pointer1]=nums[pointer2];
		        			nums[pointer2]=temp;
		        		}else {
		        			pointer2++;
		        		}
		        	}else if(pointer1%2!=0 && nums[pointer1]%2==0) {
		        		if(nums[pointer2]%2!=0) {
		        			temp=nums[pointer1];
		        			nums[pointer1]=nums[pointer2];
		        			nums[pointer2]=temp;
		        			pointer1++;
		        			pointer2++;
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
