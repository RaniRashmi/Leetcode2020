/*
 * Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.

There is only one duplicate number in nums, return this duplicate number.

Follow-ups:

How can we prove that at least one duplicate number must exist in nums? 
Can you solve the problem without modifying the array nums?
Can you solve the problem using only constant, O(1) extra space?
Can you solve the problem with runtime complexity less than O(n2)?
 

Example 1:

Input: nums = [1,3,4,2,2]
Output: 2
Example 2:

Input: nums = [3,1,3,4,2]
Output: 3
Example 3:

Input: nums = [1,1]
Output: 1
Example 4:

Input: nums = [1,1,2]
Output: 1
 

Constraints:

2 <= n <= 3 * 104
nums.length == n + 1
1 <= nums[i] <= n
All the integers in nums appear only once except for precisely one integer which appears two or more times.
 */
package LeetcodePatternMedium;

public class FindtheDuplicateNumber_287 {
	
	  public int findDuplicate(int[] nums) {
	        //o(n) time and o(1) space
	        //need to keep in mind value of array in the range of array size, and value are 1 to N
	        for(int i=0;i<nums.length;i++){
	            if(nums[Math.abs(nums[i])-1] < 0){
	                return Math.abs(nums[i]);
	            } else{
	                nums[Math.abs(nums[i])-1] = -nums[Math.abs(nums[i])-1];
	            }
	        }
	        return -1;
	    }
	    
	    
	    //log n solution 
		// if (nums.length == 0 || nums == null)
		// 	return 0;
		// int low = 1, high = nums.length - 1, mid;
		// while (low < high) {
		// 	mid = low + (high - low) / 2;
		// 	int count = 0;
		// 	for (int i = 0; i < nums.length; i++) {
		// 		if (nums[i] <= mid)
		// 			count++;
		// 	}
		// 	if (count > mid)
		// 		high = mid;
		// 	else
		// 		low = mid + 1;
		// }
		// return low;

}
