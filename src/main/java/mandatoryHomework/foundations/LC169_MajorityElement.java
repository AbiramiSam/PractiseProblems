/**
 * 
 */
package mandatoryHomework.foundations;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

/**
 * @author abiramisa
 * 
 * PSeudocode: * 
 *Declare a hashmap of integer and integer
 * declare integer average,count
 * add the elements to the map and its count
 * iterate the map using entryset
 * if the count is greater than average return the key
 */
public class LC169_MajorityElement {
	
	@Test
	public void test() {
		System.out.println(majorityElementAscii(new int[] {10,9,9,9,10}));
	}
	
	 public int majorityElement(int[] nums) {
		 Map<Integer,Integer> map=new HashMap<Integer, Integer>();
		 int average=nums.length/2,count=1,temp=0;
		 int output=0;
		 if(nums.length==1)
			 return nums[0];
		 for(int i=0;i<nums.length;i++) {
			 temp=nums[i];
			 if(map.containsKey(temp)) {
				 map.put(nums[i], map.get(temp)+1);
			 }else {
				 map.put(nums[i], count);
			 }
			
		 }
		 for (Map.Entry<Integer, Integer> entry: map.entrySet()) {
			if(entry.getValue()>average)
				output=entry.getKey();
		}
		 return output;
	 }
	 
	 public int majorityElementAscii(int[] nums) {
		 int[] ascii=new int[11];
		 int temp=0;
		 if(nums.length==1)
			 return nums[0];
		 for(int i=0;i<nums.length;i++) {
			 ascii[nums[i]]++;	
			
		 }
		 for(int i=0;i<ascii.length;i++) {
			 if(ascii[i]>nums.length/2)
					temp=i;
		 }

		 return temp;
	 }

	
	
}
