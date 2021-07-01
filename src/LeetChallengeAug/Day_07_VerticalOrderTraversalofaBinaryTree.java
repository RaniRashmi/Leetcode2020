/*
 * Given a binary tree, return the vertical order traversal of its nodes values.

For each node at position (X, Y), its left and right children respectively will be at positions (X-1, Y-1) and (X+1, Y-1).

Running a vertical line from X = -infinity to X = +infinity, whenever the vertical line touches some nodes, we report the values of the nodes in order from top to bottom (decreasing Y coordinates).

If two nodes have the same position, then the value of the node that is reported first is the value that is smaller.

Return an list of non-empty reports in order of X coordinate.  Every report will have a list of values of nodes.

 

Example 1:



Input: [3,9,20,null,null,15,7]
Output: [[9],[3,15],[20],[7]]
Explanation: 
Without loss of generality, we can assume the root node is at position (0, 0):
Then, the node with value 9 occurs at position (-1, -1);
The nodes with values 3 and 15 occur at positions (0, 0) and (0, -2);
The node with value 20 occurs at position (1, -1);
The node with value 7 occurs at position (2, -2).
Example 2:



Input: [1,2,3,4,5,6,7]
Output: [[4],[2],[1,5,6],[3],[7]]
Explanation: 
The node with value 5 and the node with value 6 have the same position according to the given scheme.
However, in the report "[1,5,6]", the node value of 5 comes first since 5 is smaller than 6.
 

Note:

The tree will have between 1 and 1000 nodes.
Each node's value will be between 0 and 1000.
 
 */
package LeetChallengeAug;

public class Day_07_VerticalOrderTraversalofaBinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	   class Point {
			TreeNode root;
			int x;
			int y;
			public Point(TreeNode root, int x, int y) {
				this.root = root;
				this.x = x;
				this.y = y;
			 }
		    }
		    public List<List<Integer>> verticalTraversal(TreeNode root) {
		      List<List<Integer>> res = new ArrayList<>();
			if (root == null) 
				return res;

			Map<Integer, PriorityQueue<Point>> map = new HashMap<>();
			Queue<Point> queue = new LinkedList<>();
			queue.offer(new Point(root, 0, 0));
		    Comparator<Point> comparator = (a, b) -> {
				if (a.y == b.y) {
					return a.root.val - b.root.val;
				} else {
					return a.y - b.y;
				}
			};
			int minIdx = 0;
			int maxIdx = 0;
			while (!queue.isEmpty()) {
				Point point = queue.poll();
				root = point.root;
				map.putIfAbsent(point.x, new PriorityQueue<>(comparator));
				map.get(point.x).add(point);
				minIdx = Math.min(minIdx, point.x);
				maxIdx = Math.max(maxIdx, point.x);
				if (root.left != null)  queue.offer(new Point(root.left, point.x - 1, point.y + 1));
				if (root.right != null) queue.offer(new Point(root.right, point.x + 1, point.y + 1));
			}

			for (int i = minIdx; i <= maxIdx; i++) {
				PriorityQueue<Point> pq = map.get(i);
				List<Integer> list = new ArrayList<>();
				while (!pq.isEmpty()) {
					list.add(pq.poll().root.val);
				}
				res.add(list);
			}

			return res;
		    }
		    
		    
		}

}
