/**
 * 
 */
package mandatoryHomework.foundations;

import org.junit.Test;

/**
 * 
 */
public class ProductAndSumDifference {
	@Test
	public void test() {
		System.out.println(findProductAndSumDifference(121));
		System.out.println(findProductDifference(121));
	}
	
	@Test
	public void test1() {
		System.out.println(findProductAndSumDifference(12345));
		System.out.println(findProductDifference(12345));
	}
	
	public int findProductAndSumDifference(int input) {
		int difference=0,product=1,sum=0,rem=0;
		while(input>0) {
			rem=input%10;
			sum=sum+rem;
			product=product*rem;
			input=input/10;
		}
		difference=product-sum;
		
		return difference;
	}
	
	public int findProductDifference(int input) {
		String value=String.valueOf(input);
		int sum=0,difference=0,product=1;
		char ch=' ';
		for(int i=0;i<value.length();i++) {
			ch=value.charAt(i);
			sum=sum+Character.getNumericValue(ch);
			product=product*Character.getNumericValue(ch);
			
		}
		difference=product-sum;
		return difference;
	}

}
