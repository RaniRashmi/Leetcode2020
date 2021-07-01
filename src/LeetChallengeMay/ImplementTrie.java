/*
 * Implement Trie (Prefix Tree)
Solution
Implement a trie with insert, search, and startsWith methods.

Example:

Trie trie = new Trie();

trie.insert("apple");
trie.search("apple");   // returns true
trie.search("app");     // returns false
trie.startsWith("app"); // returns true
trie.insert("app");   
trie.search("app");     // returns true
Note:

You may assume that all inputs are consist of lowercase letters a-z.
All inputs are guaranteed to be non-empty strings.
 */
package LeetChallengeMay;

import java.util.Map;

public class ImplementTrie {

	 Map<Character,Trie> children;
		boolean endOfWord;
	    /** Initialize your data structure here. */
	    public Trie() {
	        children = new HashMap<>();
			endOfWord = false;
	    }
	    
	    /** Inserts a word into the trie. */
	    public void insert(String word) {
	        Trie current  = this;
	        for(int i=0;i<word.length();i++){
	            char ch = word.charAt(i);
	            Trie node = current.children.get(ch);
	            if(node == null){
	                node = new Trie();
	                current.children.put(ch, node);
	            }
	            current = node;
	        }
	        current.endOfWord = true;
	    }
	    
	    /** Returns if the word is in the trie. */
	    public boolean search(String word) {
	        Trie current = this;
			for(int i=0;i<word.length();i++) {
				char ch = word.charAt(i);
				Trie node = current.children.get(ch);
				
				if(node == null) {
				  return false;
				}
				current = node;
			}
			return current.endOfWord;
	    }
	    
	    /** Returns if there is any word in the trie that starts with the given prefix. */
	    public boolean startsWith(String prefix) {
	        Trie current = this;
			for(int i=0;i<prefix.length();i++) {
				char ch = prefix.charAt(i);
				Trie node = current.children.get(ch);
				
				if(node == null) {
				  return false;
				}
				current = node;
			}
			return true;
	    }
	}