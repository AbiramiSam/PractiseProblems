/**
 * 
 */
package mandatoryHomework.foundations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;

/**
 * 06-Oct-2023
 * https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
 * 
 * DataSet:
 * Input: nums = [4,3,2,7,8,2,3,1]
 * Output: [5,6]
 * 
 * Input: nums = [1,1]
 * Output: [2]
 * 
 * 
 * Pseudocode:
 * Declare hash set of integers and list of integers
 * sort the arrays
 * iterate the arrays
 * add the integer to set
 * 
 * Time Complexity: ON
 * 
 */
public class LC448_FindAllNumbersDisappearedinanArray {
		@Test
		public void test() {
			String output=findDisappearedNumbers(new int[] {4,3,2,7,8,2,3,1}).toString();
			System.out.println(output);
		}
		
		@Test
		public void test1() {
			String output=findDisappearedNumbers(new int[] {1,1}).toString();
			System.out.println(output);
		}
	
		public List<Integer> findDisappearedNumbers(int[] nums) {
		        Set<Integer> numSet=new HashSet<Integer>();
		        List<Integer> list=new ArrayList<Integer>();
		        Arrays.sort(nums);
		        for(int i=0;i<nums.length;i++) {
		        	numSet.add(nums[i]);
		        }
		        for(int i=1;i<=nums.length;i++) {
		        	if(!numSet.contains(i))
		        		list.add(i);
		        }
		        return list;
		    }

}
