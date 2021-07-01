/*
 * Given a pattern and a string str, find if str follows the same pattern.

Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in str.

Example 1:

Input: pattern = "abba", str = "dog cat cat dog"
Output: true
Example 2:

Input:pattern = "abba", str = "dog cat cat fish"
Output: false
Example 3:

Input: pattern = "aaaa", str = "dog cat cat dog"
Output: false
Example 4:

Input: pattern = "abba", str = "dog dog dog dog"
Output: false
Notes:
You may assume pattern contains only lowercase letters, and str contains lowercase letters that may be separated by a single space.
 */
package LeetChallengeSept;

import java.util.HashMap;

public class Day_07_WordPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public boolean wordPattern(String pattern, String str) {
	        String [] words = str.split(" ");
	        if(pattern.length() != words.length) return false;
	        
	        HashMap<Character, String> map  = new HashMap<>();
	        for(int i=0;i<pattern.length();i++){
	            char currentChar = pattern.charAt(i);
	            if(map.containsKey(currentChar)){
	//case Input:pattern = "abba", str = "dog cat cat fish".... fish is not equal to dog
	                
	                if(!map.get(currentChar).equals(words[i])){
	                    return false;
	                }
	            }else{
	//Input: pattern = "abba", str = "dog dog dog dog"  ...a is already assign to dog, so b can't to assign dog
	                if(map.containsValue(words[i])){
	                    return false;
	                }
	                map.put(currentChar, words[i]);
	            }
	        }
	        return true;
	    }

}
