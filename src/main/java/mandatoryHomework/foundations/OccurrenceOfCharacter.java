package mandatoryHomework.foundations;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

/**
 * @author abiramisa
 * Find number of time each character is repeated in the String "I love programming" 
 * using Map concept
 * convert the given string into character array
 * add each character in the array to a map using iterator
 * 
 */
public class OccurrenceOfCharacter {
	@Test
	public void findOccurrenceOfCharacter() {
		String input = "I love Programming";
		//int count=0;
		//String value=null;
		char[] arr1=input.toCharArray();
		char value;
		Map<Character,Integer> map=new HashMap<Character, Integer>();
		for(int i=0;i<arr1.length;i++) {
			if(map.containsKey(arr1[i])) {
				int count=map.get(arr1[i]);
				map.put(arr1[i], count+1);
			}else {
				map.put(arr1[i], 1);
			}
			
		}
		
		
			System.out.println(map);
		
	}

}


