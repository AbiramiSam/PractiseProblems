/**
 * 
 */
package mandatoryHomework.foundations;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

import org.junit.Test;

/**
 * 14-Sep-2023
 * https://leetcode.com/problems/check-if-number-has-equal-digit-count-and-digit-value/description/
 * 
 * DataSet:
 * Input: num = "1210"
 * Output: true
 * num[0] = '1'. The digit 0 occurs once in num.
 * num[1] = '2'. The digit 1 occurs twice in num.
 * num[2] = '1'. The digit 2 occurs once in num.
 * num[3] = '0'. The digit 3 occurs zero times in num.
 * The condition holds true for every index in "1210", so return true.
 * 
 * Input: num = "030"
 * Output: false
 * 
 * 
 * Pseudocode:
 * Declare an integer count, boolean output=false;
 * convert the string array to char array
 * iterate the array from i
 * iterate the array from j
 * if i is present in the array
 * increase the count
 * if the count is equal to the nums[i] boolean == true
 * else return false
 * return boolean
 * 
 * 
 * 
 */
public class LC2283_CheckifNumberHasEqualDigit {
	@Test	
	public void test() {
		System.out.println(digitCount("1210"));
	}
	
	@Test	
	public void test1() {
		System.out.println(digitCount("030"));
	}
		public boolean digitCount(String num) {
			final char[] digit = num.toCharArray(); // convert string to char array
		    int[] count = new int[10]; // count arr length 10 because constraint 1<=n<=10
		    for (char c : digit) {
		      count[c - '0']++; // count of digits 
		    }
		    for (int i = 0; i < digit.length; i++) {
		      if (digit[i] - '0' != count[i]) { // check 
		        return false;
		      }
		    }

		    return true;
		}

}
