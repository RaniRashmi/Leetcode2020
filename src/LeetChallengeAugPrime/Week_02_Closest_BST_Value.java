/*
 * Find the closest element in Binary Search Tree
Last Updated: 11-07-2019
Given a binary search tree and a target node K. The task is to find the node with minimum absolute difference with given target value K.



Examples:

// For above binary search tree
Input  :  k = 4
Output :  4

Input  :  k = 18
Output :  17

Input  :  k = 12
Output :  9
 */
package LeetChallengeAugPrime;

public class Week_02_Closest_BST_Value {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public int closestValue(TreeNode root, double target) {
		 if(root.val > target && root.left != null) {
			 int l = closestValue(root.left, target);
			 if(Math.abs(l-target) < Math.abs(root.val-target)) return l;
		 }
		 
		 if(root.val < target && root.right != null) {
			 int r = closestValue(root.right, target);
			 if(Math.abs(r-target) < Math.abs(root.val-target)) return r;
		 }
		 return root.val;
	 }

}
