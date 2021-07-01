/*
 * Given a string which consists of lowercase or uppercase letters, find the length of the longest palindromes that can be built with those letters.

This is case sensitive, for example "Aa" is not considered a palindrome here.

Note:
Assume the length of given string will not exceed 1,010.

Example:

Input:
"abccccdd"

Output:
7

Explanation:
One longest palindrome that can be built is "dccaccd", whose length is 7.
 */
package LeetChallengeAug;

public class Day_14_Longest_palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int longestPalindrome(String s) {
        int lowerCase[] = new int[26];
      int upperCase[] = new int[26];
      
      for(int i =0; i <s.length(); i++){
           char c = s.charAt(i);
          if(c-97 >=0){
              lowerCase[c-97]++;
          }else{
              upperCase[c-65]++;
          }
              
      } 
      
      int ans = 0;
      boolean isFirstOdd   = false;    
      for(int i = 0; i <26; i++){
         if(lowerCase[i]%2 ==0){
             ans += lowerCase[i];
         }else{
             if(isFirstOdd == false){
               ans += lowerCase[i];      
               isFirstOdd = true;
             }
             else
              ans += lowerCase[i]-1;
         }
      }
      
      
      
      for(int i = 0; i <26; i++){
      if(upperCase[i]%2 ==0){
             ans += upperCase[i];
         }else{
             if(isFirstOdd == false){
               ans += upperCase[i];      
               isFirstOdd = true;
             }
             else
              ans += upperCase[i]-1;
         }
      }
     return ans;
  }

}
