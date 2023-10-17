/**
 * 
 */
package stackQueuePractise.problems;

import org.junit.Test;

/**
 * https://leetcode.com/problems/time-needed-to-buy-tickets/description/
 * 17-Oct-2023
 * 
 * DataSet:
 * Input: tickets = [2,3,2], k = 2
 * Output: 6
 * 
 * Input: tickets = [5,1,1,1], k = 0
 * Output: 8
 * 
 * Pseudocode:
 * Declare an integer count as 0
 * while tickets of K is greater than 0 //the position of the kth element
 * iterate the tickets array till length
 * 	if element at position i is greater than 0
 * 		decrease the value in the ith position
 * 		increase the count
 * if element at position k is 0 break the loop
 * return count 
 * 
 * 
 */
public class LC2073_TimeNeededtoBuyTickets {
	 @Test
	 public void test() {
		 System.out.println(timeRequiredToBuy(new int[] {2,3,2}, 2));
	 }
	
	 public int timeRequiredToBuy(int[] tickets, int k) {
	        int count=0;
	        while(tickets[k]>0){
	            for(int i=0;i<tickets.length;i++){
	                if(tickets[i]>0){
	                tickets[i]--;
	                count++;
	                }
	            
	            if(tickets[k]==0) break;
	        }
	        }
	       return count; 
	    }

}
