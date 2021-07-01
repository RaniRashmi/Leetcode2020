package TrieProblems;
class TrieNode{
	boolean endOfWord;
	TrieNode [] children = new TrieNode[26];
}
public class Trie {
    TrieNode root;
    public Trie() {
    	root = new TrieNode();
    }
    
    public void insert(String word) {
    	 TrieNode node = root;
    	 for(int i=0;i<word.length();i++) {
    		 char ch = word.charAt(i);
    		 if(node.children[ch-'a'] == null) {
    			 node.children[ch-'a'] = new TrieNode();
    		 }
    		 node = node.children[ch-'a'];
    	 }
    	 node.endOfWord =true;
    }
    
    public boolean search(String word) {
    	TrieNode node = root;
    	for(int i=0;i<word.length();i++) {
    		char ch = word.charAt(i);
    		if(node.children[ch-'a']==null) {
    			return false;
    		}
    		node = node.children[ch-'a'];
    	}
    	return node.endOfWord;
    }
    
    public boolean startWith(String prefix) {
    	TrieNode node = root;
    	for(int i=0;i<prefix.length();i++) {
    		char ch = prefix.charAt(i);
    		if(node.children[ch-'a']==null) {
    			return false;
    		}
    		node = node.children[ch-'a'];
    	}
    	return true;
    }
}
