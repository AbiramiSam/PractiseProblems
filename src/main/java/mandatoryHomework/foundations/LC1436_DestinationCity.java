/**
 * 
 */
package mandatoryHomework.foundations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * https://leetcode.com/problems/destination-city/description/
 * 
 * 
 * Pseudocode:
 * Declare a Map of String and String
 * Iterate through the list of list of String
 * add the elements to a map
 * assign the key to a string
 * while the key of the map is not null
 * assign the key value to the temp
 * return the last key value
 * 
 * 
 */
public class LC1436_DestinationCity {
	
	public void test() {
		List<List<String>> paths = new ArrayList<List<String>>();
        paths.add(Arrays.asList("London","New York"));
        paths.add(Arrays.asList("New York","Lima"));
        paths.add(Arrays.asList("Lima","Sao Paulo"));
		System.out.println(destCity(paths));
	}
	
	public String destCity(List<List<String>> paths) {
	       //String output="";
	       Map<String,String> map=new HashMap<String, String>();
	       for(int i=0;i<paths.size();i++) {
	    	  map.put(paths.get(i).get(0), paths.get(i).get(1));
	       }
	       String temp=paths.get(0).get(1);
	       while(map.get(temp)!=null) {
	    	   temp=map.get(temp);
		}
	       return temp;
	    }

}
