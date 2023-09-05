/**
 * 
 */
package mandatoryHomework.foundations;

import java.util.Arrays;

import org.junit.Test;

/**
 * https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/
 * 
 * 25-Aug-2023
 * Optional - Vel
 * 
 * input: Array of String
 * ouput: int
 * 
 * we have to return maximum the count of the words in a string
 * 
 * test data:
 * input: ["alice and bob love leetcode", "i think so too", "this is great thanks very much"]
 * ouput: 6
 * 
 * input: ["please wait", "continue to fight", "continue to win"]
 * output: 3
 * 
 * 
 * Pseudocode:
 * Declare integer variable count,temp and an integer array to store the number of words in each sentence
 * Iterate the array from 0 to length of the array
 * 		if(String.charAt[i]==' ')
 * 			count++
 * 
 *  	arr[i]=count;
 *  
 * Iterate the integer array to find the maximum and return it
 * 
 * 
 */
public class LC2114_NumberOfWords {
	
		@Test
		public void test() {
			System.out.println(mostWordsFound(new String[] {"alice and bob love leetcode", "this is great thanks very much"}));
		}
	
		@Test
		public void test1() {
			System.out.println(mostWordsFound(new String[] {"please wait", "continue to fight", "continue to win"}));
		}
	
		public int mostWordsFound(String[] sentences) {
		        int count=0;
		        int[] numArray=new int[sentences.length];
		        for(int i=0;i<sentences.length;i++) {
		        	if(sentences[i]!=null) {
		        	String[] s=sentences[i].split(" ");
		        	count=s.length;
		        }
		        	numArray[i]=count;
		        }
		
		        Arrays.sort(numArray);
		        return numArray[numArray.length-1];
		    }

}
