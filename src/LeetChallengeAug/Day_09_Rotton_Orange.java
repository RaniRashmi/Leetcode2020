/*
 * In a given grid, each cell can have one of three values:

the value 0 representing an empty cell;
the value 1 representing a fresh orange;
the value 2 representing a rotten orange.
Every minute, any fresh orange that is adjacent (4-directionally) to a rotten orange becomes rotten.

Return the minimum number of minutes that must elapse until no cell has a fresh orange.  If this is impossible, return -1 instead.

 

Example 2:

Input: [[2,1,1],[0,1,1],[1,0,1]]
Output: -1
Explanation:  The orange in the bottom left corner (row 2, column 0) is never rotten, because rotting only happens 4-directionally.
Example 3:

Input: [[0,2]]
Output: 0
Explanation:  Since there are already no fresh oranges at minute 0, the answer is just 0.
 

Note:

1 <= grid.length <= 10
1 <= grid[0].length <= 10
grid[i][j] is only 0, 1, or 2.
 */
package LeetChallengeAug;

public class Day_09_Rotton_Orange {

	static class Pair{
        int x; int y;
        public Pair(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
    public int orangesRotting(int[][] grid) {
        Queue<Pair> queue = new LinkedList<>();
        int total =0, rotton =0, time = 0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j] == 1 || grid[i][j] ==2) total++;
                if(grid[i][j] == 2){
                    queue.offer(new Pair(i,j));
                }
            }
        }
        
        if(total ==0) return 0;
        while(!queue.isEmpty()){
            int size = queue.size();
            rotton += size;
            if(rotton == total) return time;
            time++;
            
            for(int i=0;i<size;i++){
                Pair temp = queue.peek();
                // check the boundary and 1 
                if(temp.x+1 < grid.length && grid[temp.x+1][temp.y] == 1){
                    grid[temp.x+1][temp.y] = 2;
                    queue.offer(new Pair(temp.x+1,temp.y));
                }
                
                if(temp.x-1 >= 0 && grid[temp.x-1][temp.y] == 1){
                    grid[temp.x-1][temp.y] = 2;
                    queue.offer(new Pair(temp.x-1,temp.y));
                }
                
                if(temp.y+1 < grid[0].length && grid[temp.x][temp.y+1] == 1){
                    grid[temp.x][temp.y+1]  = 2;
                    queue.offer(new Pair(temp.x,temp.y+1));
                }
                
                if(temp.y-1 >= 0 && grid[temp.x][temp.y-1] == 1){
                    grid[temp.x][temp.y-1] = 2;
                    queue.offer(new Pair(temp.x,temp.y-1));
                }
                queue.poll();
            }
        }
        return -1;

}
