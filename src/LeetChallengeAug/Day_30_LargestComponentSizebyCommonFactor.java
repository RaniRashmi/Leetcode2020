/*
 * Given a non-empty array of unique positive integers A, consider the following graph:

There are A.length nodes, labelled A[0] to A[A.length - 1];
There is an edge between A[i] and A[j] if and only if A[i] and A[j] share a common factor greater than 1.
Return the size of the largest connected component in the graph.

 

Example 1:

Input: [4,6,15,35]
Output: 4

Example 2:

Input: [20,50,9,63]
Output: 2

Example 3:

Input: [2,3,6,7,4,12,21,39]
Output: 8

Note:

1 <= A.length <= 20000
1 <= A[i] <= 100000
 */
package LeetChallengeAug;

public class Day_30_LargestComponentSizebyCommonFactor {
	int find (int x, int[] parent){
        if(parent[x]==-1)
            return x;
        parent[x] = find(parent[x], parent);
        return parent[x];
    }
    
    void union(int x, int y, int[] parent){
        int xp = find(x, parent);
        int yp = find(y, parent);
        if(xp != yp)
            parent[yp] = xp;
    }
    public int largestComponentSize(int[] A) {
        int n = A.length;
        int[] parent = new int[100001];
        for(int i = 0; i < 100001; ++i)
            parent[i] = -1;
        
           for(int i =0; i <n; i++){
            for(int k = 2; k <= Math.sqrt(A[i]); ++k){
                if(A[i]% k == 0){
                    union(A[i], k, parent);
                    union(A[i], A[i]/k, parent);
                }
            }
        }
        
        int count = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i =0; i <n; i++){
            int p = find(A[i], parent);
            count = Math.max(count, 1 + hm.getOrDefault(p, 0));
            hm.put(p, 1 + hm.getOrDefault(p, 0));
        }
        return count;
    }
	
}
