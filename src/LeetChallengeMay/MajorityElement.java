/*
 * Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.

You may assume that the array is non-empty and the majority element always exist in the array.

Example 1:

Input: [3,2,3]
Output: 3
Example 2:

Input: [2,2,1,1,1,2,2]
Output: 2
 */
package LeetChallengeMay;

public class MajorityElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int [] nums = {2,2,1,1,1,2,2};
      int num = majorityElement(nums);
      System.out.println(num);
	}
	
	public static int majorityElement(int[] nums) {
		int temp = nums[0];
		int count =1;
		
		for(int i=1;i<nums.length;i++) {
			if(nums[i] == temp) {
				count++;
			}else if(count>0) {
				count--;
			}else {
				temp = nums[i];
				count =1;
			}
		}
		return temp;
	}

}
