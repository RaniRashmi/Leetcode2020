/*
 * Given a 2D board and a word, find if the word exists in the grid.

The word can be constructed from letters of sequentially adjacent cell, where "adjacent" cells are those horizontally or vertically neighboring. The same letter cell may not be used more than once.

Example:

board =
[
  ['A','B','C','E'],
  ['S','F','C','S'],
  ['A','D','E','E']
]

Given word = "ABCCED", return true.
Given word = "SEE", return true.
Given word = "ABCB", return false.
 

Constraints:

board and word consists only of lowercase and uppercase English letters.
1 <= board.length <= 200
1 <= board[i].length <= 200
1 <= word.length <= 10^3
 */
package LeetChallengeJuly;

public class WordSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public boolean exist(char[][] board, String word) {
		
		for(int i=0;i<board.length;i++) {
			for(int j=0;j<board[0].length;j++) {
				if(board[i][j] == word.charAt(0) && dfs(board, i, j, 0, word)) {
					return true;
				}
			}
		}
		return false;
	}

	private boolean dfs(char[][] board, int i, int j, int count, String word) {
		if(count == word.length()) {
			return true;
		}
		
		if(i <0 || i>= board.length || j<0  || j> board[0].length || board[i][j] != word.charAt(count)) {
			return false;
		}
		char temp = board[i][j]; 
		
		board[i][j] = '*'; // so that it will not revisited.
		boolean flag = dfs(board, i-1, j, count+1, word) || 
                dfs(board, i, j-1, count+1, word) ||
                    dfs(board, i+1, j, count+1, word) ||
                        dfs(board, i, j+1, count+1, word);
		board[i][j] = temp;  //back track                            
	  return flag;
	}

}
