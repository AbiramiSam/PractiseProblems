/**
 * 
 */
package mandatoryHomework.foundations;

import org.junit.Test;

import junit.framework.Assert;

/**
 * @author abiramisa
 * 
 * * You have n coins and you want to build a staircase with these coins. The staircase 
 * consists of k rows where the ith row has exactly i coins. 
 * The last row of the staircase may be incomplete.
 * Given the integer n, return the number of complete rows of the staircase you will build.
 * if input=5 output=2
 * $
 * $$
 * $$-
 * incomplete last row
 * 
 * 1.Get the Input value
     * 2.Using for loop to iterate i should be start with 1 till element the n  consider 1
     *  if(i<balance){
     * 3. variable balance to be declared n-i  n =10  10-1  = 9 
     * 4. variable count++ to increase the completed rows }
 *
 */
public class ArrangingCoins {
	@Test
	public void testSample1() {
		Assert.assertEquals(2, arrangeCoins(5));
	}
	
	@Test
	public void testSample2() {
		Assert.assertEquals(3, arrangeCoins(8));
	}
	
	public int arrangeCoins(int num) {
		int count=0;
		int value=0;
		for(int i=1;i<num;i++) {
			value=num-i; 	//5-1=4 //4-2 
			if(i<value) {	//1		//2
				count=count+1; //2
			}
		}
		
		return count;
	}
}
