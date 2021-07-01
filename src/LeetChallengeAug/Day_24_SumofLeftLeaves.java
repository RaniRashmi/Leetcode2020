/*
 * Find the sum of all left leaves in a given binary tree.

Example:

    3
   / \
  9  20
    /  \
   15   7

There are two left leaves in the binary tree, with values 9 and 15 respectively. Return 24.
 */
package LeetChallengeAug;

public class Day_24_SumofLeftLeaves {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	int leftSum = 0;
	
	public int sumOfLeftLeaves(TreeNode root) {
		helper(root);
		return leftSum;
	}

	public void helper(TreeNode root) {
		if(root == null) return;
		if(isLeaf(root.left)) {
			leftSum += root.left.val;
		}
		helper(root.left);
		helper(root.right);
	}
	
	public boolean isLeaf(TreeNode root) {
		if(root == null) return false;
		if(root.left == null && root.right == null) return true;
		return false;
	}
}
