/**
 * 
 */
package stackQueuePractise.problems;

import java.util.Stack;

import org.junit.Test;

/**
 * https://leetcode.com/problems/backspace-string-compare/
 * 17-Oct-2023
 * 
 * DataSet:
 * Input: s = "ab#c", t = "ad#c"
 * Output: true
 * 
 * Input: s = "ab##", t = "c#d#"
 * Output: true
 * 
 * Input: s = "a#c", t = "b"
 * Output: false
 * 
 * 
 * PSeudocode:
 * Declare Stack of character for string s and stack of character for string t
 * iterate the elements of the string s
 * push each element to stack
 * if the ith element is # then stack.pop
 * repeat the same for string t
 * declare two string builder variables
 * while stack is not empty pop the element and append it to string and reverse the string
 * while stack t is not empty pop the element and append it to string and reverse the string
 * compare the string
 * if the string is equal return true
 * return false; 
 * 
 * 
 */
public class LC844_BackspaceStringCompare {
	@Test
	public void test() {
		System.out.println(backspaceCompare("ab#c", "ad#c"));
	}
	
	 public boolean backspaceCompare(String s, String t) {
	        Stack<Character> stackS=new Stack<Character>();
	        Stack<Character> stackT=new Stack<Character>();
	        StringBuilder sb=new StringBuilder();
	        StringBuilder sb1=new StringBuilder();
	        for(int i=0;i<s.length();i++){
	            if(s.charAt(i)=='#' && !stackS.isEmpty())
	                stackS.pop();
	            else if(s.charAt(i)!='#')
	                stackS.push(s.charAt(i));
	        }
	        for(int i=0;i<t.length();i++){
	            if(t.charAt(i)=='#' && !stackT.isEmpty())
	                stackT.pop();
	            else if(t.charAt(i)!='#')
	                stackT.push(t.charAt(i));
	        }        
	        while(!stackS.isEmpty()){
	            sb.append(stackS.pop());
	        }
	        while(!stackT.isEmpty()){
	            sb1.append(stackT.pop());
	        }
	        sb=sb.reverse();
	        System.out.println(sb);
	        sb1=sb1.reverse();
	        System.out.println(sb1);
	       
	        if(sb.toString().equals(sb1.toString()))
	            return true;

	    return false;
	    }

}
