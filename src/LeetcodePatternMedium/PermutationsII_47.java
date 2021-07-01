/*
 * Given a collection of numbers, nums, that might contain duplicates, return all possible unique permutations in any order.

 

Example 1:

Input: nums = [1,1,2]
Output:
[[1,1,2],
 [1,2,1],
 [2,1,1]]
Example 2:

Input: nums = [1,2,3]
Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
 

Constraints:

1 <= nums.length <= 8
-10 <= nums[i] <= 10
 */
package LeetcodePatternMedium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermutationsII_47 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public List<List<Integer>> permuteUnique(int[] nums) {
		 List<List<Integer>> result = new ArrayList<>();
		 Arrays.sort(nums);
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
				continue;
			}
			taken[i] = true;
			temp.add(nums[i]);
			helper(nums, result, temp, taken);
			temp.remove(temp.size()-1);
			taken[i] = false;
			
			while( i < nums.length-1 && nums[i] == nums[i-1]) {
				i++;
			}
			
		}
	}

}
