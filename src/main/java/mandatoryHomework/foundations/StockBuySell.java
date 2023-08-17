/**
 * 
 */
package mandatoryHomework.foundations;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.Test;

/**
 * @author abiramisa
 * You are given an array prices where prices[i] is the price of a given stock on the ith day.

*You want to maximize your profit by choosing a single day to buy 
one stock and choosing a different day in the future to sell that stock.

*Return the maximum profit you can achieve from this transaction. If you cannot achieve 
any profit, return 0.
 *
 *Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
 *
 *pseudocode:
 *declare variable to store minimum amount for buy, maximum amount for sell, position where the minimum 
 *amount is in the array, profit
 *
 *iterate through the array
 *find the minimum amount and store it in variable min
 *also store the array elements in the map to get the position of the minimum amount
 *iterate the map using entry set and get the position of the minimum amount
 *iterate the array starting from the position of the minimum amount 
 *find the maximum amount in the array
 *find the profit amount with minimum and maximum amount
 *return profit
 *
 */
public class StockBuySell {
	
	public void testSample1(){
		System.out.println(buyandsellStock(new int[] {7,1,5,3,6,4}));
	}
	
	@Test
	public void testSample2() {
		System.out.println(buyandsellStock(new int[] {7,6,4,3,1}));
	}
	
	public int buyandsellStock(int[] prices) {
		int min=prices[0];
		int max=0;
		int position=0;
		int profit=0;
		Map<Integer,Integer> map=new HashMap<Integer, Integer>();
		for(int i=0;i<prices.length;i++) {
			map.put(prices[i], i+1);
			if(prices[i]<min) {
				min=prices[i];
			}
			
		}
			
		for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
            //System.out.println("Key = " + entry.getKey()+ ",Value = " + entry.getValue());
            if(entry.getKey()==min) {
            	position=entry.getValue();
            	System.out.println(position);
            }
		}
		
		//position=position+1;
		max=prices[position];
		//System.out.println("Position"+max);
		if(max<prices.length) {
		for(int i=position;i<prices.length;i++) {
			if(prices[i]>max) {
				max=prices[i];
			}
		}
		}
		else {
			max=0;
		}
		profit=max-min;
		return profit;
	}

	
	  public int maxProfit(int[] prices) {
		    int maxProfit = 0;
		        int currentProfit=0;
		        int buyPrice = Integer.MAX_VALUE;
		        for(int i=0;i<prices.length;i++){
		            if(prices[i]<buyPrice){
		                buyPrice = prices[i];
		            }
		            currentProfit = prices[i]-buyPrice;
		            if(currentProfit>maxProfit){
		                maxProfit=currentProfit;
		            }
		        }
		        return maxProfit;
		    }
}
