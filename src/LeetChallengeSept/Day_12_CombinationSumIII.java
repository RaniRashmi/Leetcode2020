/*
 * Find all possible combinations of k numbers that add up to a number n, given that only numbers from 1 to 9 can be used and each combination should be a unique set of numbers.

Note:

All numbers will be positive integers.
The solution set must not contain duplicate combinations.
Example 1:

Input: k = 3, n = 7
Output: [[1,2,4]]
Example 2:

Input: k = 3, n = 9
Output: [[1,2,6], [1,3,5], [2,3,4]]
 */
package LeetChallengeSept;

import java.util.ArrayList;
import java.util.List;

public class Day_12_CombinationSumIII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();
        dfs(result, 1, new ArrayList<>(), k, n);
        return result;
    }
    
    public void dfs(List<List<Integer>> result, int index, List<Integer> current, int k, int target){
        if(current.size() == k && target ==0){
            result.add(new ArrayList<>(current));
            return;
        }
        
        for(int i=index;i<=9;i++){
            current.add(i);
            dfs(result, i+1, current, k, target-i);
            current.remove(current.size()-1);
        }
    }

}
