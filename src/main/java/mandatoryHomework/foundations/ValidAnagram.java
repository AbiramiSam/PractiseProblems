/**
 * 
 */
package mandatoryHomework.foundations;

import java.util.Arrays;

import org.junit.Test;

/**
 * @author abiramisa
 * Clasroom:
 * https://leetcode.com/problems/valid-anagram/
 * 
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
 * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
 * 
 * Input: s = "anagram",
 * 			   nagaram t = "nagaram"
 * Output: true
 * 
 *
 */
public class ValidAnagram {
	@Test
	public void test() {
		System.out.println(findAnagram("anagram", "nagaram"));
	}
	
	@Test
	public void test1() {
		System.out.println(findAnagram("rat", "cat"));
	}
	
	public boolean findValidAnagram(String s, String t) {
		String temp="";
		//char[] ch2=t.toCharArray();
		char ch1=' ';
		char[] ch=s.toCharArray();
 		for(int i=0;i<ch.length-1;i++) {
				ch1=ch[i];
				ch[i]=ch[i+1];
				ch[i+1]=ch1;
				System.out.println(ch);
				for(int j=0;j<ch.length;j++) {
					if(ch.toString().equals(t)) {
						return true;
					}
				}
			}
			
		//System.out.println(temp);
		return false;
				
	}
	
	public boolean findAnagram(String s,String t) {
		int sSum=0;
		int tSum=0;
		int temp=0;
		for(int i=0;i<s.length();i++) {
			sSum=sSum+(int)s.charAt(i);
			
		}
		for(int j=0;j<t.length();j++) {
			tSum=tSum+(int)t.charAt(j);
		}
		
		if(sSum==tSum) {
			return true;
		}
		
		return false;
	}

}
