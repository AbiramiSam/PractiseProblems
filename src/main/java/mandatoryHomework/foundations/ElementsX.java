/**
 * 
 */
package mandatoryHomework.foundations;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

/**
 * @author abiramisa
 *Given an integer array arr, count how many elements x there are,
 *such that x+1 is also in arr.
 *If there are duplicates in arr count them separately
 *
 *
 *input ={1,2,3}
 *output =2
 * when x is 1, we see x+1 (2) is present in input 
 * when x is 2, we see x+1 (3) is present in input
 * when x is 3, we see x+1 (4) is not present in input
 *  so number of presence of x+1 is 2
 *  
 *  input ={1,1,3,3,5,5,7,7}
 *  output =0
 *  when x is 1, we see x+1 (2) is not present in input 
 *  when x is 3, we see x+1 (4) is not present in input
 *  
 *  input ={1,1,2}
 *	output =2
 *  when x is 1, we see x+1 (2) is present in input 
 *  when x is 2, we see x+1 (3) is not present in input
 *  
 *  
 *  //try using set
 *
 */
public class ElementsX {
	
	@Test
	public void testSample1() {
		System.out.println(findElementX(new int[] {1,2,3}));
	}
	
	@Test
	public void testSample2() {
		System.out.println(findElementX(new int[] {1,1,3,3,5,5,7,7}));
	}
	
	@Test
	public void testSample3() {
		System.out.println(findElementX(new int[] {1,1,2}));
	}
	
	public static int findElementX(int[] arr) {
		int num=0;
		Map<Integer,Integer> map=new HashMap<Integer, Integer>();
		int value=0;
		for(int i=0;i<arr.length;i++) {
			value=arr[i];
			value=value+1;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]==value) {
					num=num+1;
				}
			}
			
		}
		return num;
	}

}
