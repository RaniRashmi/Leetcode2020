/*
 * Given a binary tree, write a function to get the maximum width of the given tree. The width of a tree is the maximum width among all levels. The binary tree has the same structure as a full binary tree, but some nodes are null.

The width of one level is defined as the length between the end-nodes (the leftmost and right most non-null nodes in the level, where the null nodes between the end-nodes are also counted into the length calculation.

Example 1:

Input: 

           1
         /   \
        3     2
       / \     \  
      5   3     9 

Output: 4
Explanation: The maximum width existing in the third level with the length 4 (5,3,null,9).
Example 2:

Input: 

          1
         /  
        3    
       / \       
      5   3     

Output: 2
Explanation: The maximum width existing in the third level with the length 2 (5,3).
Example 3:

Input: 

          1
         / \
        3   2 
       /        
      5      

Output: 2
Explanation: The maximum width existing in the second level with the length 2 (3,2).
Example 4:

Input: 

          1
         / \
        3   2
       /     \  
      5       9 
     /         \
    6           7
Output: 8
Explanation:The maximum width existing in the fourth level with the length 8 (6,null,null,null,null,null,null,7).

 */
package LeetChallengeJuly;

import java.util.Deque;

public class MaximumWidthofBinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public int widthOfBinaryTree(TreeNode root) {
	        if(root == null) return 0;
	        Deque<TreeNode> deque = new LinkedList<>();
	        deque.add(root);
	        int max = 1;
	        
	        while(!deque.isEmpty()){
	            while(!deque.isEmpty() && deque.getFirst() == null) deque.removeFirst();
	            while(!deque.isEmpty() && deque.getLast() == null) deque.removeLast();
	            
	            int size = deque.size();
	            max = Math.max(max, size);
	            
	            for(int i=0;i<size;i++){
	                TreeNode temp = deque.poll();
	                if(temp == null){
	                    deque.add(null);
	                    deque.add(null);
	                }else{
	                    deque.add(temp.left);
	                    deque.add(temp.right);
	                }
	            }
	        }
	        return max;
	    }

}
