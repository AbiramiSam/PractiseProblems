package mandatoryHomework.foundations;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class FizzBuzz {
	
	@Test
	public void test1() {
		//System.out.println(fizzBuzz(12));
		
		//List<String> res=fizzBuzz(9);
		String[] arr1=printValue(16);
		for(int i=0;i<arr1.length;i++) {
			System.out.println(arr1[i]);
		}
	}
	
	public static List<String> fizzBuzz(int num) {
		
		//String[] result=new String[num];
		List<String> result=new ArrayList<String>();
		
		String temp=null;
		
		for(int i=1;i<=num;i++) {
					
			if(num%3==0 && num%5==0) {
				result.add("FizzBuzz");
			}else if(num%3==0) {
				result.add("Fizz");
			}else if(num%5==0) {
				result.add("Fizz");
			}
			else {
				temp=Integer.toString(i);
				result.add(temp);
			}
			
			System.out.println(result);	
			
		}
		return result;
	}

	
	public static String[] printValue(int num) {
		
		String[] arr=new String[num];
		String temp=null;
		for(int i=1;i<=num;i++) {
			
			if(i%3==0 && i%5==0) {
				arr[i-1]="FizzBuzz";
			}else if(i%3==0) {
				arr[i-1]="Fizz";
			}else if(i%5==0) {
				arr[i-1]="Buzz";
			}
			else {
				temp=Integer.toString(i);
				arr[i-1]=temp;
			}
			
			//System.out.println(result);	
			
		}
		return arr;
	}
}
