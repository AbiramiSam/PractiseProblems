/**
 * 
 */
package mandatoryHomework.foundations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

/**
 * 13-Sep-2023
 * Vel
 * https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
 * 
 * 
 * DataSet:
 * Input: candies = [2,3,5,1,3], extraCandies = 3
 * Output: [true,true,true,false,true] 
 * 
 * Input: candies = [4,2,1,1,2], extraCandies = 1
 * Output: [true,false,false,false,false] 
 * 
 * Input: candies = [12,1,12], extraCandies = 10
 * Output: [true,false,true]
 * 
 * Input: candies = [1,3], extraCandies = 1
 * Output: [true,true]
 * 
 * 
 * Pseudocode:
 * Declare boolean array
 * Declare an integer count, total, max
 * iterate the elements of the array and find the max value
 * iterate the elements of the candies
 * add the extraCandies to the elements of the candies
 * if the count is greater than or equal to the max value then add true to the boolean array
 * else add false
 * return the boolean array
 * 
 */
public class LC1431_KidsWiththeGreatestNumberofCandies {
	@Test
	public void test() {
		System.out.println(kidsWithCandies(new int[] {2,3,5,1,3}, 3));
	}
	@Test
	public void test1() {
		System.out.println(kidsWithCandies(new int[] {4,2,1,1,2}, 1));
	}
	@Test
	public void test2() {
		System.out.println(kidsWithCandies(new int[] {12,1,12}, 10));
	}
	
	@Test
	public void test3() {
		System.out.println(kidsWithCandies(new int[] {1,3}, 1));
	}
	
	@Test
	public void test4() {
		System.out.println(kidsWithCandies(new int[] {2,8,7}, 1));
	}
	
	public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
		int count=0, max=Integer.MIN_VALUE;
		List<Boolean> blist=new ArrayList<Boolean>();
		for(int i=0;i<candies.length;i++) {
			if(candies[i]>max) {
				max=candies[i];
			}
		}
		for(int i=0;i<candies.length;i++) {
			count=candies[i]+extraCandies;
			if(count>=max) {
				blist.add(true);
			}else
				blist.add(false);
		}
	       return blist; 
	    }

}
