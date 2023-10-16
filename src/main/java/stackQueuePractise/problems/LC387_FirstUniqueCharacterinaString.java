/**
 * 
 */
package stackQueuePractise.problems;

import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import org.junit.Test;

/**
 * https://leetcode.com/problems/first-unique-character-in-a-string/
 * 
 * DataSet:
 * Input: s = "leetcode"
 * Output: 0
 * 
 * Input: s = "loveleetcode"
 * Output: 2
 * 
 * Input: s = "aabb"
 * Output: -1
 * 
 * Pseudocode:
 * Frequency Array:
 * Declare an integer frequency array of size 26
 * iterate the characters of the string and add the character in the ascii array
 * iterate the string 
 * 	if the ascii array of the character count is 1 return i
 * return -1;
 * 
 * HashMap
 * Declare the hashMap with character and integer
 * iterate the characters of the string and add it to the hashmap and the count
 * iterate the characters of the string
 * 	if the map contains the character of the string and the corresponding value is 1 return i
 * return -1;
 *  		
 * 
 */
public class LC387_FirstUniqueCharacterinaString {
		@Test
		public void test() {
			System.out.println(firstUniqueChar("aabb"));
		}
	
		public int firstUniqChar(String s) {
			HashMap<Character,Integer> map=new HashMap<Character,Integer>();
		      for(int i=0;i<s.length();i++){
		            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0) + 1);
		      }
		      for(int i=0;i<s.length();i++){
		          if(map.containsKey(s.charAt(i)) && map.get(s.charAt(i))==1) 
		        	  return i;
		}
	      return -1;
	   }
		
		public int firstUniqueChar(String s) {
			int[] ascii=new int[26];
			for(int i=0;i<s.length();i++) {
				ascii[s.charAt(i)-'a']++;
			}
			System.out.println(Arrays.toString(ascii));
			for(int i=0;i<s.length();i++) {
				if(ascii[s.charAt(i)-'a']==1) return i;
			}
			return -1;
		}
		
		public int firstUniqueCharQ(String s) {
			int[] ascii=new int[26];
			Queue<Character> que=new LinkedList<Character>();
			for(int i=0;i<s.length();i++) {
				que.add(s.charAt(i));
				ascii[s.charAt(i)-'a']++;
				while(!que.isEmpty() && ascii[que.peek()-'a']>1) {
					que.remove();
				}
			}
			return que.isEmpty()?-1:s.indexOf(que.peek());
		}

}
