/**
 * 
 */
package mandatoryHomework.foundations;

import org.junit.Test;

/**
 * 08-Aug-2023
 * https://leetcode.com/problems/three-divisors/
 * 
 * Given an integer n, return true if n has exactly three positive divisors. Otherwise,
 * return false. An integer m is a divisor of n if there exists an integer k such that n = k * m.
 * 
 * 
 * Input:integer
 * Output: boolean
 * 
 * Data:
 * Positive:
 * i/p=4 o/p=true
 * 
 * Negative:
 * i/p=2 o/p=false
 * 
 * Approach:
 * Approach1: Brute Force
 * 
 * Pseudocode:
 * Declare a count integer variable to store the divisors
 * Iterate from i=1 to n
 * 	Iterate from j=1 to n
 * 		if (i*j=n)
 * 			count++
 * 	If count==3
 * 	return true
 * 	else return false.
 *  
 * 
 * 
 * 
 */
public class ThreeDivisors {
	@Test
	public void test() {
		System.out.println(findThreeDivisors(4));
	}
	
	@Test
	public void test1() {
		System.out.println(findThreeDivisors(2));
	}
	
	public boolean findThreeDivisors(int n) {
		int count=0;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i*j==n) {
					count=count+1;
				}
			}
		}
		System.out.println(count);
		if(count==3) {
			return true;
		}
		else {
			return false;
		}
	}

}
