/**
 * 
 */
package mandatoryHomework.foundations;

import java.util.Arrays;

import org.junit.Test;

import junit.framework.Assert;

/**
 * @author abiramisa
 * Find the number of 1's present in the array
 */
public class NumberOfOnesWithoutCounter {
	@Test
	public void positivTest() {
		//int[] nums= {1,0,0,0,1,1,1,1};
		//System.out.println(findNumberOfOnes(nums));
		Assert.assertEquals(5, findNumberOfOnes(new int[] {1,0,0,0,1,1,1,1}));
	}
	
	public static int findNumberOfOnes(int[] nums) {
		
		Arrays.sort(nums);
		
		for(int i=0;i<nums.length;i++) {
			if(nums[i]==1) {
				return nums.length-i;
				
			}
		}
		return 0;
		
	}

}
