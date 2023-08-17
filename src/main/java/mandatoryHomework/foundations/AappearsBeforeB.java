/**
 * 
 */
package mandatoryHomework.foundations;

import org.junit.Test;

/**
 * @author abiramisa
 * Classroom
 * https://leetcode.com/problems/check-if-all-as-appears-before-all-bs/description/
 * 
 *
 */
public class AappearsBeforeB {
	@Test
	public void test() {
		System.out.println(findAppearance("bbb"));
	}
	
	public boolean findAppearance(String input) {
		boolean ans=false;
		for(int i=0;i<input.length()-1;i++) {
			if(input.charAt(i)=='b') {
				if(input.charAt(i+1)=='a')
					ans=false;
				break;
			}
			else
				ans=true;
		}
		return ans;
	}
	
	public boolean findAppear(String input) {
		//return !input.contains("ba"); this will also work
		if(input.contains("ba")) {
			return false;
		}
		return true;
	}

}
