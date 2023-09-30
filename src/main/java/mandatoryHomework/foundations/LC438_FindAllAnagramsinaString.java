/**
 * 
 */
package mandatoryHomework.foundations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

/**
 * 28-Sep-2023
 * https://leetcode.com/problems/find-all-anagrams-in-a-string/description/
 * 
 * 
 * DataSet:
 * Input: String, String
 * Output: array of integers
 * 
 * 
 * Input: s = "cbaebabacd", p = "abc"
 * Output: [0,6]
 * 
 * Input: s = "abab", p = "ab"
 * Output: [0,1,2]
 * 
 * Pseudocode:
 * Declare integer pointer1, pointer2
 * Declare list of integer, character array
 * Create a sliding window of size p
 * add the elements of s to the window
 * sort it and convert it to string
 * check if the converted string is equal to p
 * if the element matches add the pointer to the integer array
 * return the integer array
 * 
 * 
 */
public class LC438_FindAllAnagramsinaString {
	@Test
	public void test() {
		System.out.println(findAnagrams("cbaebabacd", "abc"));
	}
	
	public List<Integer> findAnagrams(String s, String p) {
		int sArr[] = new int[26];
		int pArr[] = new int[26];
		List<Integer> list = new ArrayList<>();
		    
		    if(s.length()<p.length())
		        return list;
		    
		    for(int i=0; i<p.length(); i++){
		    	sArr[s.charAt(i)-'a']++; //2--1--0
		    	pArr[p.charAt(i)-'a']++; //0--1--2
		    }
		 
		    int start=0;
		    int end=p.length();
		    
		    if(Arrays.equals(sArr,pArr))
		        list.add(start);
		    
		    while(end<s.length()){
		        
		        sArr[s.charAt(start)-'a']--;
		        sArr[s.charAt(end)-'a']++;
		        
		        if(Arrays.equals(sArr,pArr))
		        list.add(start+1);
		        
		        start++;
		        end++;
		    }
		  return list;  
    }
	
	 public List<Integer> findAnagrams1(String s, String p) {
	        int pointer1=0, pointer2=0;
	        List<Integer> outputList=new ArrayList<Integer>();
	        char[] arr=new char[p.length()];
	        String temp="";
	        while(pointer1<p.length()) {
	        	arr[pointer1]=s.charAt(pointer1);
	        	pointer1++;
	        }
	        	while(pointer1<s.length()) {
	        		if(arr.length==p.length()) {
	        			Arrays.sort(arr);
	        			temp=String.valueOf(arr);
	        			if(temp.equals(p))
	        				outputList.add(pointer1-3);
	        		}
	        		pointer1++;
	        	}
	       return outputList;
	    }
	 
	 

}
