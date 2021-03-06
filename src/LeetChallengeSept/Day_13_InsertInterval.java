/*
 * Given a set of non-overlapping intervals, insert a new interval into the intervals (merge if necessary).

You may assume that the intervals were initially sorted according to their start times.

Example 1:

Input: intervals = [[1,3],[6,9]], newInterval = [2,5]
Output: [[1,5],[6,9]]
Example 2:

Input: intervals = [[1,2],[3,5],[6,7],[8,10],[12,16]], newInterval = [4,8]
Output: [[1,2],[3,10],[12,16]]
Explanation: Because the new interval [4,8] overlaps with [3,5],[6,7],[8,10].
NOTE: input types have been changed on April 15, 2019. Please reset to default code definition to get new method signature.
 */
package LeetChallengeSept;

public class Day_13_InsertInterval {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public int[][] insert(int[][] intervals, int[] newInterval) {
	        List<int[]> result = new ArrayList();
	        int i = 0, n = intervals.length;
	        while(i < n && intervals[i][1] < newInterval[0]) result.add(intervals[i++]);
	        
	        int[] mI = newInterval;
	        while(i < n && intervals[i][0] <= newInterval[1]){
	            mI[0] = Math.min(mI[0], intervals[i][0]);
	            mI[1] = Math.max(mI[1], intervals[i++][1]);
	        }
	        result.add(mI);
	        
	        while(i < n) result.add(intervals[i++]);
	        
	        return result.toArray(new int[result.size()][2]);
	    }

}
