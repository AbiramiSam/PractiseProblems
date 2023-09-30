/**
 * 
 */
package mandatoryHomework.foundations;

import org.junit.Test;

/**
 * 15-Sep-2023
 * https://leetcode.com/problems/minimum-additions-to-make-valid-string/
 * 
 * Input: word = "b"
 * Output: 2
 * 
 * Input: word = "aaa"
 * Output: 6
 * 
 * Input: word = "abc"
 * Output: 0
 * 
 * Pseudocode:
 * Declare integer variable aCount, bCount, cCount and count
 * iterate through the elements of the string
 * if the character is a then increase the aCount
 * if the character is b then increase the bCount
 * if the character is c then increase the cCount
 * if the aCount bCount and cCount are equal return 0
 * if aCount is greater than bCount
 * increase bCount
 * else increase the aCount
 * if bCount is greater then cCount
 * increase cCount
 * else increase the bCount
 * count=(aCount+bCount+cCount)-word.length
 * return count;
 * 
 * 
 */
public class LC2645_MinimumAdditionstoMakeValidString {
	@Test
	public void test() {
		System.out.println(addMinimum("abcaaaabbabc"));
	}
	
	@Test
	public void test1() {
		System.out.println(addMinimum("aaa"));
	}
	
	@Test
	public void test2() {
		System.out.println(addMinimum("aaaabb"));
	}
	
	@Test
	public void test3() {
		System.out.println(addMinimum("abcaaaabbcabc"));
	}
	
	@Test
	public void test4() {
		System.out.println(addMinimum("b"));
	}
	
	public int addMinimum(String word) {
		
		int count=0,subLen=0,sub1Len=0;
		String sub="";
		String sub1="";
		if(word.length()>1 && !(word.equals("abc"))) {
		String subString=word.replace("abc",""); //aaa
		if(subString.contains("ab")) {
		sub=subString.replace("ab",""); 
		subLen=sub.length();
		}else{
			subLen=subString.length();
		}
		if(subString.contains("bc")) {
		sub1=subString.replace("bc", "");
		sub1Len=sub1.length();//aaa
		}
		else {
			sub1Len=sub.length();
		}
		if(subLen!=sub1Len) {
		count=(sub1Len*2)+(subLen/2)-1;
		}
		else {
			count=subLen*2;
		}
		}
		if(word.length()==1) {
			return 2;
		}
		if(word.equals("abc")) {
			return 0;
		}
		return count;
	}
}
