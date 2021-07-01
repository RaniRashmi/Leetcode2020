/*
 * Given inorder and postorder traversal of a tree, construct the binary tree.

Note:
You may assume that duplicates do not exist in the tree.

For example, given

inorder = [9,3,15,20,7]
postorder = [9,15,7,20,3]
Return the following binary tree:

    3
   / \
  9  20
    /  \
   15   7
 */
package LeetChallengeJuly;

public class ConstructBinaryTreefromInorderandPostorderTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public TreeNode buildTree(int[] inorder, int[] postorder) {
		 int len = inorder.length;
		 return helper(inorder,postorder,0, len-1, 0, len-1);
	 }

	private TreeNode helper(int[] inorder, int[] postorder, int inStart, int inEnd, int postStart, int postEnd) {
		if(inStart > inEnd) return null;
		
		int rootVal = postorder[postEnd];
		TreeNode root = new TreeNode(rootVal);
		
		int rootIndex = inStart;
		for(;rootIndex<=inEnd;rootIndex++) {
			if(inorder[rootIndex] == rootVal) {
				break;
			}
		}
		
		int leftTreeSize = rootIndex - inStart;
		int rightTreeSize = inEnd - rootIndex;
		
		root.left = helper(inorder,postorder,inStart,rootIndex -1, postStart, postStart+leftTreeSize-1);
		root.right =  helper(inorder,postorder,rootIndex+1,inEnd , postEnd-rightTreeSize, postEnd-1);
		return null;
	}

}
