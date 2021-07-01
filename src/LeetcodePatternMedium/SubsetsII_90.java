/*
 * Given a collection of integers that might contain duplicates, nums, return all possible subsets (the power set).

Note: The solution set must not contain duplicate subsets.

Example:

Input: [1,2,2]
Output:
[
  [2],
  [1],
  [1,2,2],
  [2,2],
  [1,2],
  []
]
 */
package LeetcodePatternMedium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetsII_90 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public List<List<Integer>> subsetsWithDup(int[] nums) {
		List<List<Integer>> result = new ArrayList<>();
		if(nums.length == 0 || nums == null) return result;
		Arrays.sort(nums);
		helper(nums, result, new ArrayList<Integer>(), 0);
		return result;
	}

	private void helper(int[] nums, List<List<Integer>> result, ArrayList<Integer> temp, int index) {
		result.add(new ArrayList<>(temp));
		for(int i= index;i<nums.length;i++) {
			if(i > index && nums[i] == nums[i-1]) continue;   // in case of duplicate escape it.
			temp.add(nums[i]);
			helper(nums, result, temp, i+1);
			temp.remove(temp.size()-1);
		}
	}

}
