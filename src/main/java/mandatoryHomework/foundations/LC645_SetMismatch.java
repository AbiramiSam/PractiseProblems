/**
 * 
 */
package mandatoryHomework.foundations;

import java.util.Arrays;
import org.junit.Test;

/**
 * Date: 22-Aug-2023
 * 645: https://leetcode.com/problems/set-mismatch/
 * 
 * You have a set of integers s, which originally contains all the numbers from 1 to n.
 * Unfortunately, due to some error, one of the numbers in s got duplicated to another
 * number in the set, which results in repetition of one number and loss of another number.
 * 
 * You are given an integer numsay nums representing the data status of this set after the error.
 * Find the number that occurs twice and the number that is missing and return them in the form of an numsay.
 * 
 * Input: integer numsay
 * Output: integer numsay
 * 
 * {1,6,5,2,8,4,2,3}
 * {1,2,2,3,4,5,6,8}
 * {2,3,4,4,5,6,7,8}
 * {1,2,3,4,5,6,7,8}
 * {1,2,2,3,5,6,7,8}
 * 
 * 
 * Pseudocode:
 * Declare an integer numsay of size 2
 * Sort the numsay
 * Iterate the numsay from i=0 to length of the numsay
 * 		If(numsay[i]==numsay[i+1])
 * 			missingNumber[0]=numsay[i];
 * 			missingNumber[1]=i+1;
 * End loop,
 * Return the missingNumber;
 * 			
 * duplicate=nums[i];
				missingNumber=count;
 * 
 * 1,2,2,4
 * 
 */
public class LC645_SetMismatch {
	@Test
	public void test() {
		int[] res=findMistmatch(new int[] {3,2,3,4,6,5});
		System.out.println(Arrays.toString(res));
	}
	
	@Test
	public void test1() {
		int[] res=findMistmatch(new int[] {1,1});
		System.out.println(Arrays.toString(res));
	}
	
	@Test
	public void test2() {
		int[] res=findMistmatch(new int[] {1,2,2,4});
		System.out.println(Arrays.toString(res));
	}

	@Test
	public void test3() {
		int[] res=findMistmatch(new int[] {1,5,3,2,2,7,6,4,8,9});
		System.out.println(Arrays.toString(res));
	}
	
	@Test
	public void test4() {
		int[] res=findMistmatch(new int[] {5,3,6,1,5,4,7,8});
		System.out.println(Arrays.toString(res));
	}
	
	public int[] findSetMismatch(int[] nums) {
		int count=1;
		int duplicate=0;
		int missingNumber=0;
		Arrays.sort(nums);
		
		if(nums.length==2) {
			if(nums[0]==1) {
				duplicate=1;
				missingNumber=2;
				return new int[] {duplicate,missingNumber};
			}
			else if(nums[0]==2) {
				duplicate=2;
				missingNumber=1;
				return new int[] {duplicate,missingNumber};
			}
		}
		//System.out.println(Arrays.toString(nums));
		//5,3,6,1,5,4,7,8
		//1,3,4,5,5,6,7,8
		//1,2,3,4,5,6,7,8,9,10
	
		for(int j=0;j<nums.length;j++) {
			if(nums[j]!=count) {
				if(j==0 && nums[j]!=1) {
					continue;
				}
				else if((nums[j]==nums[j+1]) || (nums[j]<nums.length-1)){
					duplicate=nums[j];
					break;
				}
			}	
			count++;
		}
		
		int temp=1;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]!=temp) {
				if(i==0) {
					missingNumber=1;
					break;
				}
				else if(i==nums.length-1) {
					missingNumber=nums.length;
					break;
				}
				else{
					missingNumber=temp;
					break;
				}
			}
			temp++;
		}

		
		
		return new int[] {duplicate,missingNumber};
}
	
	
	public int[] findMistmatch(int[] nums) {
		int count=1;
		int duplicate=0;
		int missingNumber=0;
		Arrays.sort(nums);
		
		if(nums.length==2) {
			if(nums[0]==1) {
				duplicate=1;
				missingNumber=2;
				return new int[] {duplicate,missingNumber};
			}
			else if(nums[0]==2) {
				duplicate=2;
				missingNumber=1;
				return new int[] {duplicate,missingNumber};
			}
		}
		
		for(int i=0;i<nums.length;i++) {
			if(nums[i]!=count) {
				if(i==0) {
					missingNumber=1;
					break;
				}else if(i==nums.length-1) {
					missingNumber=nums.length;
					break;
				}
				if(nums[i]!=(nums[i+1])) {
					missingNumber=nums[i+1]-1;
					break;
				}
				
			}
		}
		count=1;
		for(int j=0;j<nums.length;j++) {
			if(nums[j]!=count) {
				if(j==0 && nums[j]!=1) {
					continue;
				}
				else if((nums[j]==nums[j+1]) && (j!=nums.length-1)){
					duplicate=nums[j];
					break;
				}
			}	
			count++;
		}
		
		return new int[] {duplicate,missingNumber};
	}
}
