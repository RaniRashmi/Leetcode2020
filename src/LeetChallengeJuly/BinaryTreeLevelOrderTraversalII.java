/*
 * Given a binary tree, return the bottom-up level order traversal of its nodes' values. (ie, from left to right, level by level from leaf to root).

For example:
Given binary tree [3,9,20,null,null,15,7],
    3
   / \
  9  20
    /  \
   15   7
return its bottom-up level order traversal as:
[
  [15,7],
  [9,20],
  [3]
]
 */
package LeetChallengeJuly;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversalII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public List<List<Integer>> levelOrderBottom(TreeNode root) {
	        List<List<Integer>> result = new ArrayList<>();
	        if(root == null){
	            return result;
	        }
	        Queue<TreeNode> queue = new LinkedList<TreeNode>();
	        queue.add(root);
	        
	        while(!queue.isEmpty()){
	            ArrayList<Integer> list = new ArrayList<>();
	            int size = queue.size();
	            for(int i=0;i<size;i++){
	                TreeNode temp = queue.poll();
	                list.add(temp.val);
	                if(temp.left != null){
	                    queue.add(temp.left);
	                }
	                if(temp.right != null){
	                    queue.add(temp.right);
	                }
	            }
	            result.add(0,list);
	        }
	        return result;
	    }

}
