	/**
 * 
 */
package mandatoryHomework.foundations;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.Test;
import org.junit.internal.runners.model.EachTestNotifier;

/**
 * 
 * https://leetcode.com/problems/decode-the-message/
 * 
 * 
 * DataSet:
 * Input: key = "the quick brown fox jumps over the lazy dog", message = "vkbs bs t suepuv"
 * Output: "this is a secret"
 * 
 * Input: key = "eljuxhpwnyrdgtqkviszcfmabo", message = "zwx hnfx lqantp mnoeius ycgk vcnjrdb"
 * Output: "the five boxing wizards jump quickly"
 * 
 * 
 * Pseudocode:
 * Declare HashMap with key as lowercase alphabets and values as the character in the string
 * iterate the hashmap and get the key where the character of the message is present and add that to string
 * return the string
 * 
 * 
 * 
 */
public class LC2325_DecodeTheMessage {
	@Test
	public void test() {
		System.out.println(decodeMessage("the quick brown fox jumps over the lazy dog", "vkbs bs t suepuv"));
	}
	
	@Test
	public void test1() {
		System.out.println(decodeMessage("eljuxhpwnyrdgtqkviszcfmabo", "zwx hnfx lqantp mnoeius ycgk vcnjrdb"));
	}
	
	public String decodeMessage1(String key, String message) {
		 key=key.replaceAll(" ", "");
		 String output="";
		 char ch='a';
		 HashMap<Character, Character> myMap=new HashMap<Character, Character>();
		 for(int i=0;i<key.length();i++) {
			 if(!myMap.containsKey(key.charAt(i))) {
				 myMap.put(key.charAt(i),ch++);
			 }
		 }
	     System.out.println(myMap);
	     for(int i=0;i<message.length();i++) {
	    	if(myMap.containsKey(message.charAt(i))) {
	    		output=output+myMap.get(message.charAt(i));
	    	}else {
	    		output=output+message.charAt(i);
	    	}
	     }
		 return output;
	    }
	 
	 public String decodeMessage(String key, String message) {
		 key=key.replaceAll(" ", "");
		 String output="";
		 String temp="";
		 char ch=' ';
		 char c='a';
		 int index=0;
		 for(int i=0;i<key.length();i++) {
			if(!temp.contains(String.valueOf(key.charAt(i)))){
				temp=temp+key.charAt(i);
			}
		 }
		 System.out.println(temp);
		 for(int i=0;i<message.length();i++) {
			 ch=message.charAt(i);
			 if(temp.contains(String.valueOf(message.charAt(i)))) {
				 index=temp.indexOf(ch)+97;
				 c=(char)index;
				 output=output+c;
				} else { 
					output=output+message.charAt(i); 
					}
					 
		 }
		 
		 return output;
		 
	 }
	 
}
