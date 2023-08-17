/**
 * 
 */
package mandatoryHomework.foundations;

import org.junit.Test;

import junit.framework.Assert;

/**
 * @author abiramisa
 * Homework
 * https://leetcode.com/problems/jewels-and-stones/description/
 * 
 * You're given strings jewels representing the types of stones that are jewels, and stones
 * representing the stones you have. Each character in stones is a type of stone you have. You
 * want to know how many of the stones you have are also jewels.
 * Letters are case sensitive, so "a" is considered a different type of stone from "A".
 * 
 * Input: jewels = "aA", stones = "aAAbbbb"
 * Output: 3
 * 
 * 
 *
 */
public class JewelsAndStones {
	@Test
	public void test() {
		Assert.assertEquals(3,(findJewelsAndStones("aA", "aAAbbbb")));
	}
	
	@Test
	public void test1() {
		Assert.assertEquals(0,(findJewelsAndStones("z", "ZZ")));
	}
	
	
	public int findJewelsAndStones(String jewels, String stones) {
		int res=0;
		for(int i=0;i<jewels.length();i++) {
			for(int j=0;j<stones.length();j++) {
				if(stones.charAt(j)==jewels.charAt(i)) {
					res=res+1;
				}
			}
		}
		
		return res;
	}

}
