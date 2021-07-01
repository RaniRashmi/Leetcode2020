package TrieProblems;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class WordSearch2 {
	
	public class TrieNode{
        public boolean isWord = false;
        public TrieNode [] child = new TrieNode[26];
        public TrieNode(){
            
        }
    }
    
    TrieNode root = new TrieNode();
    boolean [][] isVisited;
    public List<String> findWords(char[][] board, String[] words) {
        //for keeping all the word who are present in search
        Set<String> result = new HashSet<String>();
        isVisited = new boolean[board.length][board[0].length];
        
        //before doing word search first create trie
        createTrie(words);
        
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(root.child[board[i][j]-'a'] != null){
                    search(board, i, j, root, "",result);
                }
            }
        }
        List<String> list = new LinkedList<>(result);
        Collections.sort(list);
        return list;
    }
    
    public void createTrie(String [] words){
        for(String word : words){
            TrieNode currentNode = root;
            for(int i=0;i<word.length();i++){
                char ch = word.charAt(i);
                if(currentNode.child[ch-'a'] == null){
                    currentNode.child[ch-'a'] = new TrieNode();
                }
                currentNode = currentNode.child[ch-'a'];
            }
            currentNode.isWord = true;
        }
        
    }
    
    public void search(char[][] board, int i, int j,   TrieNode node, String word, Set<String> result){
    if(i<0 || i>= board.length || j<0 || j>= board[0].length|| isVisited[i][j] || node.child[board[i][j]-'a'] == null ){
            return;
        }
        isVisited[i][j] = true;
        node = node.child[ board[i][j]-'a'];
        if(node.isWord){
            result.add(word + board[i][j]);
        }
        search(board, i-1, j, node, word + board[i][j],result);
        search(board, i, j-1, node, word + board[i][j],result);
        search(board, i+1, j, node, word + board[i][j],result);
        search(board, i, j+1, node, word + board[i][j],result);
        
        //after one word backtrack
        isVisited[i][j] = false;
    }

}
