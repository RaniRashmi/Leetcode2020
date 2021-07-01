/*
 * Given an m x n matrix, return all elements of the matrix in spiral order.

 

Example 1:


Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [1,2,3,6,9,8,7,4,5]
Example 2:


Input: matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
Output: [1,2,3,4,8,12,11,10,9,5,6,7]
 

Constraints:

m == matrix.length
n == matrix[i].length
1 <= m, n <= 10
-100 <= matrix[i][j] <= 100
 */
package LeetcodePatternMedium;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix_54 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public List<Integer> spiralOrder(int[][] matrix) {
		 List<Integer> result = new ArrayList<>();
		 int k=0, m = matrix.length;
		 int l = 0, n = matrix[0].length;
		 int i=0;
		 
		 while(k<m && l<n) {
			 //for top row 
			 for(i=l;i<n;i++) {
				 result.add(matrix[k][i]);
			 }
			 k++;
			 //for right
			 for(i=k;i<m;i++) {
				 result.add(matrix[i][n-1]);
			 }
			 n--;
			 //for bottom
			 if(k < m) {
				 for(i = n-1;i>=l;i--) {
					 result.add(matrix[m-1][i]);
				 }
			 }
			 m--;
			 if(l < n) {
				 for(i = m-1;i>=k;i--) {
					 result.add(matrix[i][l]);
				 }
			 }
			 l++;
		 }
		 
		 return result;
	 }
	
	

}
