/**
 * 
 */
package mandatoryHomework.foundations;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

/**
 * 888. Fair Candy Swap
 * https://leetcode.com/problems/fair-candy-swap/
 * 
 * 
 * Pseudocode:
 * Declare sumAlice and bobAlice
 * iterate through the loop and add the sum two arrays separately
 * find diff between sumAlice and bobAlice and find the average
 * iterate through the arrays
 * find the diff between the arrayAlice[i]-average
 * if the elements of the bobarray is equal to the diff return the elements
 * 
 * Time Complexity: O(N2)
 * 
 * 
 */
public class LC888_FairCandySwap {
	@Test
	public void test() {
		String value=Arrays.toString(fairCandySwap(new int[] {1,2}, new int[] {2,3}));
		System.out.println(value);
	}
	
	public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sumAlice=0,sumBob=0;
        for(int i=0;i<aliceSizes.length;i++) {
        	sumAlice+=aliceSizes[i];
        }
        for(int j=0;j<bobSizes.length;j++) {
        	sumBob+=bobSizes[j];
        }
        int diff=(sumAlice-sumBob)/2;
        for(int i=0;i<aliceSizes.length;i++) {
        	int temp=aliceSizes[i]-diff;
        	for(int j=0;j<bobSizes.length;j++) {
        		if(bobSizes[j]==temp) {
        			return new int[] {aliceSizes[i],bobSizes[j]};
        		}
        		
        	}
        }
       return new int[] {}; 
 }
	
	 public int[] fairCandySwap1(int[] aliceSizes, int[] bobSizes) {
	        int pointer1=0,pointer2=0,sumAlice=0,temp=0,sumBob=0;
	        while(pointer1<aliceSizes.length || pointer2<bobSizes.length) {
	        	temp=aliceSizes[pointer1];
	        	aliceSizes[pointer1]=bobSizes[pointer2];
	        	bobSizes[pointer2]=temp;
	        	int i=pointer1++,j=pointer2++;
	        	sumAlice+=aliceSizes[pointer1];
	        	while(i<aliceSizes.length) {
	        		sumAlice+=aliceSizes[i++];
	        	}
	        	sumBob+=bobSizes[pointer2];
	        	while(j<bobSizes.length) {
	        		sumBob+=bobSizes[j++];
	        	}
	        	if(sumAlice==sumBob)
	        		return new int[] {pointer1,pointer2};
	        	else {
	        		pointer1++;
	        		pointer2++;
	        	}
	        }
	       return new int[] {-1,-1}; 
	 }

	 
	 
}
