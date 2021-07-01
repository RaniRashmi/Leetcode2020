/*
 * Given a non negative integer number num. For every numbers i in the range 0 ≤ i ≤ num calculate the number of 1's in their binary representation and return them as an array.

Example 1:

Input: 2
Output: [0,1,1]
Example 2:

Input: 5
Output: [0,1,1,2,1,2]
Follow up:

It is very easy to come up with a solution with run time O(n*sizeof(integer)). But can you do it in linear time O(n) /possibly in a single pass?
Space complexity should be O(n).
Can you do it like a boss? Do it without using any builtin function like __builtin_popcount in c++ or in any other language.
 */
package LeetChallengeMay;

public class CountingBits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	  public int[] countBits(int num) {
	        
	        
	        int [] dp = new int[num+1];
	        for(int i=0;i<=num;i++){
	            dp[i] = helper(i, dp);
	        }
	        return dp;
	    }
	    
	    public int helper(int num, int [] memo){
	        if(num ==0) return 0;
	        if(num == 1) return 1;
	        
	        if(memo[num] != 0) return memo[num];
	        
	        if(num%2 == 0){
	            memo[num] = helper(num/2, memo);
	            return helper(num/2, memo);
	        } else{
	             memo[num] = 1 +helper(num/2, memo);
	            return 1 + helper(num/2, memo);
	        }
	    }
	    
//	     //tree line solution 
//	     An easy recurrence for this problem is f[i] = f[i / 2] + i % 2.

//	     public int[] countBits(int num) {
//	         int[] f = new int[num + 1];
//	         for (int i=1; i<=num; i++) f[i] = f[i >> 1] + (i & 1);
//	         return f;
//	     }
	

}
