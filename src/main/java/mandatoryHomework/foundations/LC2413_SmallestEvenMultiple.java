/**
 * 
 */
package mandatoryHomework.foundations;

import org.junit.Test;

/**
 * https://leetcode.com/problems/smallest-even-multiple/
 * 
 * Given a positive integer n, return the smallest positive integer that is a multiple of both 2
 * and n.
 * 
 * Dataset:
 * Input: n = 5
 * Output: 10
 * 
 * Input: n = 6
 * Output: 6
 * 
 * Pseudocode:
 * Declare and integer sm
 * if the given integer is divisible by 2 and greater than 2 return the integer
 * if the given integer is not divisible by 2 then multiply the integer with 2 and return the multiple
 * 
 * Time complexity: O(1)
 * 
 */
public class LC2413_SmallestEvenMultiple {
		@Test
		public void test() {
			System.out.println(smallestEvenMultiple(5));
		}
		
		@Test
		public void test1() {
			System.out.println(smallestEvenMultiple(10));
		}
	
		public int smallestEvenMultiple(int n) {
		        int sm=0;
		        if(n==1 || n==2) {
		        	return 2;
		        }
		        if(n>2 && n%2==0) {
		        	return n;
		        }
		        else {
		        	sm=n*2;
		        }
		       return sm;
		    }

}
