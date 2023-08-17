/**
 * 
 */
package mandatoryHomework.foundations;

import java.util.Arrays;

import org.junit.Test;

/**
 * 10-Aug-2023
 * https://leetcode.com/problems/check-if-it-is-a-straight-line
 * 
 * 
 * Input: 2D Array
 * Output: Boolean
 * 
 * I/p: 
 * Positive:
 * {{1,2},{2,3},{3,4},{4.5},{5,6},{6,7}}
 * 
 * Negative:
 * {{1,1},{2,2},{3,4},{4.5},{5,6},{7,7}}
 * 
 * 
 * Approach:
 * Approch 1:Brute Force
 * 
 * Pseudocode:
 * Declare integer variable rowDiff and colDiff and temp
 * Iterate through the row element of the array
 *  Iterate through the column element of the array 
 *  	If difference between the each row element is equal 
 *  	And If difference between the each column element is equal
 *  	Return true;
 *  Else Return false;
 *  
 * 
 * 
 * 
 */
public class CheckIfItIsStraightLine {
	@Test
	public void test() {
		System.out.println(findIfItIsStraightLine(new int[][] {{1,2},{2,3},{3,4},{4,5},{5,6},{6,7}}));
	}
	
	public boolean findIfItIsStraightLine(int[][] input) {
		int rowDiff=Math.abs(input[0][0]-input[1][0]);
		int colDiff=Math.abs(input[0][0]-input[0][1]);
		int len=input.length*2;
		int[] tempArray=new int[len];
		int temp=0;
		int a=0;
		int b=0;
		boolean rowB=false;	
		boolean colB=false;
		for(int i=0;i<input.length;i++) {
			for(int j=0;j<2;j++) {
				if(temp<12) {
				tempArray[temp]=input[i][0];
				tempArray[temp++]=input[i][1];
				}
			}
		temp++;
			//System.out.println(input[i][j]);
			/*
			 * if(i==0 || i%2==0) { temp=Math.abs(input[j][i]-input[j+1][i]);
			 * System.out.println(temp); temp1=Math.abs(input[j][i]-input[j][i+1]);
			 * System.out.println(temp); if(temp!=rowDiff && temp1!=colDiff) { return false;
			 * } }
			 * 
			 * if(i==1 || i%2!=0) { temp=Math.abs(input[j][i]-input[j+1][i]);
			 * temp1=Math.abs(input[j][i]-input[j][i+1]); if(temp!=rowDiff &&
			 * temp1!=colDiff) { return false; } }
			 */	
				
			
		}
		
		System.out.println(Arrays.toString(tempArray));
		
		for(int i=0;i<tempArray.length;i++) {
			
			if(i==tempArray[tempArray.length-1]) {
				b=Math.abs(tempArray[i]-tempArray[i-2]);
				if(b!=colDiff)
					return false;
			}
			
			if(i==tempArray[tempArray.length-1]) {
				a=Math.abs(tempArray[i]-tempArray[i-2]);
				if(a!=rowDiff)
					return false;
			}
			if(i==0 || i%2==0) {
				a=Math.abs(tempArray[i]-tempArray[i+2]);
				if(a!=rowDiff)
					return false;
			}
			
			if(i==1 || i%2!=0) {
				b=Math.abs(tempArray[i]-tempArray[i+2]);
				if(b!=colDiff)
					return false;
			}
		}
		return true;
	}

}
