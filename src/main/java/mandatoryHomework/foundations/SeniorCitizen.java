/**
 * 
 */
package mandatoryHomework.foundations;

import org.junit.Test;

import junit.framework.Assert;

/**
 * @author abiramisa
 * Classroom
 * https://leetcode.com/problems/number-of-senior-citizens/description/
 * 
 * You are given a 0-indexed array of strings details. Each element of details provides information
 * about a given passenger compressed into a string of length 15. The system is such that:
 * The first ten characters consist of the phone number of passengers.
The next character denotes the gender of the person.
The following two characters are used to indicate the age of the person.
The last two characters determine the seat allotted to that person.
Return the number of passengers who are strictly more than 60 years old.
 * 
 * 
 *
 */
public class SeniorCitizen {
	@Test
	public void test() {
		System.out.println(findSeniorCitizen(new String[] {"7868190130M7522","5303914400F9211","9273338290F4010"}));
		Assert.assertEquals(2, findSeniorCitizen(new String[] {"7868190130M7522","5303914400F9211","9273338290F4010"}));
	}
	
	@Test
	public void test1() {
		//System.out.println(findSeniorCitizen(new String[] {"7868190130M7522","5303914400F9211","9273338290F4010"}));
		Assert.assertEquals(0, findSeniorCitizen(new String[] {"1313579440F2036","2921522980M5644"}));
	}
	
	
	public int findSeniorCitizen(String[] arr) {
		String ageS="";
		int age=0;
		int count=0;
		for(int i=0;i<arr.length;i++) {
			ageS=arr[i].substring(11, 13);
			age=Integer.parseInt(ageS);
			if(age>60) {
				count=count+1;
			}
			
		}
		return count;
	}

}
