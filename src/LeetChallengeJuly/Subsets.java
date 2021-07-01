/*
 * Given a set of distinct integers, nums, return all possible subsets (the power set).

Note: The solution set must not contain duplicate subsets.

Example:

Input: nums = [1,2,3]
Output:
[
  [3],
  [1],
  [2],
  [1,2,3],
  [1,3],
  [2,3],
  [1,2],
  []
]
 */
package LeetChallengeJuly;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public List<List<Integer>> subsets(int[] nums) {
		 List<List<Integer>> result = new ArrayList<>();
	        if(nums == null || nums.length == 0) return result;
	        Arrays.sort(nums);
	        helper(nums,result,new ArrayList<Integer>(),0);
	        return result;
	    }
	    
	public void helper(int [] nums, List<List<Integer>> result, ArrayList<Integer> temp, int index){
	       result.add(new ArrayList<>(temp));
	           
	       for(int i=index; i<nums.length;i++){
	           temp.add(nums[i]);
	           helper(nums,result,temp,i+1);
	           temp.remove(temp.size()-1);
	       }
	}

}
