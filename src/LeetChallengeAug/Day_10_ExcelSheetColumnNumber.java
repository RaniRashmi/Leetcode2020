/*
 * Given a column title as appear in an Excel sheet, return its corresponding column number.

For example:

    A -> 1
    B -> 2
    C -> 3
    ...
    Z -> 26
    AA -> 27
    AB -> 28 
    ...
Example 1:

Input: "A"
Output: 1
Example 2:

Input: "AB"
Output: 28
Example 3:

Input: "ZY"
Output: 701
 

Constraints:

1 <= s.length <= 7
s consists only of uppercase English letters.
s is between "A" and "FXSHRXW".
 */
package LeetChallengeAug;

public class Day_10_ExcelSheetColumnNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int titleToNumber(String s) {
        int result = 0;
        int p=0;
        for(int i=s.length()-1;i>=0;i--){
            char c = s.charAt(i);
            int val = (int)c - 65 +1;
            result += val*Math.pow(26, p);
            p++;
        }
        return result;
    }

}
