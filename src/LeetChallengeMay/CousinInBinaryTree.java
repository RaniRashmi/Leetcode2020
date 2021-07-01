/*
 * In a binary tree, the root node is at depth 0, and children of each depth k node are at depth k+1.

Two nodes of a binary tree are cousins if they have the same depth, but have different parents.

We are given the root of a binary tree with unique values, and the values x and y of two different nodes in the tree.

Return true if and only if the nodes corresponding to the values x and y are cousins.

 

Example 1:


Input: root = [1,2,3,4], x = 4, y = 3
Output: false
Example 2:


Input: root = [1,2,3,null,4,null,5], x = 5, y = 4
Output: true
Example 3:



Input: root = [1,2,3,null,4], x = 2, y = 3
Output: false
 

Note:

The number of nodes in the tree will be between 2 and 100.
Each node has a unique integer value from 1 to 100.
 */
package LeetChallengeMay;

public class CousinInBinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	  class Pair{
	        TreeNode parent;
	        int level;
	        
	        public Pair(TreeNode parent, int level){
	            this.parent = parent;
	            this.level = level;
	        }
	    }
	    public boolean isCousins(TreeNode root, int x, int y) {
	        Pair pair1 = helper(root, x,null,0);
	        Pair pair2 = helper(root, y,null,0);
	        
	        
	        if(pair1.level == pair2.level && pair1.parent != pair2.parent){
	            return true;
	        }
	       return false;
	    }
	    
	    public Pair helper(TreeNode root, int val,TreeNode parent, int level){
	        if(root == null) return null;
	        if(root.val == val){
	            return new Pair(parent , level);
	        }
	        
	        Pair leftPair = helper(root.left, val, root,level+1);
	        Pair rightPair = helper(root.right, val, root, level+1);
	        
	        return leftPair ==null?rightPair:leftPair ;
	    }

}
