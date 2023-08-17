/**
 * 
 */
package mandatoryHomework.foundations;

import org.junit.Test;

import junit.framework.Assert;

/**
 * @author abiramisa
 *
 */
public class PowerOfThree {
	
	@Test
	public void testSample1() {
		Assert.assertEquals(true, findPowerOfThree(81));
	}
	
	@Test
	public void testSample2() {
		Assert.assertEquals(false, findPowerOfThree(0));
	}
	
	@Test
	public void testSample3() {
		Assert.assertEquals(false, findPowerOfThree(-1));
	}
	
	
	public boolean findPowerOfThree(int input) {
		
		//System.out.println(384/10);
	
		if(input<2) {
			return false;
		}
		
		while(input%3==0) {
			input=input/3;
			return true;
		}
		return false;
	}

}
