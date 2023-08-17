package mandatoryHomework.foundations;

import org.junit.Test;

/**
 * @author abiramisa
 * Check if given number is a prime number
 * Step 1: Given input of a number [integer]
 * Step 2: Loop till the given number
 * Step 3: check if the given number is divisible only by that number
 * Step 4: return string "It is prime"
 * Step 5: if the given number is divisible by any other number then it is not prime
 *
 */
public class PrimeNumbers {
	@Test
	public void test1() {
		System.out.println(findPrime(23));
	}
	
	
	public static boolean findPrime(int num) {
		
		for(int i=2;i<num;i++) {
			
			if(num%i==0) {
				return false;
			}
		}
		
		return true;
		
	}

}
