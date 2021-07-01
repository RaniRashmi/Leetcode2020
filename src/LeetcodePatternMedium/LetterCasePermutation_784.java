/*
 * Given a string S, we can transform every letter individually to be lowercase or uppercase to create another string.

Return a list of all possible strings we could create. You can return the output in any order.

 

Example 1:

Input: S = "a1b2"
Output: ["a1b2","a1B2","A1b2","A1B2"]
Example 2:

Input: S = "3z4"
Output: ["3z4","3Z4"]
Example 3:

Input: S = "12345"
Output: ["12345"]
Example 4:

Input: S = "0"
Output: ["0"]
 

Constraints:

S will be a string with length between 1 and 12.
S will consist only of letters or digits.
 */
package LeetcodePatternMedium;

import java.util.ArrayList;
import java.util.List;

public class LetterCasePermutation_784 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public List<String> letterCasePermutation(String S) {
		List<String> result = new ArrayList<>();
		findAllPermutation(result, S, 0);
		return result;
	}
	private void findAllPermutation(List<String> result, String s, int index) {
		result.add(s);
		for(int i=index;i<s.length();i++) {
			char [] arr = s.toCharArray();
			if(Character.isLetter(arr[i])) {
				if(Character.isUpperCase(s.charAt(i))) {
					arr[i] = Character.toLowerCase(s.charAt(i));
					findAllPermutation(result,String.valueOf(arr) , i+1);
				}else {
					arr[i] = Character.toUpperCase(s.charAt(i));
					findAllPermutation(result, String.valueOf(arr), i+1);
				}
			}
		}
	}
	 
	 

}
