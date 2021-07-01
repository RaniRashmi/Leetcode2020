/*
 * Given a binary array, find the maximum length of a contiguous subarray with equal number of 0 and 1.

Example 1:
Input: [0,1]
Output: 2
Explanation: [0, 1] is the longest contiguous subarray with equal number of 0 and 1.
Example 2:
Input: [0,1,0]
Output: 2
Explanation: [0, 1] (or [1, 0]) is a longest contiguous subarray with equal number of 0 and 1.
Note: The length of the given binary array will not exceed 50,000.
 */
/*
 * solution is when even we see 0 just decrement count and when we see 1 just increment count ..if count is
 * 0 after then after than , this is length..
 */
package LeetChallengeMay;

import java.util.HashMap;

public class ContiguousArray {
	
	public static void main(String [] args) {
		int [] nums = {0,1,0,1,1};
		System.out.println(findMaxLength(nums));
	}

	public static int findMaxLength(int[] nums) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		//intially set  map count 0 and index -1 in HashMap
		map.put(0, -1);
		int maxLen = 0;
		int count =0;
		for(int i=0;i<nums.length;i++) {
			//binary array
			if(nums[i] == 0) {
				count--;
			}else {
				count++;
			}
			
			if(map.containsKey(count)) {
				maxLen = Math.max(maxLen, i-map.get(count));
			}else {
				map.put(count, i);
			}
		}
		return maxLen;
	}
	
}
