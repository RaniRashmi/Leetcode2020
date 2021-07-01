/*
 * Given an array of integers, find out whether there are two distinct indices i and j in the array such that the absolute difference between nums[i] and nums[j] is at most t and the absolute difference between i and j is at most k.

Example 1:

Input: nums = [1,2,3,1], k = 3, t = 0
Output: true
Example 2:

Input: nums = [1,0,1,1], k = 1, t = 2
Output: true
Example 3:

Input: nums = [1,5,9,1,5,9], k = 2, t = 3
Output: false
 */
package LeetChallengeSept;

public class Day_02_ContainsDuplicateIII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        if (nums.length == 0 || k <= 0)
                return false;

            TreeSet<Long> set = new TreeSet<>();
            for (int i = 0; i < nums.length; i++) {
                Long floor = set.floor(1L * nums[i] + t);
                Long ceil = set.ceiling(1L * nums[i] - t);
                if ((floor != null && floor >= nums[i]) || (ceil != null && ceil <= nums[i]))
                    return true;

                set.add(1L * nums[i]);
                if (i >= k)
                    set.remove(1L * nums[i - k]);
            }

            return false;
    }

}

