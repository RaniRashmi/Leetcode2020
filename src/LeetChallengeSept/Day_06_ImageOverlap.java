/*
 * Two images A and B are given, represented as binary, square matrices of the same size.  (A binary matrix has only 0s and 1s as values.)

We translate one image however we choose (sliding it left, right, up, or down any number of units), and place it on top of the other image.  After, the overlap of this translation is the number of positions that have a 1 in both images.

(Note also that a translation does not include any kind of rotation.)

What is the largest possible overlap?

Example 1:

Input: A = [[1,1,0],
            [0,1,0],
            [0,1,0]]
       B = [[0,0,0],
            [0,1,1],
            [0,0,1]]
Output: 3
Explanation: We slide A to right by 1 unit and down by 1 unit.
Notes: 

1 <= A.length = A[0].length = B.length = B[0].length <= 30
0 <= A[i][j], B[i][j] <= 1
 */
package LeetChallengeSept;

public class Day_06_ImageOverlap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int largestOverlap(int[][] A, int[][] B) {
		//one matrix , total four direction can move  while other need to stable(not move).
        return Math.max(shift_count(A, B), shift_count(B, A));
    }

	private int shift_count(int[][] a, int[][] b) {
		int count = 0; int n = a.length;
		for(int x=0;x<n;x++) {
			for(int y=0;y<n;y++) {
				int temp = 0;
				for(int i = y;i<n;i++) {
					for(int j=x;j<n;j++) {
						//y is represent to row and x is representing to colom.
						if(a[i][j] == 1 && b[i-y][j-x] == 1) {
							count++;
						}
					}
				}
				count = Math.max(temp, count);
			}
		}
		return count;
	}

}
