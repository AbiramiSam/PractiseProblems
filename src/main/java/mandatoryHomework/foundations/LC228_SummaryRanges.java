/**
 * 
 */
package mandatoryHomework.foundations;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/**
 * Date: 24-Aug-2023
 * 
 * Redo
 * 
 * input: sorted unique integer array
 * output: list of string
 * 
 * input: {0,1,2,4,5,7}
 * output: ["0->2","4->5","7"]
 * 
 * input: {0,2,3,4,6,8,9}
 * output: ["0","2->4","6","8->9"]
 * 
 * input: {-4,-2,-1,0,2,4,5,6,7,9,11}
 * output: ["-4","-2->0","2","4->7","9","11"]
 * 
 * input: {2}
 * output: []
 * 
 * input: {1,4}
 * output: ["1","4"]
 * 
 * input: {-11,-10}
 * output: ["-11->-10"]
 * 
 * Pseudocode:
 * Declare a list of String
 * Declare integer i=0 , startValue, endValue
 * If array length is 0 
 * 	return list.add("-1")
 * 
 * If array length is 1
 * 	return list.add(array[0])
 * 
 * if array length is greater than 1
 * While i less than length of nums
 * 		
 * 		startValue=nums[i];
 * 		endValue=startValue;
 * 
 * 		while(i<nums.length-1 && nums[i+1]==endValue+1
 * 			endValue=nums[i+1];
 * 			i=i+1;
 * 	
 * 		if(startValue!=endValue)
 * 			list.add(startvalue->endvalue)
 * 		
 * 		count++
 * 			
 * return list
 * 
 */
public class LC228_SummaryRanges {
	
	@Test
	public void test() {
		System.out.println(summaryRanges(new int[] {0,1,2,4,5,7}));
	}
	
	public List<String> summaryRanges(int[] nums) {
		
		List<String> outputList=new ArrayList<String>();
		int i=0;
		int startValue=0,endValue=0;
		if(nums.length==0) {
			outputList.clear();
			return outputList;
		}
		if(nums.length==1) {
			outputList.add(String.valueOf(nums[0]));
			return outputList;
		}
		
        while(i<nums.length) {
        	startValue=nums[i];
        	endValue=startValue;
        	
        	while((i<nums.length-1) && (nums[i+1]==endValue+1)) {
        		endValue=nums[i+1];
        		i=i+1;
        	}
        	
        	if(startValue==endValue) {
        		outputList.add(String.valueOf(startValue));
        	}
        	if(startValue!=endValue) {
        		outputList.add(String.valueOf(startValue+"->"+endValue));
        	}
        	i=i+1;
        }
        return outputList;
    }

}
