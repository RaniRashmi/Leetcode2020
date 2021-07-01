/*
 * Given a 2d grid map of '1's (land) and '0's (water), count the number of islands.
 *  An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are all surrounded by water.
 * Input:
	11110
	11010
	11000
	00000
	
	Output: 1
 */
public class NoOfIsland {

	public static void main(String[] args) {
		char [][] grid = {{'1', '1', '0', '0', '0'},{'1', '1', '0', '0', '0'},{'0','0','1','0','0'},{'0','0','0','1','1'}};
		int count = numIslands(grid);
		System.out.println(count);
	}
	
	public static int numIslands(char[][] grid) {
		int noOfIsland = 0;
		for(int i=0;i<grid.length;i++) {
			for(int j=0;j<grid[i].length;j++) {
				if(grid[i][j] =='1') {
					 noOfIsland += dfs(grid, i, j);
				}
			}
		}
		return noOfIsland;
	}

	private static int dfs(char[][] grid, int i, int j) {
		if(i < 0 || i>= grid.length || j <0 || j >= grid[i].length || grid[i][j] == '0') {
			return 0;
		}
		grid[i][j] = '0';
		dfs(grid, i+1, j);
		dfs(grid, i-1, j);
		dfs(grid, i, j+1);
		dfs(grid, i, j-1);
		return 1;
	}

}
