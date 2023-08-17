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
 * Given an integer numsay nums, return true if any value appears at least twice in 
 * the numsay,
 * and return false if every element is distinct
 * input -> integer numsay -> {1,2,3,1}
 * output -> boolean -> true/false
 * Pseudocode:
 * get the count of each element in the nums array and add it in the map
 * compare the value in the map
 * if the count of any element is 2 return true
 * else if the count of any element is more than 2 or less than 2 return false
 */
public class DuplicateElement {
	@Test
	public void testSample1() {
		
		System.out.println(findDuplicateCount(new int[]{1,2,3,1}));
		
	}
	
	@Test
	public void testSample2() {
		
		System.out.println(findDuplicateCount(new int[]{1,2,3,4}));
		
	}
	
	@Test
	public void testSample3() {
		
		System.out.println(findDuplicateCount(new int[]{1,1,1,3,3,4,3,2,4,2}));
		
	}
	
	public static boolean findDuplicateCount(int[] nums) {
		
		int count=0;
		Map<Integer,Integer> map=new HashMap<Integer, Integer>();
		//boolean result=false;
		for(int i=0;i<nums.length;i++) {
				if(map.containsKey(nums[i])) {
						count=map.get(nums[i]);
						map.put(nums[i], count+1);
					}else {
						map.put(nums[i], 1);
					}
				}
		if(map.containsValue(2)) {
			return true;
		}else
			return false;
	}
		
		
		

}
