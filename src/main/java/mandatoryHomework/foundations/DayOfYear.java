/**
 * 
 */
package mandatoryHomework.foundations;

import org.junit.Test;

/**
 * 09-Aug-2023
 * https://leetcode.com/problems/day-of-the-year/
 * 
 * Input:
 * String-date format
 * Output:
 * integer
 * 
 * DataSet:
 * i/p- "2019-01-09" o/p-9
 * i/p- "2019-02-10" o/p-41
 * 
 * Pseudoccode:
 * 
 * 
 * 
 * 
 */
public class DayOfYear {
	@Test
	public void test() {
		System.out.println(findDayOfYear("2019-01-09"));
	}
	@Test
	public void test1() {
		System.out.println(findDayOfYear("2019-10-11"));
	}
	@Test
	public void test2() {
		System.out.println(findDayOfYear("2020-03-09"));
	}
	
	public int findDayOfYear(String input) {
		int yearformat=Integer.valueOf(input.substring(0,4));
		int monthformat=Integer.valueOf(input.substring(5,7));
		int dayformat=Integer.valueOf(input.substring(8,10));
		int output=0;
		
		if(monthformat==1) {
			return output=dayformat;
		}
		if(monthformat==2) {
			return output=dayformat+31;
		}
		if(monthformat>2 && monthformat<13) {
			switch(monthformat) {
			case 3:
				output=dayformat+59;
				break;
			case 4:
				output=dayformat+90;
				break;
			case 5:
				output=dayformat+120;
				break;
			case 6:
				output=dayformat+151;
				break;
			case 7:
				output=dayformat+181;
				break;
			case 8:
				output=dayformat+212;
				break;
			case 9:
				output=dayformat+243;
				break;
			case 10:
				output=dayformat+273;
				break;
			case 11:
				output=dayformat+304;
				break;
			case 12:
				output=dayformat+334;
				break;			
			
			}
			if(yearformat%4==0) {
					return output+1;
			}
		}
		return output;
	}

}
