
public class DiameterOfABinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public int diameterOfBinaryTree(TreeNode root) {
	        if(root ==  null) return 0;
	        int leftHeight = getHeight(root.left);
	        int rightHeight = getHeight(root.right);
	        
	        int leftDiameter = diameterOfBinaryTree(root.left);
	        int rightDiameter = diameterOfBinaryTree(root.right);
	        
	        return Math.max(leftHeight+rightHeight, Math.max(leftDiameter, rightDiameter));
	        
	    }
	    
	    public int getHeight(TreeNode node){
	        if(node == null) return 0;
	        return 1+ Math.max(getHeight(node.left), getHeight(node.right));
	    }

}
