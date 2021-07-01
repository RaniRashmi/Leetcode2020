/*
 * Given an integer array nums, find the contiguous subarray within an array (containing at least one number) which has the largest product.

Example 1:

Input: [2,3,-2,4]
Output: 6
Explanation: [2,3] has the largest product 6.
Example 2:

Input: [-2,0,-1]
Output: 0
Explanation: The result cannot be 2, because [-2,-1] is not a subarray.
 */
package LeetChallengeSept;

public class Day_11_MaximumProductSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public int maxProduct(int[] nums) {
	        if(nums.length == 0) return 0;
	        int currentMax = nums[0];
	        int currentMin = nums[0];
	        int finalMax = nums[0];
	        
	        for(int i=1;i<nums.length;i++){
	            int temp = currentMax;
	            currentMax = Math.max(Math.max(currentMax*nums[i], currentMin*nums[i]), nums[i]);
	            currentMin = Math.min(Math.min(temp*nums[i], currentMin*nums[i]), nums[i]);
	            
	            if(currentMax > finalMax){
	                finalMax = currentMax;
	            }
	        }
	        return finalMax;
	    }

}
