/**
 * 
 */
package mandatoryHomework.foundations;

import org.junit.Test;

/**
 * 
 * 
 * 
 * 
 * DataSet:
 * Input: calories = [1,2,3,4,5], k = 1, lower = 3, upper = 3
 * Output: 0
 * Explanation: Since k = 1, we consider each element of the array separately and compare it to lower and upper.
calories[0] and calories[1] are less than lower so 2 points are lost.
calories[3] and calories[4] are greater than upper so 2 points are gained.
 * 
 * Input: calories = [3,2], k = 2, lower = 0, upper = 1
 * Output: 1
 * Explanation: Since k = 2, we consider subarrays of length 2.
calories[0] + calories[1] > upper so 1 point is gained.
 * 
 * Input: calories = [6,5,0,0], k = 2, lower = 1, upper = 5
 * Output: 0
 * calories[0] + calories[1] > upper so 1 point is gained.
lower <= calories[1] + calories[2] <= upper so no change in points.
calories[2] + calories[3] < lower so 1 point is lost.
 * 
 * Input: calories = [120,130,150,110,80,90,100], k = 3, lower = 110, upper = 150
 * Output: 0
 * 
 * {7,7,0},3,15,15
 * 
 * Input : {0,0,0,0,0} k=1 lower=0 upper=0 output =0
 * Pseudocode:
 * Declare integer variable perf, ltotal, utotal;
 * Iterate the array
 * 	if k if 1
 * 	
 * 	for k value add the array elements accordingly
 * 	check if the value is less than lower
 * 	ltotal=ltotal+1;
 * 	check if the value is greater than upper
 * 	ptotal=ptotal+1;
 * perf=ptotal-ltotal;
 * return perf;
 * 
 * 
 * 
 */
public class LC1176_DietPlanPerformance {
	@Test
	public void test() {
		System.out.println(calculateCaloriePoint(new int[] {6,5,0,0}, 2, 1, 5));
	}
	
	@Test
	public void test1() {
		System.out.println(calculateCaloriePoint(new int[] {1,2,3,4,5}, 1, 3, 3));
	}
	
	
	@Test
	public void test2() {
		System.out.println(calculateCaloriePoint(new int[] {3,2}, 2, 0, 1));
	}
	
	@Test
	public void test3() {
		System.out.println(findMaxAverage(new int[] {1,12,-5,-6,50,3}, 4));
	}
	
	public int calculateCaloriePoint(int[] calories,int k, int lower,int upper) {
		int perf=0,ltotal=0,utotal=0,len=0,temp=0,val=0;
		len=calories.length-k;
		for(int i=0;i<=len;i++) {
			if(k==1) {
				temp=calories[i];
			}
			else {
				for(int j=i+1;j<i+k;j++) {
					val=val+calories[j];
				}
				
				temp=val;
			}
			if(temp<lower)
				ltotal=ltotal+1;
			if(temp>upper) 
				utotal=utotal+1;
		}
		perf=utotal-ltotal;
		return perf;
	}
	
	
	public double findMaxAverage(int[] nums, int k) {
        double max = Integer.MIN_VALUE;
        for(int i = 0; i <= nums.length-k; i++){
            double sum = nums[i];
            for(int j = i+1; j < i+k; j++){
                sum = sum + nums[j];
            }
            double avg = sum/k;
            if(avg > max ){
                max = avg;
            }
        }
        return max;
    }
}
