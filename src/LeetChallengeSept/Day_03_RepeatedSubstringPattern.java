/*
 * Given a non-empty string check if it can be constructed by taking a substring of it and appending multiple copies of the substring together. You may assume the given string consists of lowercase English letters only and its length will not exceed 10000.

 

Example 1:

Input: "abab"
Output: True
Explanation: It's the substring "ab" twice.
Example 2:

Input: "aba"
Output: False
Example 3:

Input: "abcabcabcabc"
Output: True
Explanation: It's the substring "abc" four times. (And the substring "abcabc" twice.)
 */
package LeetChallengeSept;

public class Day_03_RepeatedSubstringPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public boolean repeatedSubstringPattern(String s) {
        int length = s.length();
        for(int i= length/2;i>=1;i--){
            if(length%i == 0){
                int repeated = length/i;
                String str = s.substring(0,i);
                StringBuilder sb = new StringBuilder();
                for(int j=0;j<repeated;j++){
                    sb.append(str);
                }
                if(sb.toString().equals(s)){
                    return true;
                }
            }
        }
        return false;
    }

}
