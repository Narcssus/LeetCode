package q208;

import java.util.LinkedList;

class TrieNode {
	// Initialize your data structure here.
	LinkedList<TrieNode> sons = new LinkedList<TrieNode>();
	char c;
	int sum;

	public TrieNode() {
	}

	public TrieNode(char c) {
		this.c = c;
		this.sum = 1;
	}

	public TrieNode(TrieNode father, char c) {
		this.c = c;
		this.sum = 1;
		father.sons.add(this);
	}
}

public class Trie {
	private TrieNode root;

	public Trie() {
		root = new TrieNode();
	}

	// Inserts a word into the trie.
	public void insert(String word) {
		TrieNode tmp = root;
		boolean find;
		for (int i = 0; i < word.length(); i++) {
			char c = word.charAt(i);
			LinkedList<TrieNode> sons = tmp.sons;
			find = false;
			for (int j = 0; j < sons.size(); j++) {
				if (sons.get(j).c == c) {
					tmp = sons.get(j);
					tmp.sum++;
					find = true;
					break;
				}
			}
			if (!find) {
				TrieNode tmp2 = new TrieNode(tmp, c);
				tmp = tmp2;
				// System.out.println(tmp.sons.get(tmp.sons.size()-1).c);
			}
		}
	}

	// Returns if the word is in the trie.
	public boolean search(String word) {
		TrieNode tmp = root;
		boolean find;
		for (int i = 0; i < word.length(); i++) {
			char c = word.charAt(i);
			LinkedList<TrieNode> sons = tmp.sons;
			find = false;
			for (int j = 0; j < sons.size(); j++) {
				if (sons.get(j).c == c) {
					tmp = sons.get(j);
					find = true;
					break;
				}
			}
			if (!find) {
				return false;
			}
		}
		if (tmp.sons.size() > 0) {
			int sum = 0;
			LinkedList<TrieNode> sons = tmp.sons;
			for (int j = 0; j < sons.size(); j++) {
				sum += sons.get(j).sum;
			}
			if (sum == tmp.sum)
				return false;
		}
		return true;
	}

	// Returns if there is any word in the trie
	// that starts with the given prefix.
	public boolean startsWith(String prefix) {
		TrieNode tmp = root;
		boolean find;
		for (int i = 0; i < prefix.length(); i++) {
			char c = prefix.charAt(i);
			LinkedList<TrieNode> sons = tmp.sons;
			find = false;
			for (int j = 0; j < sons.size(); j++) {
				if (sons.get(j).c == c) {
					tmp = sons.get(j);
					find = true;
					break;
				}
			}
			if (!find) {
				return false;
			}
		}
		return true;
	}

//	public static void main(String[] args) {
//		Trie t = new Trie();
//		t.insert("abc");
//		System.out.println(t.search("abc"));
//		System.out.println(t.search("ab"));
//		t.insert("ab");
//		System.out.println(t.search("ab"));
//		t.insert("ab");
//		System.out.println(t.search("ab"));
//
//	}

}
