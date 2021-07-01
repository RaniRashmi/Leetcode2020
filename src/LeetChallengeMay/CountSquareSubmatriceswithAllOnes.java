/*
 * Given a m * n matrix of ones and zeros, return how many square submatrices have all ones.

 

Example 1:

Input: matrix =
[
  [0,1,1,1],
  [1,1,1,1],
  [0,1,1,1]
]
Output: 15
Explanation: 
There are 10 squares of side 1.
There are 4 squares of side 2.
There is  1 square of side 3.
Total number of squares = 10 + 4 + 1 = 15.
Example 2:

Input: matrix = 
[
  [1,0,1],
  [1,1,0],
  [1,1,0]
]
Output: 7
Explanation: 
There are 6 squares of side 1.  
There is 1 square of side 2. 
Total number of squares = 6 + 1 = 7.
 

Constraints:

1 <= arr.length <= 300
1 <= arr[0].length <= 300
0 <= arr[i][j] <= 1
 */
package LeetChallengeMay;

public class CountSquareSubmatriceswithAllOnes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int countSquares(int[][] matrix) {
		int squarecount = 0;
		int n = matrix.length; int m = matrix[0].length;
		int [][] dp = new int[n][m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(matrix[i][j] ==1) {
					squarecount += square(matrix, i, j,dp);
				}
			}
		}
		return squarecount;
	}

	private int square(int[][] matrix, int i, int j, int[][] dp) {
		if(i < 0 || i>= matrix.length || j<0 || j>=matrix[0].length || matrix[i][j] ==0){
            return 0;
        }
		
		if(dp[i][j] != 0) return dp[i][j];
		int count =0;
		int left = square(matrix,i, j+1,dp); int down = square(matrix, i+1,j,dp); 
        int diagonal = square(matrix,i+1,j+1,dp);
        
        count += 1+ Math.min(left , Math.min(down, diagonal));
        dp[i][j] = count;
		return dp[i][j];
	}
	
	

}
