
/*
 * You're given strings J representing the types of stones that are jewels, and S representing the stones you have.  Each character in S is a type of stone you have.  You want to know how many of the stones you have are also jewels.

The letters in J are guaranteed distinct, and all characters in J and S are letters. Letters are case sensitive, so "a" is considered a different type of stone from "A".

Example 1:

Input: J = "aA", S = "aAAbbbb"
Output: 3
Example 2:

Input: J = "z", S = "ZZ"
Output: 0
Note:

S and J will consist of letters and have length at most 50.
The characters in J are distinct.
 */
package LeetChallengeMay;

import java.util.HashSet;

public class JwelsAndStones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int numJewelsInStones(String J, String S) {
        HashSet<Character> set = new HashSet<Character>();
        //why we are adding String J character to string ? bcoj they are distict
        for(char c : J.toCharArray()){
            set.add(c);
        }
        int count =0;
        //now scan string S and check wheater it is in string or not
        for(char c : S.toCharArray()){
            if(set.contains(c)){
               count++;  
            }
        }
        return count;
	}

}
