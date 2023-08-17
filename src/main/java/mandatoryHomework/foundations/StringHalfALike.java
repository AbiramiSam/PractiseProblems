/**
 * 
 */
package mandatoryHomework.foundations;

import org.junit.Test;

/**
 * @author abiramisa
 * 
 * https://leetcode.com/problems/determine-if-string-halves-are-alike/description/
 * 
 * 
 * You are given a string s of even length. Split this string into two halves of equal lengths, 
 * and let a be the first half and b be the second half.
 * Two strings are alike if they have the same number of vowels
 *  ('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U').
 *  Notice that s contains uppercase and lowercase letters.
 *  Return true if a and b are alike. Otherwise, return false.
 *  Input: s = "book"
Output: true
Explanation: a = "bo" and b = "ok". a has 1 vowel and b has 1 vowel. Therefore, they are alike.
 *
 *Pseudocode:
 * 1.Get the input string and get the length and divide by 2
     * 2.splitting the string using substring method
     * 3.char array to store the vowels
     * 4.for loop to iterate the splitter string character
     * 5. A nested for loop to compare the string value with vowel array
     * 6. if the value of char array and vowel matches 
     *    Increase the count
     * 7.for loop to iterate the splitter string character
     * 8. A nested for loop to compare the string value with vowel array
     * 9. if the value of char array and vowel matches 
     *    Increase the count
      10. return true if the count is equal
 *
 */

public class StringHalfALike {
	@Test
	public void test() {
		System.out.println(findStringHalfALike("book"));
	}
	
	
	public boolean findStringHalfALike(String input) {
		
		
		String firstHalf=input.substring(0, input.length()/2);
		String secondHalf=input.substring(input.length()/2, input.length());
		if(compareStringWithVowe(firstHalf)==compareStringWithVowe(secondHalf)) {
			return true;
		}
		
		return false;
		
		
	}
	
	public int compareStringWithVowe(String s) {
		int count=0;
		String vowels="aeiouAEIOU";
		for(int i=0;i<s.length();i++) {
			for(int j=0;j<vowels.length();j++)
			if(s.charAt(i)==vowels.charAt(j)) {
				count++;
			}
		}
		
		return count;
		
	}

}
