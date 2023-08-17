/**
 * 
 */
package mandatoryHomework.foundations;

import org.junit.Test;

/**
 * @author abiramisa
 * https://leetcode.com/problems/climbing-stairs/description/
 * 
 * In Simple terms it is fibonacci series:
 * 
 * You are climbing a staircase. It takes n steps to reach the top.
	Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 * 
 * 
 * 
 *
 */
public class ClimbStairs {
	@Test
	public void test() {
		System.out.println(findClimbStairs(8));
	}
	
	public int findClimbStairs(int steps) {
		
		int step1=1;
		int step2=1;
		int temp=0;
		
		for(int i=1;i<steps;i++) {
			temp=step1+step2;
			step2=step1;
			step1=temp;
		}
		return step1;
		
	}

}
