/*
 * Given two binary search trees root1 and root2.

Return a list containing all the integers from both trees sorted in ascending order.

 

Example 1:


Input: root1 = [2,1,4], root2 = [1,0,3]
Output: [0,1,1,2,3,4]
Example 2:

Input: root1 = [0,-10,10], root2 = [5,1,7,0,2]
Output: [-10,0,0,1,2,5,7,10]
Example 3:

Input: root1 = [], root2 = [5,1,7,0,2]
Output: [0,1,2,5,7]
Example 4:

Input: root1 = [0,-10,10], root2 = []
Output: [-10,0,10]
Example 5:


Input: root1 = [1,null,8], root2 = [8,1]
Output: [1,1,8,8]
 

Constraints:

Each tree has at most 5000 nodes.
Each node's value is between [-10^5, 10^5].
 */
package LeetChallengeSept;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import javax.swing.tree.TreeNode;

public class Day_05_AllElementsinTwoBinarySearchTrees {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
		Stack<TreeNode> s1 = new Stack<TreeNode>();
		Stack<TreeNode> s2 = new Stack<TreeNode>();
		List<Integer> list = new ArrayList<Integer>();
		while(root1 != null || root2 != null || s1.isEmpty() || s2.isEmpty()) {
			while(root1 != null) {
				s1.push(root1.val);
				root1 = root1.left;
			}
			while(root1 != null) {
				s2.push(root2.val);
				root2 = root2.val;
			}
			
			if(s2.isEmpty() || (!s1.isEmpty() && s1.peek().val <= s2.peek().val)) {
				root1 = s1.pop();
				list.add(root1.val);
				root1 = root1.right;
			}else {
				root2 = s2.pop();
				list.add(root2.val);
				root2 = root2.right;
			}
		}
		return list;
	}

}
