/**
 * 
 */
package mandatoryHomework.foundations;

import org.junit.Test;

/**
 * https://leetcode.com/problems/can-place-flowers/
 * 
 * You have a long flowerbed in which some of the plots are planted, and some are not.
 * However, flowers cannot be planted in adjacent plots.
 * Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1
 * means not empty, and an integer n, return true if n new flowers can be planted in the
 * flowerbed without violating the no-adjacent-flowers rule and false otherwise.
 * 
 * 
 * Input: Array of integer, integer
 * Output: Boolean
 * 
 * Pseudocode:
 * 100010001000100010001000100011010010001
 * Declare an integer count and temp
 * Iterate the array from i=0 to length of the array
 * 	Initialize temp =0;
 * 	If(array[i]==0)
 *		temp=temp++;
 *  If(temp==3)
 *  	count=count++;
 *  If(count==n)
 *  	return true; 
 *  return false;
 * 			
 * 
 * 
 * 
 * 
 * 
 * 
 */
public class FlowerBedArray {
	
	
	  @Test 
	  public void test() { 
		  System.out.println(findFlowerBedArray(new	  int[]{1,0,0,0,1}, 1)); 
		  }
	 
	 
	
	@Test
	public void test1() {
		System.out.println(findFlowerBedArray(new int[] {1,0,0,0,1}, 2));
	}
	
	@Test
	public void test2() {
		System.out.println(findFlowerBedArray(new int[] {1,0}, 1));
	}
	
	@Test
	public void test3() {
		System.out.println(findFlowerBedArray(new int[] {0,1,0}, 1));
	}
	
	public boolean findFlowerBedArray(int[] flowerbed,int n){
		int count=0;
		boolean plant=false;
		
		if(n==0) {
			return true;
		}
		
		if(flowerbed.length==1) {
			if(flowerbed[0]==0 && n==1)
				return true;
			else
				return false;
		}
		
		for(int i=0;i<flowerbed.length;i++) {
			//checking for first element in the array
			if(i==0 || i==flowerbed.length-1) {
			if(i==0) {
				if(flowerbed[i]==0 && flowerbed[i+1]==0) {
					flowerbed[i]=1;
					count=count+1;
					i++;
				}
			}
			
			if(i==flowerbed.length-1) { //checking for last element in the array
				if(flowerbed[i]==0 && flowerbed[i-1]==0) {
					flowerbed[i]=1;
					count=count+1;
					break;
				}
			}
			}
			else {
			//positive scenario where left and right position is 0
			 if(flowerbed[i]==0) {
				if(flowerbed[i-1]==0 && flowerbed[i+1]==0) {
					flowerbed[i]=1;
					count=count+1;
					i++;
				}
			}
			}
			System.out.println(count);
		}
		
		if(count>=n)
			plant=true;
		else
			plant=false;
		
		return plant;
	}
}
