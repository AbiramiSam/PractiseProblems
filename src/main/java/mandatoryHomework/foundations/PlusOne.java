/**
 * 
 */
package mandatoryHomework.foundations;

import java.util.Arrays;

import org.junit.Test;

/**
 * @author abiramisa
 * You are given a large integer represented as an integer array
 * input - integer array - {1,2,3}
 * output - integer array - {1,2,4}
 * 
 * pseudocode:
 * convert the array to integer
 * add 1 to the integer
 * split the digits in the integer and convert to array
 * return the array
 */
public class PlusOne {
	
	 @Test
	  public void testSample1() {
	  
	  //System.out.println(plusOne(new int[] {1,2,3})); 
	  int[] result=plusOne(new int[] {1,9,9});
	  for(int i=0;i<result.length;i++) {
		  System.out.println(result[i]);
	  }
	  
	  }
	 
	
	
	public static void plusOnenum(String[] args) {
		int[] arr={1,2,3};
		int[] arr1= {};
		String num=""; 
		int value=0;
		//String value=num.toString();
		
		
		 for (int i = 0; i < arr.length; i++) {
	            num=num+arr[i];
	        }
		 System.out.println(num);
		 value=Integer.parseInt(num)+1;
		 System.out.println("Value is"+value);
		 num=String.valueOf(value);
		 
		 for(int i=0;i<num.length();i++) {
			 
			 
			 
		 }
		
	}
	
	
	public int[] plusOne(int[] input) {
		
		for(int i=input.length-1;i>=0;i--) {
			if(input[i]<9) {
				input[i]=input[i]+1;
				return input;
			}
			input[i]=0;
		}
		
		int[] output = new int[input.length+1]; // 0,0 for 9
		output[0]=1;	//1,0 9 becomes 10
		return output;
	}

}
