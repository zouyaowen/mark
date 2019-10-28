package top.suiyueran.mark.structure;

import java.util.concurrent.ConcurrentHashMap;

public class TrieTest {
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		ConcurrentHashMap<Object, Object> concurrentHashMap = new ConcurrentHashMap<>();
		String str = "zdxcfbdb，的改变？、|、《》你的疯了把你";
		for (int i = 0; i < str.length(); i++) {
			Character c = str.charAt(i);
			System.out.println(c);
			System.out.println("-----------");
			if (TrieTree.isChinese(c)) {
				System.out.println(c);
			}
		}
	}
}
