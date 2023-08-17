/**
 * 
 */
package mandatoryHomework.foundations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

/**
 * @author abiramisa
 * 
 * Remove the target element in the array
 * input = {2,3,3,4,5}
 * target = 3
 * output = {2,4,5}
 * 
 * input = {2,2}
 * target =2
 * output ={} empty array
 * 
 * 
 * Pseudocode:
 * input = int array
 * target = int
 * iterate through the array
 * if(array[i]!=target)
 *  return new array
 * 
 * return empty array 
 * 
 */
public class RemoveTargetElement {
	@Test
	public void testSample1() {
		
	int[] res=removeTarget(new int[] {2,3,3,4,5}, 3);
	System.out.println(Arrays.toString(res));
		
	}
	
	@Test
	public void testSample2() {
		
	int[] res=removeTarget(new int[] {2,2}, 2);
	System.out.println(Arrays.toString(res));
		
	}
	
	public static int[] removeTarget(int[] arr,int target) {
		
		List<Integer> list=new ArrayList<Integer>();
		int count=0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=target) {
				list.add(arr[i]);
			}
			
		}
		System.out.println(list.size());
		int[] res=new int[list.size()];
		for(int i=0;i<res.length;i++) {
			res[i]=list.get(i);
		}
		return res;
	}

}
