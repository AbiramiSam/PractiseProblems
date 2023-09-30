/**
 * 
 */
package mandatoryHomework.foundations;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.Test;

/**
 * 
 */
public class HR_ValidString {
	@Test
	public void test() {
		System.out.println(isValid("abcc"));
	}
	
	
	@Test
	public void test1() {
		System.out.println(isValid("abccc"));
	}
	
	@Test
	public void test2() {
		System.out.println(isValid("aabbcd"));
	}
	
	@Test
	public void test3() {
		System.out.println(isValid("aabbccddeefghi"));
	}
	
	public static String isValid(String s) {
		int cons=0,count=0,value=0,temp=0;
		Map<Character,Integer> smap=new HashMap<Character,Integer>();
		for(int i=0;i<s.length();i++) {
			count=1;
			if(!smap.containsKey(s.charAt(i))) {
				smap.put(s.charAt(i), 1);
			}
			else {
				count=count+1;
				smap.put(s.charAt(i), count);
			}
		}
		System.out.println(smap);
		cons=smap.get(s.charAt(0));
		for (int occurence : smap.values()) {
			if(!smap.values().equals(cons)) {
				temp=temp+1;
				value=occurence-1;
			}
			if(temp!=0 && value>1)
				return "NO";
			
		}
		if(value==0) {
			return "YES";
		}
		
		if(temp==1 || value-1==cons)
			return "YES";
		
		return "NO";
	}
	
	 public static String isValid1String1(String s) {
		    // Write your code here
		    int count=0,n=0,temp=0;
		    int[] arr=new int[s.length()];
		    for(int i=0;i<s.length();i++){
		    	//arr[s.charAt(i)-'a']=1;
		    	
		        for(int j=i+1;j<s.length();j++){
		            if(s.charAt(i)==s.charAt(j)){
		            	temp=temp+1;
		            	arr[s.charAt(i)-'a']=temp;
		            }else {
		            	temp=0;
		            	arr[s.charAt(i)-'a']=1;
		            }  
		        }
		    }
		    System.out.println(Arrays.toString(arr));
		    for(int i=0;i<arr.length;i++){
		        if(arr[i]==2){
		            n=n++;
		        }
		        if(arr[i]>2)
		            count=count+1;
		    }
		    if(n>1 || count>0)
		        return "NO";
		    else
		        return "YES";
		    }


}
