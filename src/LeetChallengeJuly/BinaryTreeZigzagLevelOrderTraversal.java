/*
 * Given a binary tree, return the zigzag level order traversal of its nodes' values. (ie, from left to right, then right to left for the next level and alternate between).

For example:
Given binary tree [3,9,20,null,null,15,7],
    3
   / \
  9  20
    /  \
   15   7
return its zigzag level order traversal as:
[
  [3],
  [20,9],
  [15,7]
]
 */
package LeetChallengeJuly;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeZigzagLevelOrderTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        
        if(root == null) return result;					
		Stack<TreeNode> s1 = new Stack<TreeNode>();
		Stack<TreeNode> s2 = new Stack<TreeNode>();
        
        s1.push(root);
		List<Integer> list = new ArrayList<>();
		while(!s1.isEmpty() || !s2.isEmpty()) {
			while(!s1.isEmpty()) {
				TreeNode temp = s1.peek();
				s1.pop();
				list.add(temp.val);
				
				if(temp.left != null) {
					s2.push(temp.left);
				}
				if(temp.right != null) {
					s2.push(temp.right);
				}
               
			}
            
            if(!list.isEmpty()){
                 result.add(new ArrayList<>(list));
            }
            list.clear();
			
			while(!s2.isEmpty()) {
				TreeNode temp = s2.peek();
				s2.pop();
				list.add(temp.val);
				
				if(temp.right != null) {
					s1.push(temp.right);
				}
				if(temp.left != null) {
					s1.push(temp.left);
				}
			}
            
             if(!list.isEmpty()){
                result.add(new ArrayList<>(list));
            }
            list.clear();
		}
        return result;
    }

}
