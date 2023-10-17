/**
 * 
 */
package stackQueuePractise.problems;

import org.junit.Test;

/**
 * https://leetcode.com/problems/remove-outermost-parentheses/
 * 17-Oct-2023
 * 
 * DataSet:
 * Input: s = "(()())(())"
 * Output: "()()()"
 * 
 * Input: s = "(()())(())(()(()))"
 * Output: "()()()()(())"
 * 
 * Input: s = "()()"
 * Output: ""
 * 
 * Pseudocode:
 * Declare integer opencount as zero and closeCount as zero
 * Declare string temp
 * Declare a string builder sb
 * iterate the input
 *  if the character is ( increment opencount and add it to string
 *  if the character is ) increment the closecount and add it to string
 *  if opencount is equal to cloasecount 
 *  	add the substring of temp to sb
 * return sb.tostring
 * 
 * 
 */
public class LC1021_RemoveOutermostParentheses {
	@Test
	public void test() {
		System.out.println(removeOuterParentheses("()()"));
	}
	
	 public String removeOuterParentheses(String s) {
		 int openCount=0,closeCount=0;
		 String temp="";
		 StringBuilder sb=new StringBuilder();
		 if(s.length()>1) {
			 for(int i=0;i<s.length();i++) {
				 temp=temp+s.charAt(i);
				 if(s.charAt(i)=='(') openCount++;
				 else closeCount++;
				 if(openCount==closeCount) {
					 sb.append(temp.substring(1, temp.length()-1));
					 temp="";
				 }
				
			 }
		 }
	      return sb.toString();  
	    }

}
