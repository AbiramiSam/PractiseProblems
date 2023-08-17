/**
 * 
 */
package mandatoryHomework.foundations;

import org.junit.Test;

import junit.framework.Assert;

/**
 * @author abiramisa
 * Given a sorted character array and a target character, find the next biggest character in the array.
 * input: char[] cha={'b','d','h','f'} char target='e'
 * output->f
 * 
 * pseudocode:
 * iterate through the array till the length of the array
 * compare the char in the array is greater than the target
 * return the char in the array
 *
 */
public class BiggestCharacter {
	@Test
	public void test() {
		System.out.println(findBiggestCharacter(new char[] {'b','d','h','f'}, 'e'));
		Assert.assertEquals('f', findBiggestCharacter(new char[] {'b','d','h','f'}, 'e'));
	}
	
	public char findBiggestCharacter(char[] cha,char target) {
		char res='a';
		for(int i=0;i<cha.length;i++) {
			if(cha[i]>target) {
				res=cha[i];
			}
		}
		return res;
	}

}
