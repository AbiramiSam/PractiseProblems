/**
 * 
 */
package stackQueuePractise.problems;

import java.util.Iterator;
import java.util.Stack;

import org.junit.Test;

/**
 * https://leetcode.com/problems/baseball-game/
 * 
 * DataSet:
 * Input: ops = ["5","2","C","D","+"]
 * Output: 30
 * 
 * Input: ops = ["5","-2","4","C","D","9","+","+"]
 * Output: 27
 * 
 * Input: ops = ["1","C"]
 * Output: 0
 * 
 * Pseudocode:
 * Declare stack of character
 * Declare integer sum
 * iterate the array
 * add the element of the stack
 * if i is greater than 0
 *  if i is D double the i-1 
 *  if i is C remove the i-1 element
 *  if i is + add previous two elements
 *  add it to sum
 *return sum
 * 
 * 
 * 
 * 
 */
public class LC682_BaseballGame {
	@Test
	public void test() {
		System.out.println(calPoints(new String[] {"5","2","C","D","+"}));
	}
	
	@Test
	public void test1() {
		System.out.println(calPoints(new String[] {"5","-2","4","C","D","9","+","+"}));
	}
	
	@Test
	public void test2() {
		System.out.println(calPoints(new String[] {"1","C"}));
	}
	
	 public int calPoints(String[] operations) {
	        Stack<Integer> stack=new Stack<Integer>();
	        int sum=0,temp=0,temp2=0;
	        for(int i=0;i<operations.length;i++){
	            if(operations[i].equals("C"))
	            	stack.pop();
	            else if(operations[i].equals("D")) {
	            	temp=stack.pop();
	            	stack.push(temp);
	            	stack.push(temp+temp);
	            }
	            else if(operations[i].equals("+")) {
	            	temp=stack.pop();
	            	temp2=stack.pop();
	            	stack.push(temp2);
	            	stack.push(temp);
	            	stack.push(temp+temp2);
	            }
	            else {
	            	stack.push(Integer.parseInt(operations[i]));
	            }
	        }
	        while(!stack.isEmpty()) {
	        	sum+=stack.pop();
	        }
	        return sum;
	    }

}
