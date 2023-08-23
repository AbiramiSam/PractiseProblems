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
 * You are given an integer array nums representing the data status of this set after the error.
 * Find the number that occurs twice and the number that is missing and return them in the form of an array.
 * 
 * Input: integer array
 * Output: integer array
 * 
 * {1,6,5,2,8,4,2,3}
 * {1,2,2,3,4,5,6,8}
 * 
 * Pseudocode:
 * Declare an integer array of size 2
 * Sort the array
 * Iterate the array from i=0 to length of the array
 * 		If(array[i]==array[i+1])
 * 			missingNumber[0]=array[i];
 * 			missingNumber[1]=i+1;
 * End loop,
 * Return the missingNumber;
 * 			
 * 
 * 
 * 
 * 
 */
public class LC645_SetMismatch {
	@Test
	public void test() {
		int[] res=findSetMismatch(new int[] {1,2,2,4});
		System.out.println(Arrays.toString(res));
	}
	
	@Test
	public void test1() {
		int[] res=findSetMismatch(new int[] {1,1});
		System.out.println(Arrays.toString(res));
	}
	
	public int[] findSetMismatch(int[] arr) {
		
		
		int[] missingArr=new int[2];
		Arrays.sort(arr);
		if(arr.length==1) {
			missingArr[0]=-1;
			missingArr[1]=-1;
		}
		if(arr.length>1) {
		for(int i=1;i<arr.length;i++) {
			int count=0;
			for(int j=0;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
				
			}
			}
			if(count==2) {
				missingArr[0]=arr[i];
			}
			else if(count==0) {
				missingArr[1]=i;
			}
		}
		}
		return missingArr;
	}

}
