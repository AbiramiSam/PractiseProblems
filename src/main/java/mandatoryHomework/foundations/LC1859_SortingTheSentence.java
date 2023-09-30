/**
 * 
 */
package mandatoryHomework.foundations;

import org.junit.Test;

/**
 * 
 * https://leetcode.com/problems/sorting-the-sentence/
 * 
 * DataSet:
 * Input: s = "is2 sentence4 This1 a3"
 * Output: "This is a sentence"
 * 
 * Input: s = "Myself2 Me1 I4 and3"
 * Output: "Me Myself and I"
 * 
 * Pseudocode:
 * split the words in the sentence and add it to array of strings
 * 
 * 
 * 
 * 
 */
public class LC1859_SortingTheSentence {
	@Test
	public void test() {
		System.out.println(sortSentence("is2 sentence4 This1 a3"));
	}
	
	public String sortSentence(String s) {
	        String[] arr=s.split(" ");
	        String[] res=new String[arr.length];
	        String output="";
	        int len=0;
	        for(int i=0;i<res.length;i++) {
	        	len=(int)(arr[i].charAt(arr[i].length()-1))-'0';
	        	res[len-1]=arr[i].substring(0,arr[i].length()-1);
	        }
	        for(int i=0;i<res.length;i++) {
	        	output=output+res[i]+" ";
	        }
	        return output.trim();
	    }
	
	

}
