/*
 * Given a string s, partition s such that every substring of the partition is a palindrome. Return all possible palindrome partitioning of s.

A palindrome string is a string that reads the same backward as forward.

 

Example 1:

Input: s = "aab"
Output: [["a","a","b"],["aa","b"]]
Example 2:

Input: s = "a"
Output: [["a"]]
 

Constraints:

1 <= s.length <= 16
s contains only lowercase English letters.
 */
package LeetChallengeDec;

import java.util.ArrayList;
import java.util.List;

public class Day_14_PalindromePartitioning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        helper(s, result, new ArrayList<String>(),0);
        return result;
	}

	private void helper(String s, List<List<String>> result, ArrayList<String> tempList, int index) {
		if(index == tempList.size()) {
			result.add(new ArrayList<>(tempList));
			return;
		}
		
		for(int i = index; i<s.length();i++) {
			String str = s.substring(index, i+1);
			if(isPalindrome(str)) {
				tempList.add(str);
				helper(s, result, tempList,i+1);
				tempList.remove(tempList.size()-1);
			}
		}
	}

	private boolean isPalindrome(String str) {
		int i= 0, j= str.length()-1;
		while(i < j) {
			if(str.charAt(i) != str.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

}
