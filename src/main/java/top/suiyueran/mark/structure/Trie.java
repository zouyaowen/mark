package top.suiyueran.mark.structure;

import java.util.TreeMap;

public class Trie {

	private Node root;
	private int size;

	public Trie() {
		root = new Node();
		this.size = 0;
	}

	public Node getRoot() {
		return root;
	}

	public void setRoot(Node root) {
		this.root = root;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	/**
	 * 添加单词:非递归实现
	 * 
	 * @param word
	 */
	public void add(String word) {
		Node cur = root;
		for (int i = 0; i < word.length(); i++) {
			char c = word.charAt(i);
			if (cur.next.get(c) == null) {
				cur.next.put(c, new Node());
			}
			cur = cur.next.get(c);
		}
		if (!cur.idWord) {
			cur.idWord = true;
			this.size++;
		}
	}

	/**
	 * 
	 * @param word
	 * @return
	 */
	public boolean contains(String word) {
		Node cur = root;
		for (int i = 0; i < word.length(); i++) {
			char c = word.charAt(i);
			if (cur.next.get(c) == null) {
				return false;
			}
			cur = cur.next.get(c);
		}
		return cur.idWord;
	}

	public class Node {
		public boolean idWord;
		public TreeMap<Character, Node> next;

		public Node(boolean idWord) {
			this.idWord = idWord;
			next = new TreeMap<Character, Node>();
		}

		public Node() {
			this(false);
		}

		@Override
		public String toString() {
			return "Node [idWord=" + idWord + ", next=" + next + "]";
		}
	}

	@Override
	public String toString() {
		return "Trie [root=" + root + ", size=" + size + "]";
	}
	
	
}
