/**
 * 
 */
package mandatoryHomework.foundations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;

/**
 * @author abiramisa
 * Homework
 * 
 * https://leetcode.com/problems/intersection-of-two-arrays/description/
 * Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be unique and you may return 
 * the result in any order.
 * 
 * Input: nums1 = [1,2,2,1], nums2 = [2,2]
 * Output: [2]
 * 
 * Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * Output: [9,4]
 * Explanation: [4,9] is also accepted.
 * 
 *
 */
public class IntersectionOfTwoArrays {
	@Test
	public void test() {
		int[] res=findIntersection(new int[] {1,2,2,1}, new int[] {2,2});
		System.out.println(Arrays.toString(res));
	}
	
	@Test
	public void test1() {
		int[] res=findIntersection(new int[] {4,9,5}, new int[] {9,4,9,8,4});
		System.out.println(Arrays.toString(res));
	}
	
	
	public int[] findIntersection(int[] num1,int[] num2) {
		int temp=0;
		int n=0;
		//List<Integer> numList=new ArrayList<Integer>(); 
		Set<Integer> numSet=new HashSet<Integer>();
		for(int i=0;i<num1.length;i++) {
			for(int j=0;j<num2.length;j++) {
				if(temp!=num1[i] && temp!=num2[j]) {
				if(num1[i]==num2[j]) {
					numSet.add(num1[i]);
					temp=num1[i];
					}
				}
			}
		}
		System.out.println(numSet);
		int[] res=new int[numSet.size()];
		for (int ele : numSet) {
			res[n++]=ele;
		}
		return res;
	}
}
