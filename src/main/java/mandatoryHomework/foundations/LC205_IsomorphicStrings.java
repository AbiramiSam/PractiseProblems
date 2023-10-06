/**
 * 
 */
package mandatoryHomework.foundations;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.junit.Test;

/**
 * 06-Oct-2023
 * https://leetcode.com/problems/isomorphic-strings/
 * 
 * 
 * DataSet:
 * Input: s = "egg", t = "add"
 * Output: true
 * 
 * Input: s = "foo", t = "bar"
 * Output: false
 * 
 * Input: s = "paper", t = "title"
 * Output: true
 * 
 * Input: s="paper", t="strip"
 * Output: false
 * 
 * Pseudocode:
 * Declare a HashMap
 * iterate the string s 
 * if the value of the map is not already present
 * add to the map. key as string s and map value as string t 
 * Declare a string builder
 * Iterate the string s
 * append the stringbuilder with the value of the map 
 * if the stringbuilder is equal to string t return true;
 * else return false; 
 * 
 * 
 */
public class LC205_IsomorphicStrings {
		@Test
		public void test0() {
			System.out.println(isIsomorphic("bbbaaaba", "aaabbbba"));
		}
		
		@Test
		public void test1() {
			System.out.println(isIsomorphic("foo", "bar"));
		}
		@Test
		public void test2() {
			System.out.println(isIsomorphic("paper", "title"));
		}
		@Test
		public void test3() {
			System.out.println(isIsomorphic("egg", "add"));
		}
		
		public boolean isIsomorphic(String s, String t) {
			 Map<Character,Character> map=new HashMap<Character,Character>();
				StringBuilder sb=new StringBuilder();
				for(int i=0;i<s.length();i++) {
					if(!map.containsValue(t.charAt(i)))
					map.put(s.charAt(i),t.charAt(i));
				}
				System.out.println(map);
				for(int i=0;i<s.length();i++) {
					sb.append(map.get(s.charAt(i)));
				}
				System.out.println(sb);
				if(t.equals(sb.toString())) {
					return true;
				}
				return false;
		}
	
		public boolean isIsomorphicHS(String s, String t) {
		        Set<Character> sSet=new HashSet<Character>();
		        Set<Character> tSet=new HashSet<Character>();
		        for(int i=0;i<s.length();i++) {
		        	if(s.charAt(i)==t.charAt(i)) {
		        		return false;
		        	}
		        	else {
		        	sSet.add(s.charAt(i));
		        	tSet.add(t.charAt(i));
		        	}
		        }
		        if(tSet.size()==sSet.size())
		        	return true;
		      
		        return false;
		    }
	
	

}
