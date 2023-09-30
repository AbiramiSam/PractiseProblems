/**
 * 
 */
package mandatoryHomework.foundations;

import org.junit.Test;

/**
 * 01-Sep-2023
 * 
 * https://leetcode.com/problems/add-strings/
 * 
 * Given two non-negative integers, num1 and num2 represented as string, return the sum of
 * num1 and num2 as a string.
 * You must solve the problem without using any built-in library for handling large integers
 * (such as BigInteger). You must also not convert the inputs to integers directly.
 * 
 * Test Data:
 * Input: num1 = "11", num2 = "123"
 * Output: "134"
 * 
 * Input: num1 = "456", num2 = "77"
 * Output: "533"
 * 
 * Input: num1 = "0", num2 = "0"
 * Output: "0"
 * 
 * Input: num1 = "123", num2 = "999"
 * Output: "1122"
 * 
 * Input: num1 = "999", num2 = "123"
 * Output: "1122"
 * 
 * 
 * Pseudocode:
 * Declare char carry
 * Declare String variable result
 * Check the length of the String and take the length which is less in count
 * Iterate the loop
 * If the character at ith position is 9 
 * result=add the number and add 1 to the i-1 position
 * if i=0
 * result=1+result;
 * 
 */
public class LC415_AddStrings {
		@Test
		public void test() {
			System.out.println(addStrings("999","123"));
		}
		
		@Test
		public void test1() {
			System.out.println(addStrings("456","77"));
		}
		
		public String addStrings(String num1, String num2) {
			char carry= ' ';
			String result = "",temp="",output="";
			int len=0,temp1=0;
			if(num1.length()>num2.length()) {
				len=num2.length();
			}else {
				len=num1.length();
			}
			if(num1.length()==num2.length()) {
				len=num1.length();
			}
		        for(int i=len-1;i>0;i--) {
		        	if(temp.length()>1) {
		        		temp=String.valueOf(1)+String.valueOf(num1.charAt(i)-'0')+String.valueOf(num2.charAt(i)-'0');
		        	}else {
		        		temp=String.valueOf(num1.charAt(i)-'0')+String.valueOf(num2.charAt(i)-'0');
		        	}
		        	result=result+temp;
		        }
		        if(num1.length()>num2.length()) {
		        	if(result.length()>len) {
		        		temp=String.valueOf(result.charAt(0)-'0')+String.valueOf(num1.substring(0,num1.length()-len));
		        		output=temp+result;
		        	}
		        	else
		        		output=output+result;
		        }
		        else if(num2.length()>num1.length()) {
		        	if(result.length()>len) {
		        		temp=String.valueOf(result.charAt(0)-'0')+String.valueOf(num2.substring(0,num1.length()-len));
		        		output=temp+result;
		        	}
		        	else
		        		output=output+result;
		        }else {
		        	output=result;
		        }
		        	
		        return output;
		    }

		
		public String addStrings1(String num1, String num2) {
			int temp=0;
			String result = "";
			int len=0,temp1=0;
			if(num1.length()>num2.length()) {
				len=num2.length();
			}else {
				len=num1.length();
			}
			if(num1.length()==num2.length()) {
				len=num1.length();
			}
			
			return null;
		}
		
}
