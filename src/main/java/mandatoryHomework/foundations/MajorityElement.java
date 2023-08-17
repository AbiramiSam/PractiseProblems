/**
 * 
 */
package mandatoryHomework.foundations;

/**
 * @author abiramisa
 * Given an array nums of size n, return the majority element.
 * The majority element is the element that appears more than n/2 times.
 * You may assume that the majority element always exists in the array.
 */
public class MajorityElement {
	
	public static void main(String[] args) {
		
		int[] nums= {2,2,1,1,1,2,2};
		int length=nums.length/2;
		int count=0;
		int num=0;
		for(int i=0;i<nums.length;i++) {
			for(int j=i+1;j<nums.length;j++) {
				if(nums[i]==nums[j]) {
					count=count+1;
				}
			}
			num=nums[i];
		}
		if(count>=length) {
			System.out.println(num);
		}
	}
	
	
}
