/*
 * Given the root of a binary search tree, rearrange the tree in in-order so that the leftmost node in the tree is now the root of the tree, and every node has no left child and only one right child.

 

Example 1:


Input: root = [5,3,6,2,4,null,8,1,null,null,null,7,9]
Output: [1,null,2,null,3,null,4,null,5,null,6,null,7,null,8,null,9]
Example 2:


Input: root = [5,1,7]
Output: [1,null,5,null,7]
 

Constraints:

The number of nodes in the given tree will be in the range [1, 100].
0 <= Node.val <= 1000

 */
package LeetChallengeDec;

public class Day_03_IncreasingOrderSearchTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public TreeNode increasingBST(TreeNode root) {
        return helper(root, null);
    }
    
    public TreeNode helper(TreeNode root, TreeNode next){
        if(root == null) return next;
        TreeNode res = helper(root.left, root);
        root.left = null;
        root.right = helper(root.right, next);
        return res;
    }
	
	

}
