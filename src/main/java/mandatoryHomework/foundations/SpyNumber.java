/**
 * 
 */
package mandatoryHomework.foundations;

import org.junit.Test;

/**
 * 17-Aug-2023
 * 
 * Find if number is SPY number A number whose sum of digits of is equal to the product of its digits 
 * is called spy number
 * 
 * 1+3+2=6
 * 1*3*2=6
 * 
 * Test data:
 * valid = 132
 * valid = 1124
 * invalid =148
 * 
 * Pseudocode:
 * Declare integer variable sum=0, product=1, reminder=0
 * while input is greater than 0
 * 	find the reminder
 * 	add it to sum
 * 	multiply it to product
 * 	divide the input
 * If sum and product are equal 
 * 	return true
 * else
 * 	return false
 * 
 * 
 * 
 * 
 */
public class SpyNumber {
	@Test
	public void test() {
		System.out.println(findSpyNumber(132));
	}
	
	@Test
	public void test1() {
		System.out.println(findSpyNumber(1124));
	}
	
	@Test
	public void test2() {
		System.out.println(findSpyNumber(148));
	}
	
	public boolean findSpyNumber(int input) {
		int rem=0,sum=0,product=1;
		while(input>0) {
			rem=input%10;
			sum=sum+rem;
			product=product*rem;
			input=input/10;
		}
		if(sum==product) {
			return true;
		}
		return false;
	}
}
