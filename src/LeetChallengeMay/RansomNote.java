/*
 * Given an arbitrary ransom note string and another string containing letters from all the magazines, write a function that will return true if the ransom note can be constructed from the magazines ; otherwise, it will return false.

Each letter in the magazine string can only be used once in your ransom note.

 

Example 1:

Input: ransomNote = "a", magazine = "b"
Output: false
Example 2:

Input: ransomNote = "aa", magazine = "ab"
Output: false
Example 3:

Input: ransomNote = "aa", magazine = "aab"
Output: true
 

Constraints:

You may assume that both strings contain only lowercase letters.
 */
package LeetChallengeMay;

public class RansomNote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static boolean canConstruct(String ransomNote, String magazine) {
		int [] charArray = new int[26];
		for(char c: magazine.toCharArray()) {
			charArray[c-'a']++;
		}
		
		for(char c: ransomNote.toCharArray()) {
			if(--charArray[c-'a']<0) {
				return false;
			}
		}
		return true;
	}

}
