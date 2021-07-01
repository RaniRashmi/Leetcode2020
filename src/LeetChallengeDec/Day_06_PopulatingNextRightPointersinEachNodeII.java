/*
 * Given a binary tree

struct Node {
  int val;
  Node *left;
  Node *right;
  Node *next;
}
Populate each next pointer to point to its next right node. If there is no next right node, the next pointer should be set to NULL.

Initially, all next pointers are set to NULL.

 

Follow up:

You may only use constant extra space.
Recursive approach is fine, you may assume implicit stack space does not count as extra space for this problem.

Input: root = [1,2,3,4,5,null,7]
Output: [1,#,2,3,#,4,5,7,#]
Explanation: Given the above binary tree (Figure A), your function should populate each next pointer to point to its next right node, just like in Figure B. The serialized output is in level order as connected by the next pointers, with '#' signifying the end of each level.
 

Constraints:

The number of nodes in the given tree is less than 6000.
-100 <= node.val <= 100
 */
package LeetChallengeDec;

public class Day_06_PopulatingNextRightPointersinEachNodeII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
//  public Node connect(Node root) {
//  if(root == null) return null;
//   Queue<Node> queue = new LinkedList<Node>();
//   queue.add(root);
//   queue.add(null);
  
//   while(!queue.isEmpty()){
//       Node current = queue.poll();
//       if(current == null && queue.isEmpty()){
//           return root;
//       }else if(current == null){
//           queue.add(null);
//           continue;
//       }else{
//           current.next = queue.peek();
//           if(current.left != null){
//               queue.add(current.left);
//           }
//           if(current.right != null){
//               queue.add(current.right);
//           }
//       }
//   }
//   return root;
//}
public Node connect(Node root) {

   if(root == null) return null;
   
   Node temp = root;
   
   while(temp != null){
       Node levelNode = new Node(0);
       Node current = levelNode;
       //this loop will takecare of one level
       while(temp != null){
           if(temp.left != null){
               current.next = temp.left;
               current = current.next;
           }
           if(temp.right != null){
               current.next = temp.right;
               current = current.next;
           }
           temp = temp.next;
       }
       temp = levelNode.next; // this is to update temp node in next level
   }
   
  return root;
}
	

}
