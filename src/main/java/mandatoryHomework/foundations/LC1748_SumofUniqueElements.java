/**
 * 
 */
package mandatoryHomework.foundations;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

/**
 * 05-Oct-2023
 * https://leetcode.com/problems/sum-of-unique-elements/
 * 
 * DataSet:
 * Input: nums = [1,2,3,2]
 * Output: 4
 * 
 * Input: nums = [1,1,1,1,1]
 * Output: 0
 * 
 * Input: nums = [1,2,3,4,5]
 * Output: 15 
 * 
 * Input: nums = [1,1,2,2,3,3]
 * Output: 0
 * 
 * 
 * Pseudocode:
 * Delcare a integer hashmap
 * iterate the array and add the elements of the array and its count to hashmap
 * iterate the map 
 * 	if the value is 1 add the key to sum
 * return the sum 
 * 
 * 
 * Time Complexity: O(N)
 * 
 */
public class LC1748_SumofUniqueElements {
	@Test
	public void test() {
		System.out.println(sumOfUnique(new int[] {10,4,10,9,5}));
	}
	
	@Test
	public void test1() {
		System.out.println(sumOfUnique(new int[] {1,1,1,1,1}));
	}
	
	@Test
	public void test2() {
		System.out.println(sumOfUnique(new int[] {1,2,3,4,5}));
	}
	
	@Test
	public void test3() {
		System.out.println(sumOfUnique(new int[] {1,1,2,2,3,3}));
	}
	
	public int sumOfUnique(int[] nums) {
	        Map<Integer,Integer> map=new HashMap<Integer, Integer>();
	        int count=0,sum=0;
	        for(int i=0;i<nums.length;i++) {
	        	if(map.containsKey(nums[i])) {
	        		count=map.get(nums[i])+1;  
	        		map.put(nums[i],count);
	        	}else {
	        		map.put(nums[i], 1);
	        	}
	        }
	        System.out.println(map);
	        for (Map.Entry<Integer, Integer> entry: map.entrySet()) {
				if(entry.getValue()==1)
					sum+=entry.getKey();
			}
	        return sum;
	   }

}
