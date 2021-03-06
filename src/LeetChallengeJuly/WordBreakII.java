package LeetChallengeJuly;
/*
 * Given a non-empty string s and a dictionary wordDict containing a list of non-empty words, add spaces in s to construct a sentence where each word is a valid dictionary word. Return all such possible sentences.

Note:

The same word in the dictionary may be reused multiple times in the segmentation.
You may assume the dictionary does not contain duplicate words.
Example 1:

Input:
s = "catsanddog"
wordDict = ["cat", "cats", "and", "sand", "dog"]
Output:
[
  "cats and dog",
  "cat sand dog"
]
Example 2:

Input:
s = "pineapplepenapple"
wordDict = ["apple", "pen", "applepen", "pine", "pineapple"]
Output:
[
  "pine apple pen apple",
  "pineapple pen apple",
  "pine applepen apple"
]
Explanation: Note that you are allowed to reuse a dictionary word.
Example 3:

Input:
s = "catsandog"
wordDict = ["cats", "dog", "sand", "and", "cat"]
Output:
[]
 */
public class WordBreakII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public List<String> wordBreak(String s, List<String> wordDict) {
	        return wordBreakHelper(s, wordDict, new HashMap<String, List<String>>());
	    }
	    
	    private List<String> wordBreakHelper(String s, List<String> wordDict, Map<String, List<String>> hashMap){
	        if(hashMap.containsKey(s)){
	            return hashMap.get(s);
	        }
	        
	        List<String> result = new ArrayList<>();
	        //basecase
	        if(s.isEmpty()){
	            result.add("");
	            return result;
	        }
	        
	        //  break the string apart and append the sunstring to the word
	        for(String word : wordDict){
	            if(s.startsWith(word)){
	               String sub = s.substring(word.length()); //it will return the sunstring after this word
	               List<String> subStrings = wordBreakHelper(sub,wordDict, hashMap);
	                
	               for(String substring : subStrings){
	                    String space = substring.isEmpty()?"":" ";
	                    result.add(word+space+substring);
	               }
	            }
	            hashMap.put(s, result);
	        }
	        return result;
	    }

}
