/**
 * 
 */
package mandatoryHomework.foundations;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import org.junit.Test;

import junit.framework.Assert;

/**
 * @author abiramisa
 * Homework
 * https://leetcode.com/problems/second-largest-digit-in-a-string/description/
 * 
 * Given an alphanumeric string s, return the second largest numerical digit that appears in s,
 * or -1 if it does not exist.
 * An alphanumeric string is a string consisting of lowercase English letters and digits.
 * 
 * Input: s = "dfa12321afd"
 * Output: 2
 * Explanation: The digits that appear in s are [1, 2, 3]. The second largest digit is 2.
 * 
 *
 */
public class SecondLargestDigit {
	@Test
	public void test() {
		Assert.assertEquals(2,(findSecondLargestDigit("dfa12321afd")));
	}
	
	@Test
	public void test1() {
		Assert.assertEquals(-1,(findSecondLargestDigit("abc1111")));
	}
	
	public int findSecondLargestDigit(String s) {
		String value=s.replaceAll("[a-zA-Z]", "");
		Set<Character> tset=new TreeSet<Character>();
		int num1=0;
		int j=0;
		
		//converting to treeset
		for(int i=0;i<value.length();i++) {
			tset.add(value.charAt(i));
		}
		
		char[] arr=new char[tset.size()];
		//adding treeset elements to array
		for (char ele : tset) {
			arr[j++]=ele;
		}
		
		//converting ASCII value to integer
		if(arr.length>1) {
		num1=Character.getNumericValue(arr[arr.length-2]);
		}
		else
			num1=-1;
		return num1;
	}

}
