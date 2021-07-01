/*
 * Given an integer array nums, return all possible subsets (the power set).

The solution set must not contain duplicate subsets.

 

Example 1:

Input: nums = [1,2,3]
Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
Example 2:

Input: nums = [0]
Output: [[],[0]]
 

Constraints:

1 <= nums.length <= 10
-10 <= nums[i] <= 10
 */
package LeetcodePatternMedium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subset_78 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public List<List<Integer>> subsets(int[] nums) {
		List<List<Integer>> result = new ArrayList<>();
		if(nums.length == 0 || nums == null) return result;
		Arrays.sort(nums);
		helper(nums, result, new ArrayList<Integer>(),0);
		return result;
	}

	private void helper(int[] nums, List<List<Integer>> result, ArrayList<Integer> temp, int index) {
		result.add(new ArrayList<>(temp));
		
		for(int i = index;i<nums.length;i++) {
			temp.add(nums[i]);
			helper(nums, result, temp, i+1);
			temp.remove(temp.size()-1); // backtracking
		}
	}
	
	

}
