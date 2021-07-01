/*
 * Given an array nums of distinct integers, return all the possible permutations. You can return the answer in any order.

 

Example 1:

Input: nums = [1,2,3]
Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
Example 2:

Input: nums = [0,1]
Output: [[0,1],[1,0]]
Example 3:

Input: nums = [1]
Output: [[1]]
 

Constraints:

1 <= nums.length <= 6
-10 <= nums[i] <= 10
All the integers of nums are unique.
 */
package LeetcodePatternMedium;

import java.util.ArrayList;
import java.util.List;

public class Permutations_46 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public List<List<Integer>> permute(int[] nums) {
		 List<List<Integer>> result = new ArrayList<>();
		 if(nums.length == 0 || nums == null) return result;
		 boolean [] taken = new boolean[nums.length];
		 helper(nums, result, new ArrayList<Integer>(), taken);
		 return result;
	 }

	private void helper(int[] nums, List<List<Integer>> result, ArrayList<Integer> temp, boolean[] taken) {
		if(temp.size() == nums.length) {
			result.add(new ArrayList<>(temp));
			return;
		}
		
		for(int i=0;i<nums.length;i++) {
			if(taken[i]) {
				return;
			}
			
			taken[i] = true;
			temp.add(nums[i]);
			helper(nums, result, temp, taken);
			temp.remove(temp.size()-1);
			taken[i] = false;
		}
	}

}
