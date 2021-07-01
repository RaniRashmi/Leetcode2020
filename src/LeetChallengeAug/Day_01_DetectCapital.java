/*
 * Given a word, you need to judge whether the usage of capitals in it is right or not.

We define the usage of capitals in a word to be right when one of the following cases holds:

All letters in this word are capitals, like "USA".
All letters in this word are not capitals, like "leetcode".
Only the first letter in this word is capital, like "Google".
Otherwise, we define that this word doesn't use capitals in a right way.
 

Example 1:

Input: "USA"
Output: True
 

Example 2:

Input: "FlaG"
Output: False
 

Note: The input will be a non-empty word consisting of uppercase and lowercase latin letters.
 */
package LeetChallengeAug;

public class Day_01_DetectCapital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public boolean detectCapitalUse(String word) {
	        int len = word.length();
	        if(len ==0) return false;
	        int count=0;
	        for(int i=0;i<len;i++){
	            char ch = word.charAt(i);
	            if(ch >= 65 && ch < 91){
	                count++;
	            }
	        }
	        if(count == len) return true;
	        if(count == 0) return true;
	        if(count == 1 && (word.charAt(0)>=65 && word.charAt(0) < 91)) return true;
	        return false;
	    }

}
