/**
 * 
 */
package mandatoryHomework.foundations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

/**
 * @author abiramisa
 * Homework
 * 
 * You are given a 0-indexed string s that has lowercase English letters in its even indices and
 * digits in its odd indices.
 * 
 * There is a function shift(c, x), where c is a character and x is a digit, that returns the xth
 * character after c.
 * Input: s = "a1c1e1"
 * Output: "abcdef"
 * Explanation: The digits are replaced as follows:
 * s[1] -> shift('a',1) = 'b'
 * s[3] -> shift('c',1) = 'd'
 * s[5] -> shift('e',1) = 'f'
 *
 *
 *Input: s = "a1b2c3d4e"
 *Output: "abbdcfdhe"
 *
 */
public class ReplaceAllDigits {
	@Test
	public void test() {
		System.out.println(findReplaceAllDigits("a1c1e1"));
	}
	
	@Test
	public void test1() {
		System.out.println(findReplaceAllDigits("a1b2c3d4e"));
	}
	
	public String findReplaceAllDigits(String s) {
		
		int temp=1;
		int ascii=0;
		int num=0;
		char ch=' ';
		String sn=" ";
		List<Character> arrList=new ArrayList<Character>();
		for(int i=0;i<s.length();i++) {
			if(i==temp) {
				num=Character.getNumericValue(s.charAt(i));
				ascii=ascii+num;
				ch=(char)ascii;
				arrList.add(ch);
				temp=temp+2;
			}else {
				arrList.add(s.charAt(i));
			}
			ascii=s.charAt(i);	
		}
		//sn=arrList.toString().replaceAll(",\s", "");
		//sn=sn.replaceAll("\s", "");
		//sn=arrList.toString();
		//System.out.println("string length"+sn.length());
		return sn.substring(1, sn.length()-1);
	}

}
