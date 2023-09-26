/**
 * 
 */
package mandatoryHomework.foundations;

import org.junit.Test;

/**
 * 26-Sep-2023
 * https://leetcode.com/problems/determine-the-winner-of-a-bowling-game/description/
 * 
 *
 * 
 * Input: player1 = [4,10,7,9], player2 = [6,5,2,3]
 * Output: 1
 * 
 * Input: player1 = [3,5,7,6], player2 = [8,10,10,2]
 * Output: 2
 * 
 * Input: player1 = [2,3], player2 = [4,1]
 * Output: 0
 * 
 * Pseudocode:
 * Declare integer scoreOfPlayer1,scoreOfPlayer2, flag1, flag2, output;
 * Iterate through the array
 * if the element of the array is less than10 add the number
 * if the element of the array is 10 then add 2* element of the array from the next iteration
 * compare the score of the player
 * if the score of player 1 is greater return 1 
 * if the score of the player 2 is greater return 2
 * if the score is equal return 0
 * 
 * 
 * 
 */
public class LC2660_DeterminetheWinnerofaBowlingGame {
	
		@Test
		public void test() {
			System.out.println(isWinner(new int[] {9,7,10,7}, new int[] {10,2,4,10}));
		}
			
			@Test
			public void test1() {
				System.out.println(isWinner(new int[] {3,5,7,6}, new int[] {8,10,10,2}));
			}
			
			@Test
			public void test2() {
				System.out.println(isWinner(new int[] {2,3}, new int[] {4,1}));
			}
	
		public int isWinner(int[] player1, int[] player2) {
		     int scoreOfPlayer1=0,scoreOfPlayer2=0,flag1=0,flag2=0;
		     int pointer1=0,pointer2=0;
		     for(int i=0;i<player1.length;i++) {
		    	 if(flag1==1 && i<pointer1) {
		    		 scoreOfPlayer1+=2*player1[i];
		    	 }else {
		    		 scoreOfPlayer1+=player1[i];
		    	 }
		    	 if(player1[i]==10) {
		    		 flag1=1;
		    		 pointer1=i+3;
		    	 }
		    	 
		    	 if(flag2==1 && i<pointer2) {
		    		 scoreOfPlayer2+=2*player2[i];
		    	 }else {
		    		 scoreOfPlayer2+=player2[i];
		    	 }
		    	 if(player2[i]==10) {
		    		 flag2=1;
		    		 pointer2=i+3;
		    	 }
		    	 
		     }
		 
		     if(scoreOfPlayer1>scoreOfPlayer2) return 1;
		     if(scoreOfPlayer1<scoreOfPlayer2) return 2;
		     return 0;
		    }

}
