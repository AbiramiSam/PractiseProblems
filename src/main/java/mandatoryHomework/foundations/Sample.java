/**
 * 
 */
package mandatoryHomework.foundations;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;

/**
 * 
 */
public class Sample {
	@Test
	public void test() {
		
		System.out.println(isPangram());
	}
	
	 public static String isPangram() {
		 List<String> pangram=new ArrayList<String>();
		 pangram.add("we promptly judged antique ivory buckles for the next prize");
		 pangram.add("we promptly judged antique ivory buckles for the prizes");
		 pangram.add("leet code");
		 pangram.add("the quick brown fox jump over the lazy dog");
	        String output="";
	        char ch=' ';
	        
	        //int[] asciiArray=new int[26];
	        for(int i=0;i<pangram.size();i++){
	        	System.out.println(pangram.get(i).length());
	        	Set<Character> panSet=new HashSet<Character>();
	            for(int j=0;j<pangram.get(i).length();j++){
	                if(pangram.get(i).charAt(j)!=' '){
	                panSet.add(pangram.get(i).charAt(j));
	            }
	            }
	            System.out.println(panSet);
	            if(panSet.size()==26){
	                ch='1';
	            }
	            else{
	                ch='0';
	            }
	            output=output+ch;
	        }
	        
	return output;
	    }

	}


