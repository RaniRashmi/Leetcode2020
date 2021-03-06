/*
 * Implement the StreamChecker class as follows:

StreamChecker(words): Constructor, init the data structure with the given words.
query(letter): returns true if and only if for some k >= 1, the last k characters queried (in order from oldest to newest, including this letter just queried) spell one of the words in the given list.
 

Example:

StreamChecker streamChecker = new StreamChecker(["cd","f","kl"]); // init the dictionary.
streamChecker.query('a');          // return false
streamChecker.query('b');          // return false
streamChecker.query('c');          // return false
streamChecker.query('d');          // return true, because 'cd' is in the wordlist
streamChecker.query('e');          // return false
streamChecker.query('f');          // return true, because 'f' is in the wordlist
streamChecker.query('g');          // return false
streamChecker.query('h');          // return false
streamChecker.query('i');          // return false
streamChecker.query('j');          // return false
streamChecker.query('k');          // return false
streamChecker.query('l');          // return true, because 'kl' is in the wordlist
 

Note:

1 <= words.length <= 2000
1 <= words[i].length <= 2000
Words will only consist of lowercase English letters.
Queries will only consist of lowercase English letters.
The number of queries is at most 40000.
 */
package LeetChallengeAug;

public class Day_23_StreamofCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	class TrieNode {
        boolean word = false;
        Map<Character, TrieNode> children = new HashMap<>();
    }

    class TrieTree {
        TrieNode root = new TrieNode();
        public void insert(String s) {
            TrieNode current = root;
            for (int i = s.length()-1; i >= 0; i--) {
                current = current.children.computeIfAbsent(s.charAt(i), x -> new TrieNode());
            }
            current.word = true;
        }

        public boolean search(StringBuilder builder) {
            TrieNode current = root;
            for (int i = builder.length()-1; i >= 0; i--) {
                char ch = builder.charAt(i);
                current = current.children.get(ch);
                if (current == null) return false;
                if (current.word) return true;
            }
            return false;
        }
    }
    
    TrieTree trie = new TrieTree();
    StringBuilder builder = new StringBuilder();

    public StreamChecker(String[] words) {  // class name
        for (String word: words) {
            trie.insert(word);
        }
    }

    public boolean query(char letter) {
        builder.append(letter);
        return trie.search(builder);
    }

}
