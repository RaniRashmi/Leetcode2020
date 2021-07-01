/*
 * Given an integer (signed 32 bits), write a function to check whether it is a power of 4.

Example 1:

Input: 16
Output: true
Example 2:

Input: 5
Output: false
Follow up: Could you solve it without loops/recursion?
 */
package LeetChallengeAug;

public class Day_04_Power_of_four {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public boolean isPowerOfFour(int num) {
         int count = 0;
       for(int i =0;i <32; i++){
           if (((num >>> i) & 1) != 0){ 
               count++;
               if(i%2 == 1) return false;
           }
       }
       if(count == 1) return true;
       else return false;
   }

}
