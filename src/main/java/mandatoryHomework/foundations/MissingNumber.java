package mandatoryHomework.foundations;

import java.util.Iterator;

import org.junit.Test;

public class MissingNumber {
	
	// Input int[] arr={3,4,0,1,5}
	// Assume we have integer array of input
	// Traverse the array 
	// sort the array
	// compare the elements in the array with iterator
	// if element is not present in the array return the number
	// if all element is present then return the length of the array (for edge cases {0,1} =2)
	@Test
	public void test1() {
		
		int[] arr1= {3,4,0,1,5};
		int res=missingNumberInArray(arr1);
		System.out.println(res);		
	}
	
	public static int missingNumberInArray(int[] arr) {
		int num=0;
		int temp=0;
		
		for(int i=0;i<=arr.length;i++) { 
			
			for(int j=i+1;j<arr.length;j++) { 
				
				if(arr[i]>arr[j]) { 
					temp=arr[i];	
					arr[i]=arr[j];	
					arr[j]=temp;	
				}
				
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=i) {
				num=i;
				break;
			}else if(arr[i]==i) {
				num=arr.length;
			}
		}
		
		return num;
	}

}
