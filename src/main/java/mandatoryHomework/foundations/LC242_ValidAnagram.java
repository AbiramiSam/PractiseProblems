/**
 * 
 */
package mandatoryHomework.foundations;

import java.util.Arrays;
import java.util.HashMap;

import org.junit.Test;

/**
 * 04-Sep-2023
 * 
 * https://leetcode.com/problems/valid-anagram/
 * 
 * Data Set:
 * Input: s = "anagram", t = "nagaram"
	Output: true
 * 
 * Input: s = "rat", t = "car"
	Output: false
 * 
 * Input: s="s", t="s"
 * Output: true
 * 
 * Pseudocode:
 * Create String builder for word s
 * iterate the character of the string and add its ASCII value
 * if the ascii value of s and t are same
 * then return true
 * 
 * 
 */
public class LC242_ValidAnagram {
	@Test
	public void test() {
		System.out.println(isAnagramMap("anagram", "nagaram"));
	}
	
	@Test
	public void test1() {
		System.out.println(isAnagramMap("rat", "car"));
	}
	
	@Test
	public void test2() {
		System.out.println(isAnagramMap("s", "s"));
	}
	
	@Test
	public void test3() {
		System.out.println(isAnagramMap("ac", "bb"));
	}
	
	//will not work for test set test3
	public boolean isAnagram(String s, String t) {
		int asciiS=0,asciiT=0;
		if(s.length()!=t.length()) {
			return false;
		}
		if(s.length()==t.length()) {
		for(int i=0;i<s.length();i++) {
			asciiS=asciiS+(int)s.charAt(i);
			asciiT=asciiT+(int)t.charAt(i);
		}
		}
		if(asciiS==asciiT) {
			return true;
		}
		return false;
	}
	
	public boolean isAnagramArr(String s, String t) {
		
		if(s.length()!=t.length()) {
			return false;
		}
		char[] sArr=s.toCharArray();
		char[] tArr=t.toCharArray();
		Arrays.sort(sArr);
		Arrays.sort(tArr);
		if(Arrays.equals(sArr, tArr)) {
			return true;
		}
		
		return false;
	}
	
	public boolean isAnagramVel(String s, String t) {
		 if(s.length() != t.length()) return false;

	        int[] counts = new int[26];
			int[] countt = new int[26];//Since all the letters are lowercase
			
			for(int i=0;i<s.length();i++){
				counts[s.charAt(i)-'a'] = counts[s.charAt(i)-'a']+1;
				countt[t.charAt(i)-'a'] = countt[t.charAt(i)-'a']+1;				
			}		
			for(int i=0;i<s.length();i++){
				if(counts[s.charAt(i)-'a'] != countt[s.charAt(i)-'a']) return false;		
			}
			return true;
	}
	
	public boolean isAnagramMap(String s, String t) {
		 if(s.length() != t.length()) return false;

	       HashMap<Character, Integer> sMap=new HashMap<Character, Integer>();
	       HashMap<Character, Integer> tMap=new HashMap<Character, Integer>();
	       
	       for(int i=0;i<s.length();i++) {
	    	   sMap.put(s.charAt(i), sMap.getOrDefault(s.charAt(i),1)+1);
	    	   tMap.put(t.charAt(i), tMap.getOrDefault(t.charAt(i),1)+1);
	       }
	       if(sMap.equals(tMap))
			return true;
	       
	       return false;
	}
	
	public boolean isAnagramMaps(String s, String t) {
		 if(s.length() != t.length()) return false;

	       HashMap<Character, Integer> sMap=new HashMap<Character, Integer>();
	       HashMap<Character, Integer> tMap=new HashMap<Character, Integer>();
	       
	       for(int i=0;i<s.length();i++) {
	    	   sMap.put(s.charAt(i), sMap.getOrDefault(s.charAt(i),1)+1);
	    	   tMap.put(t.charAt(i), tMap.getOrDefault(t.charAt(i),1)+1);
	       }
	       if(sMap.equals(tMap))
			return true;
	       
	       return false;
	}
}
