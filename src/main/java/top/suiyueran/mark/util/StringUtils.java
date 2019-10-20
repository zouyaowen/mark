package top.suiyueran.mark.util;

public class StringUtils {
	/**
	 * 判断字符是否为中文
	 * 
	 * @param ch 需要判断的字符
	 * @return 中文返回true，非中文返回false
	 */
	private static boolean isChinese(char ch) {
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
}
