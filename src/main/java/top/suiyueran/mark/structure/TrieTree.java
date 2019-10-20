package top.suiyueran.mark.structure;

import java.util.concurrent.ConcurrentHashMap;

import lombok.Data;

@Data
public class TrieTree {

	private ConcurrentHashMap<Character, TrieNode> trieTree;

	public static class TrieNode {
		public boolean idWord;
		public ConcurrentHashMap<Character, TrieNode> next;
	}

	/**
	 * 判断是否为中文：包含中文标点
	 * 
	 * @param ch
	 * @return
	 */
	public static boolean isChinese(char ch) {
		// 获取此字符的UniCodeBlock
		Character.UnicodeBlock ub = Character.UnicodeBlock.of(ch);
		// GENERAL_PUNCTUATION 判断中文的“号
		// CJK_SYMBOLS_AND_PUNCTUATION 判断中文的。号
		// HALFWIDTH_AND_FULLWIDTH_FORMS 判断中文的，号
		if (ub == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS || ub == Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS || ub == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A
				|| ub == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_B || ub == Character.UnicodeBlock.CJK_SYMBOLS_AND_PUNCTUATION // 判断中文的。号
				|| ub == Character.UnicodeBlock.HALFWIDTH_AND_FULLWIDTH_FORMS // 判断中文的，号
				|| ub == Character.UnicodeBlock.GENERAL_PUNCTUATION // 判断中文的“号
		) {
			System.out.println(ch + " 是中文");
			return true;
		}
		return false;
	}

	/**
	 * 判断字符串是否全部为中文，不包含中文标点
	 * 
	 * @param word
	 * @return
	 */
	public static boolean isChainese(String word) {
		return word.matches("[\u4e00-\u9fcc]+");
	}

	/**
	 * 判断是否为汉字，不包含中文标点
	 * 
	 * @param c
	 * @return
	 */
	public static boolean isChineseByScript(char c) {
		Character.UnicodeScript sc = Character.UnicodeScript.of(c);
		if (sc == Character.UnicodeScript.HAN) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		System.out.println(isChainese("知道粉，红色的"));
		String str = "电饭煲豆腐干，豆腐不能知道";
		System.out.println("----------");
		for (int i = 0; i < str.length(); i++) {
			char charAt = str.charAt(i);
			System.out.println("判断是否为汉字" + isChineseByScript(charAt));
			System.out.println(charAt);
		}
	}

}
