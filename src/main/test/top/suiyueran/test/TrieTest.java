package top.suiyueran.test;

import top.suiyueran.mark.structure.Trie;

public class TrieTest {
	public static void main(String[] args) {
		Trie trie = new Trie();
		trie.add("hello");
		trie.add("world");
		trie.add("you");
		trie.add("are");
		trie.add("cat");
		trie.add("dog");
		System.out.println(trie);
		boolean contains = trie.contains("ca");
		System.out.println(contains);
	}
}
