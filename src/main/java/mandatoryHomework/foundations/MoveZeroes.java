/**
 * 
 */
package mandatoryHomework.foundations;

import java.util.Arrays;

import org.junit.Test;

/**
 * @author abiramisa
 * Given an integer array nums, move all 0's to the end 
 * of it while maintaining the relative order of the non-zero elements.
 * 
 * Note that you must do this in-place without making a copy of the array.
 * 
 *  Input: nums = [0,1,0,3,12]
	Output: [1,3,12,0,0]
	
	Input: nums = [0]
	Output: [0]
 *
 *pseudocode:
 *iterate through the array
 *if the element is 0 then swap the next element
 *continue so on
 *and return the array
 */
public class MoveZeroes {
	
	
	@Test
public void testSample1() {
	int[] arr= {0,1,0,3,12};
	findZeroes(arr);
	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
	}
		
	}
	
	public static int[] findZeroes(int[] arr) {
		
		//Arrays.sort(arr);
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
			arr[count]=arr[i];
			System.out.println("count"+count);
			count++;
			
			}
		}
			for(int j=count;j<arr.length;j++) {
				arr[j]=0;

	}

		
		return arr;
	}

}
