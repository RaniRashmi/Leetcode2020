/*
 * Given a string s, the power of the string is the maximum length of a non-empty substring that contains only one unique character.

Return the power of the string.

 

Example 1:

Input: s = "leetcode"
Output: 2
Explanation: The substring "ee" is of length 2 with the character 'e' only.
Example 2:

Input: s = "abbcccddddeeeeedcba"
Output: 5
Explanation: The substring "eeeee" is of length 5 with the character 'e' only.
Example 3:

Input: s = "triplepillooooow"
Output: 5
Example 4:

Input: s = "hooraaaaaaaaaaay"
Output: 11
Example 5:

Input: s = "tourist"
Output: 1
 

Constraints:

1 <= s.length <= 500
s contains only lowercase English letters.
 */
package LeetChallengeNov;

public class Prob_03_ConsecutiveCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int maxPower(String s) {
		int count =0;
		char pre =' ';
		int maxCount =0;
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			if(c == pre) {
				count++;
			}else {
				count=1;
				pre = c;
			}
			maxCount = Math.max(maxCount, count);
		}
		return maxCount;
	}

}
