/**
 * 
 */
package mandatoryHomework.foundations;

import org.junit.Test;

/**
 * 25-Sep-2023
 * https://leetcode.com/problems/minimum-recolors-to-get-k-consecutive-black-blocks/description/
 * 
 * Pseudocode:
 * Declare integer max, limit and pointer1
 * while(pointer1 is less than limit
 * initialize count to 0
 * while j is less than limit
 * if the character is W
 * increase the counter
 * return the minimum of the counter
 *  
 * 
 */
public class LC2379_MinimumRecolorstoGetKConsecutiveBlack { 

	@Test
	public void test2() {
		System.out.println(minimumRecolors("BWWWBB", 6));
	}
	
	@Test
	public void test() {
		System.out.println(minimumRecolors("WBBWWBBWBW", 7));
	}
	
	@Test
	public void test1() {
		System.out.println(minimumRecolors("WBWBBBW", 2)); 
	}
	
	 public int minimumRecolors(String blocks, int k) {
		 int max=Integer.MAX_VALUE;
	        int limit = blocks.length() - k;
	        int pointer1=0;
	        while(pointer1<=limit)
	        {
	            int count = 0;
	            for(int j=pointer1;j<pointer1+k;j++)
	            {
	                if(blocks.charAt(j)=='W')
	                    count++;
	            }
	            max = Math.min(max,count);
	            pointer1++;
	        }
	        return max;
	 }
}
