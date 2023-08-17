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
 * Given a non-empty array of integers nums, every element appears twice
 * except for one. Find that single one
 * 
 * You must implement a solution with a linear runtime 
 * complexity and use only constant extra space.
 * 
 *Input: nums = [2,2,1]
Output: 1

Input: nums = [4,1,2,1,2]
Output: 4

Input: nums = [1]
Output: 1
 */
public class SingleNumber {
	@Test
	public void testSample1() {
		System.out.println(findSingleNumber(new int[] {2,2,1}));
	}
	
	@Test
	public void testSample2() {
		System.out.println(findSingleNumber(new int[] {4,1,2,1,2}));
	}
	
	@Test
	public void testSample3() {
		System.out.println(findSingleNumber(new int[] {1}));
	}
	
	public static int findSingleNumber(int[] arr) {
		int num=0;
		int count=0;
		Map<Integer,Integer> map=new HashMap<Integer, Integer>();
		
		for(int i=0;i<arr.length;i++) {
					
					if(map.containsKey(arr[i])) {
						count=map.get(arr[i]);
						map.put(arr[i], count+1);
					}else {
						map.put(arr[i], 1);
					}
				}
		for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
			if(entry.getValue()==1) {
            num=entry.getKey();
			}
		}
		
		return num;
	}

	
	public int finSingleNumber(int[]arr) {
		Set<Integer> set=new HashSet<Integer>();
		for (int i : arr) {
			if(!set.add(i)) {
				set.remove(i);
			}
		}
		return set.iterator().next();
	}
}
