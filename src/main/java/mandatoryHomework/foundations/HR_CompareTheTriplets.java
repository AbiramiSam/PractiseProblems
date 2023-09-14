/**
 * 
 */
package mandatoryHomework.foundations;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/**
 * 14-Sep-2023
 * Vel
 * https://www.hackerrank.com/challenges/compare-the-triplets/problem
 * 
 * 
 * DataSet:
 * Input: two list
 * Output: list of integer 
 * 
 * Input: a = [1, 2, 3], b = [3, 2, 1]
 * Output:  [1, 1]
 * 
 * 
 * Input: a = [17 28 30], b = [99 16 8]
 * Output:  [2 1]
 * 
 *Pseudocode:
 *Declare list of integer, int acount=0, int bcount=0;
 *iterate the two integer
 *compare the elements
 *if element of a is greater then element of b 
 *then increment the responding count
 *add the count to the list at the end
 *return the list
 *
 * 
 * 
 * 
 * 
 */
public class HR_CompareTheTriplets {
	@Test
	public void test() {
		
	}
	
	public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
		List<Integer> outList=new ArrayList<Integer>();
		int aCount=0, bCount=0;
		for(int i=0;i<a.size();i++) {
			if(a.get(i)==b.get(i)) {
				continue;
			}
			else if(a.get(i)>b.get(i)) {
				aCount++;
			}
			else
				bCount++;
			
		}
		outList.add(aCount,bCount);
		return outList;
    }

}
