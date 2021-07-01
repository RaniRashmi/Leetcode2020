/*
 * A string S of lowercase English letters is given. We want to partition this string into as many parts as possible so that each letter appears in at most one part, and return a list of integers representing the size of these parts.

 

Example 1:

Input: S = "ababcbacadefegdehijhklij"
Output: [9,7,8]
Explanation:
The partition is "ababcbaca", "defegde", "hijhklij".
This is a partition so that each letter appears in at most one part.
A partition like "ababcbacadefegde", "hijhklij" is incorrect, because it splits S into less parts.
 

Note:

S will have length in range [1, 500].
S will consist of lowercase English letters ('a' to 'z') only.
 */
package LeetChallengeSept;

import java.util.ArrayList;
import java.util.List;

public class Day_04_PartitionLabels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public List<Integer> partitionLabels(String S) {
		List<Integer> partitionLength = new ArrayList<>();
		int [] lastIndex = new int[26];
		for(int i=0;i<S.length();i++) {
			lastIndex[S.charAt(i)-'a'] = i;
		}
		int i =0;
		while(i < S.length()) {
			int end = lastIndex[S.charAt(i)-'a'];
			int j = i;
			while(j != end) {
				end = Math.max(end, lastIndex[S.charAt(j)-'a']);
			}
			partitionLength.add(j-i+1);
			i = j+1; // i will start after j
		}
		return partitionLength;
	}

}
