/**
 * 
 */
package mandatoryHomework.foundations;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

/**
 * https://leetcode.com/problems/check-if-the-sentence-is-pangram/
 * 
 * A pangram is a sentence where every letter of the English alphabet appears at least once.
 * Given a string sentence containing only lowercase English letters, return true if sentence
 * is a pangram, or false otherwise.
 * 
 * Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
 * Output: true
 * 
 * Input: sentence = "leetcode"
 * Output: false
 * 
 * Input: sentence = "thequickbrownfoxjumpsoverthelazydogdog"
 * Output: false
 * 
 * Pseudocode:
 * Declare an integer variable count=0, ascii=0;
 * iterate the string to its length
 * convert each character to its ASCII value and increase the counter for each character
 * check if the value is between 97 to 122 and the count==1
 * return true
 * else return false
 * 
 * 
 * 
 * 
 * 
 */
public class LC1832_CheckIfSentenceIsPangram {
		@Test
		public void test() {
			System.out.println(checkIfPangram("thequickbrownfoxjumpsoverthelazydog"));
		}
		
		@Test
		public void test1() {
			System.out.println(checkIfPangram("leetcode"));
		}
		
		@Test
		public void test2() {
			System.out.println(checkIfPangram("thequickbrownfoxjumpsoverthelazydogdog"));
		}
		//x is not present
		@Test
		public void test3() {
			System.out.println(checkIfPangram("thequickbrownfojumpsoverthelazydogdog"));
		}
		
		public boolean checkIfPangram(String sentence) {
			int[] alphabets = new int[26];       

	        for(int i=0; i<sentence.length(); i++){
	            alphabets[sentence.charAt(i) - 'a'] = 
							alphabets[sentence.charAt(i) - 'a'] + 1;
	        }
	        for(int i=0; i<alphabets.length; i++){
	            if(alphabets[i]==0)
	                return false;
	        }
					
	        return true;
		    }
		
		public boolean checkIfPangram1(String sentence) {
		       Set<Character> senSet=new HashSet<Character>();
		       
		       for(int i=0;i<sentence.length();i++) {
		    	   senSet.add(sentence.charAt(i));
		       }
		       
		       if(senSet.size()>=26)
		    	   return true;
		       else
		       return false;
		      
		    }
		
			/*
			 * public boolean checkIfPangram2(String sentence) {
			 * 
			 * int sentlengremdup = sentence.replaceAll("(.)(?=.*\\1)", "").length();
			 * if(sentlengremdup==26){ return true; }else{ return false; }   }
			 */

}
