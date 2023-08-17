/**
 * 
 */
package mandatoryHomework.foundations;

import org.junit.Test;

import junit.framework.Assert;

/**
 * @author abiramisa
 * https://leetcode.com/problems/power-of-two/description/
 *Given an integer n, return true if it is a power of two. Otherwise, return false.
	An integer n is a power of two, if there exists an integer x such that n == 2x.
	Input: n = 1
	Output: true
	Explanation: 2pow0 = 1
 *
 */
public class PowerOfTwo {
	@Test
	public void testSample1() {
		Assert.assertEquals(true, findPowerOfTwo(1));
	}
	
	
	public boolean findPowerOfTwo(int input) {
		
		while(input%2==0) {
			input=input/2;
		}
		
		return input==1;
	}

	public static void main(String[] args) {
		
		int num=32;
		int temp=0;
		int pow=1;
		if(num==1) {
			pow=0;
		}
		if(num%2==0) {
		for(int i=0;i<=num;i++) {
			temp=num/2;
			num=temp;
			pow=pow+1;
		}
		}
	
		System.out.println(pow);
	}
}
