/**
 * 
 */
package mandatoryHomework.foundations;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

/**
 * 21-Sep-2023
 * https://leetcode.com/problems/longest-nice-substring/description/
 * 
 * Input: s = "YazaAay"
 * Output: "aAa"
 * 
 * Input: s = "Bb"
 * Output: "Bb"
 * 
 * Input: s = "c"
 * Output: ""
 * 
 * Input: s="YAaAaCcbBE"
 * Output: "AaAa"
 * 
 * 
 * 
 */
public class LC1763_LongestNiceSubstring {
	@Test
	public void test() {
		System.out.println(longestNiceSubstring("YazaAay"));
	}
	
	@Test
	public void test1() {
		System.out.println(longestNiceSubstring("Bb"));
	}
	
	
	 public String longestNiceSubstring1(String s) {
	        int pointer1=0,pointer2=pointer1+1,temp=0,count=0;
	        String output="";
			/*
			 * while(pointer1<3) { temp=(int)s.charAt(pointer1++)-(int)s.charAt(pointer2++);
			 * if(temp==32) { output=output+s.charAt(pointer1++)+s.charAt(pointer2++); } }
			 * while(pointer1<s.length()) {
			 * temp=(int)s.charAt(pointer1)-(int)s.charAt(pointer2);
			 * count=(int)s.charAt(pointer1++)-(int)s.charAt(pointer2++); if(temp==count) {
			 * output=output+s.charAt(pointer1)+s.charAt(pointer2); }else if(output) }
			 */
			/*
			 * for(int i=0;i<s.length();i++) { for(int j=i+1;j<s.length();j++) {
			 * temp=(int)s.charAt(i)-(int)s.charAt(j); if(temp==32) {
			 * 
			 * } } }
			 */
	        if(s.length()==1) {
	        	return "";
	        }
	        
	        for(int i=0;i<s.length();i++) {
	        	temp=s.charAt(i++)-s.charAt(i);
	        	System.out.println(temp);
	        	if(temp==32 || temp==-32) {
	        		if(output.equals("")) {
	        		output=output+s.charAt(i)+s.charAt(i++);
	        		}else {
	        			output=output+s.charAt(i++);
	        		}
	        	}else
	        		continue;
	        }
	        return output;
	    }
	 
	 public String longestNiceSubstring(String s) { //YazaAay
		 Set<Character> charSet=new HashSet<Character>();
		 String output="";
		 if(s.length() <=1)
	            return "";
		 
		 for(int i=0;i<s.length();i++) {
			 charSet.add(s.charAt(i));
		 }
		 
		 for(int i=0;i<s.length();i++) {
			if(charSet.contains(Character.toLowerCase(s.charAt(i))) || 
					charSet.contains(Character.toUpperCase(s.charAt(i)))) {
				continue;
			}
			String sub1=longestNiceSubstring(s.substring(0,i));
			String sub2=longestNiceSubstring(s.substring(i++));
			
			if(sub1.length()>=sub2.length())
				output=sub1;
			else
				output=sub2;
		 
		 }
		 return output;
	 }
	 

}
