/*
 * You have a total of n coins that you want to form in a staircase shape, where every k-th row must have exactly k coins.

Given n, find the total number of full staircase rows that can be formed.

n is a non-negative integer and fits within the range of a 32-bit signed integer.

Example 1:

n = 5

The coins can form the following rows:
?
? ?
? ?

Because the 3rd row is incomplete, we return 2.
Example 2:

n = 8

The coins can form the following rows:
?
? ?
? ? ?
? ?

Because the 4th row is incomplete, we return 3.
 */
package LeetChallengeJuly;

public class ArrangingCoins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int arrangeCoins(int n) {
		 long low =0;
		 long high = n;
		 
		 while(low <= high) {
			 long mid = low + (high - low)/2;
			 if(n >= mid*(mid+1)/2) {
				 low = mid +1;
			 }else {
				 high = mid-1;
			 }
		 }
		 return (int)low-1;
	}

}
