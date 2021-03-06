/*
 * Given two strings s1 and s2, write a function to return true if s2 contains the permutation of s1. In other words, one of the first string's permutations is the substring of the second string.

 

Example 1:

Input: s1 = "ab" s2 = "eidbaooo"
Output: True
Explanation: s2 contains one permutation of s1 ("ba").
Example 2:

Input:s1= "ab" s2 = "eidboaoo"
Output: False
 

Constraints:

The input strings only contain lower case letters.
The length of both given strings is in range [1, 10,000].
 */
package LeetChallengeMay;

public class PermutationInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean checkInclusion(String s1, String s2) {
		int len1 = s1.length();
		int len2 = s2.length();
		
		if(len1 > len2) return false;
		
		int [] charSet = new int[26];
		for(int i=0;i<len1;i++) {
			charSet[s1.charAt(i)-'a']++;
		}
		
		for(int i=0;i<len2;i++) {
			charSet[s2.charAt(i)-'a']--;
			if((i-len1) >=0) {
				charSet[s2.charAt(i-len1)-'a']++;
			}
			if(allZeros(charSet)) {
				return true;
			}
		}
		return false;
	}

	private boolean allZeros(int[] charSet) {
		for(int i=0;i<charSet.length;i++) {
			if(charSet[i] !=0) {
				return false;
			}
		}
		return true;
	}
}
