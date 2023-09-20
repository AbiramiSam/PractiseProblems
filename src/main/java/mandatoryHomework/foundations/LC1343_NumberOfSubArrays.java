/**
 * 
 */
package mandatoryHomework.foundations;

import org.junit.Test;

/**
 * 19-Sep-2023
 * https://leetcode.com/problems/number-of-sub-arrays-of-size-k-and-average-greater-than-or-equal-to-threshold/description/
 * 
 * 
 * DataSet:
 * Input: arr = [2,2,2,2,5,5,5,8], k = 3, threshold = 4
 * Output: 3
 * 
 * Input: arr = [11,13,17,23,29,31,7,5,2,3], k = 3, threshold = 5
 * Output: 6
 * 
 * Input: arr = [1,2,3,4,5], k = 2, threshold = 0
 * Output: 4
 * 
 * Pseudocode:
 * Declare integer average=0,sum=0,pointer=0, count=0;
 * while pointer is less than k
 * 	add the elements of the array
 *  find the average
 *  if average is greater than or equal to threshold increment the count
 * while pointer less than arr.length
 * 	sum=0;
 * 	sum=sum+arr[pointer]+arr[pointer++]+arr[pointer++_k]
 * 
 * 
 * 
 */
public class LC1343_NumberOfSubArrays {
		@Test
		public void test() {
			System.out.println(numOfSubarrays(new int[] {2,2,2,2,5,5,5,8}, 3, 4));
		}
		
		@Test
		public void test1() {
			System.out.println(numOfSubarrays(new int[] {11,13,17,23,29,31,7,5,2,3}, 3, 5));
		}
		
		@Test
		public void test2() {
			System.out.println(numOfSubarrays(new int[] {1,2,3,4,5}, 2, 0));
		}
		
		public int numOfSubarrays(int[] arr, int k, int threshold) {
			int average=0,sum=0,pointer=0,count=0;
			while(pointer<k) {
				sum=sum+arr[pointer++]; //2,2,2,2,5,5,5,8
			}
			average=sum/k;
	    	 if(average>=threshold)
	    		 count++;
	    	 
		     while(pointer<arr.length) {
		    	 sum=sum+arr[pointer];
		    	 sum=sum-arr[pointer-k];
		    	 average=sum/k;
		    	 if(average>=threshold)
		    		 count++;
		    	 pointer++;
		    	 //sum=
		     }
		     return count;
		    }

}
