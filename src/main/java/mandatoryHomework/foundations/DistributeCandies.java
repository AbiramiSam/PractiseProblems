/**
 * 
 */
package mandatoryHomework.foundations;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

import junit.framework.Assert;

/**
 * @author abiramisa
 * https://leetcode.com/problems/distribute-candies/description/
 * 
 * Alice has n candies, where the ith candy is of type candyType[i]. 
 * Alice noticed that she started to gain weight, so she visited a doctor.

The doctor advised Alice to only eat n / 2 of the candies she has (n is always even). 
Alice likes her candies very much, and she wants to eat the maximum number of different types 
of candies while still following the doctor's advice.

Given the integer array candyType of length n, return the maximum number of different 
types of candies she can eat if she only eats n / 2 of them.
 *
 *Input: candyType = [1,1,2,2,3,3]
Output: 3
Explanation: Alice can only eat 6 / 2 = 3 candies. 
Since there are only 3 types, she can eat one of each type.
 *
 *pseudocode:
 *intput : integer array -> [1,1,2,2,3,3]
 *output : integer -> 3
 *
 *1. iterate through the array
 *2. add the elements of the array to set (so that the duplicated will get removed)
 *3. divide the length of the array by 2 and store it as halfElement
 *4. get size of the set 
 *5. if the size of the set and halfElement is equal return the value
 *6. if size of the set is greater than the half element return the return the half element
 *
 *
 */
public class DistributeCandies {
	
	@Test
	public void testSample1() {
		Assert.assertEquals(3,distributeCandies(new int[] {1,1,2,2,3,3}));
		
	}
	
	@Test
	public void testSample2() {
		Assert.assertEquals(2,distributeCandies(new int[] {1,1,2,3}));
		
	}
	
	@Test
	public void testSample3() {
		Assert.assertEquals(1,distributeCandies(new int[] {6,6,6,6}));
		
	}
	
	public int distributeCandies(int[] candies) {
		
	Set<Integer> candiesSet=new HashSet<Integer>();
	int half=0;
	int size=0;
		
		for(int i=0;i<candies.length;i++) {
			candiesSet.add(candies[i]);
		}
	half=candies.length/2;
	size=candiesSet.size();
	if(size>half) {
		return half;
	}
	return size;
	
	}
}
