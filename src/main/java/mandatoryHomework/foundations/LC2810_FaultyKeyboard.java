/**
 * 
 */
package mandatoryHomework.foundations;

import org.junit.Test;

/**
 * 11-Sep-2023
 * https://leetcode.com/problems/faulty-keyboard/
 * 
 * DataSet:
 *Input: s = "string"
 *Output: "rtsng"
 *
 *Input: s = "poiinter"
 *Output: "ponter"
 *
 *
 *Input:
 *
 *Pseudocode:
 *Declare an output string, sb string builder
 *iterate the input string
 *if the character is i then reverse the string
 *else append the char of the string to sb
 *convert the sb to string and return the output
 * 
 */
public class LC2810_FaultyKeyboard {
	@Test
	public void test() {
		System.out.println(finalString("string"));
	}
	
	@Test
	public void test1() {
		System.out.println(finalString("poiinter"));
	}
	
	public String finalString(String s) {
		String output="";
		StringBuilder sb=new StringBuilder();
		//StringBuilder temp2=new StringBuilder();
		for(int i=0;i<s.length();i++) {
			
			if(s.charAt(i)=='i') {
				sb.reverse();
			}else {
				sb.append(s.charAt(i));
			}
		}
		
	        output=sb.toString();
	        return output;
	    }

	
	public String finalString1(String s) {
		String output="",temp="",temp1="";
		int count=0;
		StringBuilder sb=new StringBuilder();
		//StringBuilder temp1=new StringBuilder();
		for(int i=0;i<s.length();i++) {
			//temp=""+s.charAt(i);
			if(s.charAt(i)=='i') {
				count=i;
				for(int j=i-1;j>=0;j--) {
					if(s.charAt(j)!='i') {
						temp=temp+s.charAt(j);
					}else {
						continue;
					}
				}
				if(temp.length()==count) {
					s.replace(s.substring(0, count), temp);
				}
			} 
			if(count!=0 && s.charAt(i)!='i') {
				temp1=temp1+s.charAt(i);
			}
		}
		
	        output=temp+temp1;
	        return output;
	    }
	
}
