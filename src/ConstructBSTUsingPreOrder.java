/*
 * Return the root node of a binary search tree that matches the given preorder traversal.

(Recall that a binary search tree is a binary tree where for every node, any descendant of node.left has a value < node.val, and any descendant of node.right has a value > node.val.  Also recall that a preorder traversal displays the value of the node first, then traverses node.left, then traverses node.right.)

 
 */
class TreeNode{
	int val;
	TreeNode left, right;
	public TreeNode(int val) {
		this.val = val;
	}
}
public class ConstructBSTUsingPreOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public TreeNode bstFromPreorder(int[] preorder) {
	       return buildBST(preorder, 0, preorder.length-1);
	 }

	private TreeNode buildBST(int[] preorder, int left, int right) {
		if(left > right) return null;
		TreeNode root = new TreeNode(preorder[left]);
		if(left == right) {
			return root;
		}
		int index = left+1;
		/*
		 *  [4,2] -> index <= right
		 */
		while(index <= right && preorder[index] < preorder[left]) {
			index++;
		}
		root.left = buildBST(preorder, left+1, index-1);
		root.right = buildBST(preorder, index, right);
		
		return root;
	}
	
	

}
