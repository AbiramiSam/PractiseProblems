/**
 * 
 */
package mandatoryHomework.foundations;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.junit.Test;
import org.junit.internal.runners.model.EachTestNotifier;

/**
 * @author abiramisa
 * Given an array of integers arr return true if the number of occurrences of 
 * each value in the array is unique or false otherwise.
 * 
 * input = array of integers -> arr = [1,2,2,1,1,3]
 * output = boolean -> true or false
 * Pseudocode
 * iterate the array and find the count of each element
 * create a map and add the key (each element in array) and value (number of occurrence)
 * compare the value of each element in map
 * if the value is unique return true
 * else false
 */
public class UniqueNumberOfOccurrence {
	@Test
	public void testSample1() {
		System.out.println(numberOfOccurrences(new int[] {1,2}));
	}
	
	@Test
	public void testSample2() {
		System.out.println(numberOfOccurrences(new int[] {1,2,2,1,1,3}));
	}
	
	@Test
	public void testSample3() {
		System.out.println(numberOfOccurrences(new int[] {-3,0,1,-3,1,1,1,-3,10,0}));
	}
	
	public static boolean numberOfOccurrences(int[] arr) {
		
		Map<Integer,Integer> map=new HashMap<Integer, Integer>();
		Set<Integer> valueSet=new HashSet<Integer>();
		boolean result=false;
		
		for(int i=0;i<arr.length;i++) {
			
			if(map.containsKey(arr[i])) {
				int count=map.get(arr[i]);
				map.put(arr[i], count+1);
			}else {
				map.put(arr[i], 1);
			}
		}
		System.out.println(map);
		
		
		for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
            System.out.println("Key = " + entry.getKey() +
                             ", Value = " + entry.getValue());
          result= valueSet.add(entry.getValue());
          if(!result) {
        	  return false;
          }
		
		}
		return true;
	}
	
	
	public boolean occurrence(int[] num) {
		
		Map<Integer,Integer> map=new HashMap<Integer, Integer>();
		
		//boolean result=false;
		
		for (Integer i : num) {
			if(map.containsKey(i)) {
				map.put(i, map.get(i)+1);
			}
			else
			{
				map.put(i, 1);
			}
			
			
		}
		Set<Integer> valueSet=new HashSet<Integer>(map.values());
		if(map.size()==valueSet.size()) {
			return true;
		}
		return false;
	}

}
