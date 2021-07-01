/*
 * Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word (last word means the last appearing word if we loop from left to right) in the string.

If the last word does not exist, return 0.

Note: A word is defined as a maximal substring consisting of non-space characters only.

Example:

Input: "Hello World"
Output: 5
 */
package LeetChallengeSept;

public class Day_15_LengthofLastWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	   public int lengthOfLastWord(String s) {
		   String str = s.trim();
		   int count = 0;
		   for(int i = str.length()-1;i>=0;i++) {
			   if(str.charAt(i) != ' ') {
				   count++;
			   }else {
				   break;
			   }
		   }
		   return count;
	   }

}
