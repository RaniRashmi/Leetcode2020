/*
 * Given a non-empty array of integers, return the k most frequent elements.

Example 1:

Input: nums = [1,1,1,2,2,3], k = 2
Output: [1,2]
Example 2:

Input: nums = [1], k = 1
Output: [1]
Note:

You may assume k is always valid, 1 ≤ k ≤ number of unique elements.
Your algorithm's time complexity must be better than O(n log n), where n is the array's size.
It's guaranteed that the answer is unique, in other words the set of the top k frequent elements is unique.
You can return the answer in any order.
 */
package LeetChallengeJuly;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TopKFrequentElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int[] topKFrequent(int[] nums, int k) {
	     List<Integer>[] bucket = new List[nums.length + 1];
		 HashMap<Integer, Integer> hm = new HashMap<>();

		for (int i =0; i< nums.length; i++) 
			hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
		

		for (int key : hm.keySet()) {
			int frequency = hm.get(key);
			if (bucket[frequency] == null) {
				bucket[frequency] = new ArrayList<>();
			}
			bucket[frequency].add(key);
		}

	    int ans[] = new int[k];
	    int count = 0;
	    for (int i = bucket.length - 1; i >= 0 ; i--) {
			if (bucket[i] != null) {
				for(int j =0; j <bucket[i].size(); j++)
	              ans[count++] = bucket[i].get(j);
			}
	        if(count == k) break;
	   	}
	              
	        return ans;
	    }

}
