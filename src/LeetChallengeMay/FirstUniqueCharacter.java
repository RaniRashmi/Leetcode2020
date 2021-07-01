/*
 * Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.

Examples:

s = "leetcode"
return 0.

s = "loveleetcode",
return 2.
Note: You may assume the string contain only lowercase letters.
 */
package LeetChallengeMay;

public class FirstUniqueCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int firstUniqChar(String s) {
		int len = s.length();
		int [] count = new int[26];
		for(char c : s.toCharArray()) {
			count[c-'a']++;
		}
		for(int i=0;i<len;i++) {
			if(count[s.charAt(i)-'a'] == 1) return i;
		}
		return -1;
	}
}
