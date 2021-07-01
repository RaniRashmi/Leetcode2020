/*
 * Given a list of non-overlapping axis-aligned rectangles rects, write a function pick which randomly and uniformily picks an integer point in the space covered by the rectangles.

Note:

An integer point is a point that has integer coordinates. 
A point on the perimeter of a rectangle is included in the space covered by the rectangles. 
ith rectangle = rects[i] = [x1,y1,x2,y2], where [x1, y1] are the integer coordinates of the bottom-left corner, and [x2, y2] are the integer coordinates of the top-right corner.
length and width of each rectangle does not exceed 2000.
1 <= rects.length <= 100
pick return a point as an array of integer coordinates [p_x, p_y]
pick is called at most 10000 times.
Example 1:

Input: 
["Solution","pick","pick","pick"]
[[[[1,1,5,5]]],[],[],[]]
Output: 
[null,[4,1],[4,1],[3,3]]
Example 2:

Input: 
["Solution","pick","pick","pick","pick","pick"]
[[[[-2,-2,-1,-1],[1,0,3,0]]],[],[],[],[],[]]
Output: 
[null,[-1,-2],[2,0],[-2,-1],[3,0],[-2,-2]]
Explanation of Input Syntax:

The input is two lists: the subroutines called and their arguments. Solution's constructor has one argument, the array of rectangles rects. pick has no arguments. Arguments are always wrapped with a list, even if there aren't any.

 
 */
package LeetChallengeAug;

public class Day_22_RandomPointinNonoverlappingRectangles {
	int[][] rects;
    Random r=new Random();
    int total=0;
    List<Integer> sum=new ArrayList<>();
    public Solution(int[][] rects) {
        this.rects=rects;
        for(int[] rec:rects){
            total+=(rec[2]-rec[0]+1)*(rec[3]-rec[1]+1);
            sum.add(total);
        }
    }
    
    public int[] pick() {
         int target= r.nextInt(total);
        int lo=0,hi=rects.length-1;
        while(lo<hi){
            int mid = lo  + (hi - lo)/2;
            
            if(target>=sum.get(mid)) lo = mid+1;
            else hi=mid;
        }
        int[] rect=rects[lo];
        int x1=rect[0];
        int y1=rect[1];
        int x2=rect[2];
        int y2=rect[3];
        int x=r.nextInt(x2-x1+1);
        int y=r.nextInt(y2-y1+1);
        return new int[]{x1+x,y1+y};
    }
}
