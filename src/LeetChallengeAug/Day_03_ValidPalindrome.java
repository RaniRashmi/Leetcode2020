/*
 * Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

Note: For the purpose of this problem, we define empty string as valid palindrome.

Example 1:

Input: "A man, a plan, a canal: Panama"
Output: true
Example 2:

Input: "race a car"
Output: false
 

Constraints:

s consists only of printable ASCII characters.
 */
package LeetChallengeAug;

public class Day_03_ValidPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public boolean isPalindrome(String s) {
		 int left = 0;
		 int right = s.length()-1;
		 
		 while(left < right) {
			 if(!isAlphanumeric(s.charAt(left))) {
				 left++;
			 } else if(!isAlphanumeric(s.charAt(right))) {
				 right--;
			 } else if(lower(s.charAt(left)) != lower(s.charAt(right))) {
				 return false;
			 }else {
				 left++;
				 right--;
			 }
		 }
		 return true;
	 }

	private char lower(char c) {
		if(('a' <= c && c <= 'z') || ('0' <= c && c <= '9')) {
			return c;
		}
		return (char)((int)c+32);
	}

	private boolean isAlphanumeric(char c) {
	    return (('a' <= c && c <= 'z') || ('A' <= c && c <= 'Z') || ('0' <= c && c <= '9'));	
	}

}
