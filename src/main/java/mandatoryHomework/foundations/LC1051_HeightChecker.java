/**
 * 
 */
package mandatoryHomework.foundations;


import java.util.Arrays;

import org.junit.Test;

/**
 * 11-Sep-2023
 * https://leetcode.com/problems/height-checker/
 * 
 * DataSet:
 * Input: heights = [1,1,4,2,1,3]
	Output: 3
 * heights:  [1,1,4,2,1,3]
 * expected: [1,1,1,2,3,4]
 * 
 * Input: heights = [5,1,2,3,4]
 * Output: 5
 * heights:  [5,1,2,3,4]
 * expected: [1,2,3,4,5]
 * 
 * Input: heights = [1,2,3,4,5]
 * Output: 0
 * heights:  [1,2,3,4,5]
 * expected: [1,2,3,4,5]
 * 
 * Input: heights = [1,1,1,1,1]
 * Output: 0
 * 
 * 
 * 
 * Pseudocode:
 * Declare an integer max, count, temp
 * iterate the array
 * if the array[i] is less than or equal to array[i+1] then continue
 * else increase the count
 * for last element in the array compare with max..if the element is less 
 * than max value increase the count 
 * 
 * 
 */
public class LC1051_HeightChecker {
	@Test
	public void test() {
		System.out.println(heightChecker(new int[] {1,1,4,2,1,3}));
	}
	
	@Test
	public void test1() {
		System.out.println(heightChecker(new int[] {5,1,2,3,4}));
	}
	
	@Test
	public void test2() {
		System.out.println(heightChecker(new int[] {1,2,3,4,5}));
	}
	
	@Test
	public void test3() {
		System.out.println(heightChecker(new int[] {1,1,1,1,1}));
	}
	
	
	 public int heightChecker1(int[] heights) {
	      int count=0,max=Integer.MIN_VALUE;
	      for(int i=0;i<heights.length;i++) {
	    	  if(i<heights.length-1) {
	    		  if(heights[i]>max)
	    			  max=heights[i];
	    		  
	    		  if(heights[i]>heights[i+1])
	    			  count++;
	    	  }
	    	  if(i==heights.length-1) {
	    		  if(heights[heights.length-1]<max)
	    			  count++;
	    	  }
	    		  
	      }
	      return count;
	    }
	 
	 public int heightChecker(int[] heights) {
	      int count=0;
	      int[] arr=new int[heights.length];
		     for(int i=0;i<heights.length;i++) {
		    	 arr[i]=heights[i];
		     }
	     
		     Arrays.sort(arr);
		     for(int i=0;i<heights.length;i++) {
		    	 if(arr[i]!=heights[i])
		    		 count++;
		     }
	     
	     
	      return count;
	    }

}
