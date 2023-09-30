/**
 * 
 */
package mandatoryHomework.foundations;

import org.junit.Test;

/**
 * 29-Aug-2023
 * https://leetcode.com/problems/merge-strings-alternately/
 * 
 * Input:
 * Input: word1 = "abc", word2 = "pqr"
 * output: "apbqcr"
 * 
 * Input: word1 = "ab", word2 = "pqrs"
 * Output: "apbqrs"
 * 
 * Input: word1 = "abcd", word2 = "pq"
 * Output: "apbqcd"
 * 
 * 
 * Pseudocode:
 * Declare int length1,length2, String sub, result;
 * Store greater length value in the len variable
 * Iterate the loop and append the value alternatively.
 * result=result+word1.charAt(i)+word2.charAt(i);
 * 
 * append the balance text in the result
 * return result 
 * 
 * 
 */
public class LC1768_MergerStringsAlternately {
	
	@Test
	public void test() {
		System.out.println(mergeAlternately("abcd", "pqrs"));
	}
	
	@Test
	public void test1() {
		System.out.println(mergeAlternately("ab", "pqrs"));
	}
	
	  public String mergeAlternately(String word1, String word2) {
		  
		  int len=0;
		  String result="";
		  if(word1.length()>word2.length()) {
			  len=word2.length();
		  }else {
			  len=word1.length();
		  }
	      for(int i=0;i<len;i++) {
	    	  result=result+word1.charAt(i)+word2.charAt(i);
	      }
	      if(word1.length()>word2.length()) {
	    	  result=result+word1.substring(len,word1.length());
	      }
	      else if(word2.length()>word1.length()) {
	    	  result=result+word2.substring(len,word2.length());
	      }
	      return result;
	    }
	

}
