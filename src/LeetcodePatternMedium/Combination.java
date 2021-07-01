/*
 * Given two integers n and k, return all possible combinations of k numbers out of 1 ... n.

You may return the answer in any order.

 

Example 1:

Input: n = 4, k = 2
Output:
[
  [2,4],
  [3,4],
  [2,3],
  [1,2],
  [1,3],
  [1,4],
]
Example 2:

Input: n = 1, k = 1
Output: [[1]]
 

Constraints:

1 <= n <= 20
1 <= k <= n
 */
package LeetcodePatternMedium;

import java.util.ArrayList;
import java.util.List;

public class Combination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public List<List<Integer>> combine(int n, int k) {
		 List<List<Integer>> result = new ArrayList<>();
		 helper(result, new ArrayList<>(), 1, n, k);
		 return result;
	 }

	private void helper(List<List<Integer>> result, ArrayList temp, int index, int n, int k) {
		if(temp.size() == k) {
			result.add(new ArrayList<>(temp));
		}
		for(int i= index;i<=n;i++) {
			temp.add(i);
			helper(result, temp, i+1, n, k);
			temp.remove(temp.size()-1);
		}
	}

}
