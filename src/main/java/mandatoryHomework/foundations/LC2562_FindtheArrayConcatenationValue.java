/**
 * 
 */
package mandatoryHomework.foundations;

import org.junit.Test;

/**
 * 21-Sep-2023
 * https://leetcode.com/problems/find-the-array-concatenation-value/description/
 * 
 * 
 * DataSet:
 * Input: nums = [7,52,2,4]
 * Output: 596
 * 
 * Input: nums = [5,14,13,8,12]
 * Output: 673
 * 
 * 
 * 
 */
public class LC2562_FindtheArrayConcatenationValue {
	@Test
	public void test() {
		System.out.println(findTheArrayConcVal(new int[] {7,52,2,4}));
	}
	
	@Test
	public void test1() {
		System.out.println(findTheArrayConcVal(new int[] {5,14,13,8,12}));
	}
	
	@Test
	public void test2() {
		System.out.println(findTheArrayConcVal(new int[] {523}));
	}
	
	 public long findTheArrayConcVal(int[] nums) {
	        int pointer1=0,pointer2=nums.length-1,len=0;
	        long concatenation=0;
	        String sum="";
	        if(nums.length==1) {
	        	concatenation=nums[0];
	        	return concatenation;
	        }
	        while(pointer1>=0 && pointer2>=pointer1) {
	        	if(pointer1==pointer2) {
	        		concatenation=concatenation+nums[pointer1];
	        		break;
	        	}else {
	        		sum=String.valueOf(nums[pointer1])+String.valueOf(nums[pointer2]);
	        		concatenation=concatenation+Long.parseLong(sum);
	        		pointer1++;
	        		pointer2--;
	        	}
	        	
	        }
	        return concatenation;
	        }
	 }
