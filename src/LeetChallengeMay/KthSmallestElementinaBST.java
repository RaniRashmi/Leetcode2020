/*
 * Given a binary search tree, write a function kthSmallest to find the kth smallest element in it.

 

Example 1:

Input: root = [3,1,4,null,2], k = 1
   3
  / \
 1   4
  \
   2
Output: 1
Example 2:

Input: root = [5,3,6,2,4,null,null,1], k = 3
       5
      / \
     3   6
    / \
   2   4
  /
 1
Output: 3
Follow up:
What if the BST is modified (insert/delete operations) often and you need to find the kth smallest frequently? How would you optimize the kthSmallest routine?

 

Constraints:

The number of elements of the BST is between 1 to 10^4.
You may assume k is always valid, 1 ≤ k ≤ BST's total elements.
 */
package LeetChallengeMay;

public class KthSmallestElementinaBST {

	public class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(){}
		TreeNode(int val){
			this.val = val;
		}
		TreeNode(int val, TreeNode left, TreeNode right){
			this.val = val;
			this.left = left;
			this.right = right;
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int kthSmallest(TreeNode root, int k) {
		int [] count = new int[2];
		//0 th index is for saving kth  and 1 index is used for value at kth position
		inorder(root, count,k);
		return count[1];
	}
	
	public void inorder(TreeNode node, int [] count, int k) {
		if(node == null) return;
		inorder(node.left, count, k);
		if(++count[0] ==k) {
			count[1] = node.val;
		}
		inorder(node.right, count, k);
	}

}
