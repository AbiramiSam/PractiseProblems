/**
 * 
 */
package mandatoryHomework.foundations;

import org.junit.Test;

import junit.framework.Assert;

/**
 * @author abiramisa
 *	Given an integer n, return the number of prime numbers that are strictly less than n
 * 	using while loop
 * 	input: any integer 
 *  output: integer
 *  if number is divisible by any other number "It is not prime"
 *  else it is prime
 *  
 * 	
 */
public class CountOfPrimeNumbers {
	@Test
	public void positivetest() {
		//System.out.println(countOfPrimeNumber(6));
		Assert.assertEquals(6, countOfPrimeNumber(13));
	}
	
	@Test
	public void negativetest() {
		//System.out.println(countOfPrimeNumber(6));
		Assert.assertEquals(0, countOfPrimeNumber(1));
	}
	
	@Test
	public void edgetest() {
		//System.out.println(countOfPrimeNumber(6));
		Assert.assertEquals(0, countOfPrimeNumber(0));
	}
	
	public static int countOfPrimeNumber(int num) {
		//int i=2;
		int count=0;
		while(num>0) {
			if(findPrime(num)) {
				count++;
			}
			num--;
		}
		return count;
		
	}
	
public static boolean findPrime(int num) {
		if(num==1) {
			return false;
		}
		for(int i=2;i<num;i++) {
			
			if(num%i==0) {
				return false;
			}
		}
		
		return true;
		
	}
}
