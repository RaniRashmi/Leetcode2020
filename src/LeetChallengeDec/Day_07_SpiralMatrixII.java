/*
 * Given a positive integer n, generate an n x n matrix filled with elements from 1 to n2 in spiral order.

 

Example 1:


Input: n = 3
Output: [[1,2,3],[8,9,4],[7,6,5]]
Example 2:

Input: n = 1
Output: [[1]]
 

Constraints:

1 <= n <= 20
 */
package LeetChallengeDec;

public class Day_07_SpiralMatrixII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public int[][] generateMatrix(int n) {
	        int [][] matrix = new int[n][n];

	        
	        int k =0, m1= n;
	        int l = 0, n1 = n;
	        int i=0;
	        int value = 1;
	        while(k<m1 && l<n1){
	            for(i=l;i<n1;i++){
	                matrix[k][i] = value++;
	            }
	            k++;
	            for(i=k;i<m1;i++){
	              matrix[i][n1-1] = value++;
	            }
	            n1--;
	            if (k < m1) { 
	              for(i=n1-1;i>=l;i--){
	                matrix[m1-1][i] = value++;
	              }
	              m1--;
	            }
	            if (l < n1) {
	                for(i=m1-1;i>=k;i--){
	                   matrix[i][l] = value++;
	                }
	                l++;
	            }
	        }
	        return matrix;
	    }

}
