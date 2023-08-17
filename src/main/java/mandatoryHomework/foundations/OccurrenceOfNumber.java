/**
 * 
 */
package mandatoryHomework.foundations;

/**
 * @author abiramisa
 *
 */
public class OccurrenceOfNumber {
	
	
	public void testSample1(){
		
	}
	
	public int findOccurenceNumber(int[] arr,int target) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==target) {
				count=count+1;
			}
		}
		return count;
	}

}
