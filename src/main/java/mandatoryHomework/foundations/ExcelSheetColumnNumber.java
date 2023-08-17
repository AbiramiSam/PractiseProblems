/**
 * 
 */
package mandatoryHomework.foundations;

import org.junit.Test;

/**
 * @author abiramisa
 * Classroom
 * https://leetcode.com/problems/excel-sheet-column-number/
 * 
 * 
 * 
 *
 */
public class ExcelSheetColumnNumber {
	@Test
	public void test() {
		System.out.println(findColumnNumber("AB"));
	}
	
	public int findColumnNumber(String columnTitle) {
			int result = 0;
	        for(int i=0; i<columnTitle.length(); i++)
	        {
	            //result = str.charAt(i)-'A'+1;
	            char c = columnTitle.charAt(i);  //A //B
	            result = result * 26 + (c - 'A' + 1); //result = 1 //result = 26+2 > 28
	        }
	        
	        return result;
		
	}

}
