/**
 * 
 */
package mandatoryHomework.foundations;

import org.junit.Test;

/**
 * 08-Aug-2023
 * 
 * https://leetcode.com/problems/average-value-of-even-numbers-that-are-divisible-by-three/
 * 
 * Input : integer array
 * Output: integer
 * 
 * Data:
 * positive:
 * i/p=[1,3,6,10,12,15] o/p:9
 * 
 * negative:
 * i/p=[1,2,4,7,10] o/p:0
 * 
 * Approach:
 * Approach1=Brute Force
 * 
 * Pseudocode:
 * Declare count variable
 * Declare sum integer variable to store the sum of the even integers
 * Iterate from 0 to Array of length-1
 * 	If array[i] is divisible by 2
 * 		If array[i] is divisible by 3
 * 		sum=sum+array[i]
 * 		count=count+1;
 * return sum/count;
 * 
 * 
 * 
 * 
 */
public class AverageValueOfEvenNumber {
	@Test
	public void test() {
		System.out.println(findAverageValueOfEvenNumber(new int[]{1,3,6,10,12,15}));
	}
	
	@Test
	public void test1() {
		System.out.println(findAverageValueOfEvenNumber(new int[]{1,2,4,7,10}));
	}
	
	public int findAverageValueOfEvenNumber(int[] inputArray) {
		int count=0,sum=0,result=0;
		for(int i=0;i<inputArray.length;i++) {
			if(inputArray[i]%2==0) {
				if(inputArray[i]%3==0) {
					sum=sum+inputArray[i];
					count=count+1;
				}
			}
		}
		if(count>0)
		result=sum/count;
		
		return result;
		
	}

}
