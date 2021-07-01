/*
 * Given a positive integer num, write a function which returns True if num is a perfect square else False.

Note: Do not use any built-in library function such as sqrt.

Example 1:

Input: 16
Output: true
Example 2:

Input: 14
Output: false
 */
package LeetChallengeMay;

public class ValidPerfectSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	//method 1: brute force solution : try to check every number square from to N if 
	//get that number then that is perfect square. this solution will take o(n) time so 
	//need better solution
	
	//method 2: use binary search
	
	public boolean isPerfectSquare(int num) {
		if (num == 1) {
            return true;
        }
		int low = 1;
		int high = num/2; // we will get get perfect sqaure between half the way 
		
		while(low<= high) {
			//further optimization find mid
			int mid = low + (high - low)/2;
			
			if(num/mid == mid && num%mid ==0) {
				return true;
			} else if(mid < num/mid) {
				low++;
			} else {
				high--;
			}
			
		}
		return false;
	}

}
