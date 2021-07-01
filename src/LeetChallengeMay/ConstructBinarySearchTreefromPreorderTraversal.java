/*
 * Return the root node of a binary search tree that matches the given preorder traversal.

(Recall that a binary search tree is a binary tree where for every node, any descendant of node.left has a value < node.val, and any descendant of node.right has a value > node.val.  Also recall that a preorder traversal displays the value of the node first, then traverses node.left, then traverses node.right.)

It's guaranteed that for the given test cases there is always possible to find a binary search tree with the given requirements.

Example 1:

Input: [8,5,1,7,10,12]
Output: [8,5,10,1,7,null,12]

 */
package LeetChallengeMay;

public class ConstructBinarySearchTreefromPreorderTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    public TreeNode bstFromPreorder(int[] preorder) {
        return buildBST(preorder, 0, preorder.length-1);
     }
     
     public TreeNode buildBST(int [] preorder, int left, int right){
         if(left > right) return null;
         TreeNode root = new TreeNode(preorder[left]);
         if(left == right) return root;
         int index = left+1;
         while(index <= right && preorder[index] < preorder[left]){
             index++;
         }
         root.left = buildBST(preorder, left+1, index-1);
         root.right = buildBST(preorder, index, right);
         
         return root;
     }

}
