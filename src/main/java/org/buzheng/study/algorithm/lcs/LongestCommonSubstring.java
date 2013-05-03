package org.buzheng.study.algorithm.lcs;

/**
 * 公共子字符串
 *
 */
public class LongestCommonSubstring {

	/**
	 * 构建分别以2个字符串长度为长和宽的二维数组m[l1][l2]。然后分别对应每个字符，
	 * 对不上的，在相应位置填0；对的上，在相应位置填1，如果位置较小的斜对角
	 * 元素m[i][j]值不为0，则表示已经存在公共子串，修正此位置的值m[i][j]=m[i-1][j-1]+1，
	 * 此值就是公共字符串的长度。
	 * 
	 * 拿 xcdef 和 abcdefg 举例，他们的公共序列是 cdef。生成二维表如下：
	 *     a b c d e f g
	 *   x 0 0 0 0 0 0 0
	 *   c 0 0 1 0 0 0 0
	 *   d 0 0 0 2 0 0 0
	 *   e 0 0 0 0 3 0 0
	 *   f 0 0 0 0 0 4 0
	 *   
	 * 此字符只是做参考，不包含在二维表中。
	 * 
	 * @param s1
	 * @param s2
	 * @return
	 */
	public String search(String s1, String s2) {
		if (s1 == null || s1.isEmpty() || s2 == null || s2.isEmpty()) {
			return "";
		}
				
		int len1 = s1.length();
		int len2 = s2.length();
		
		int[][] match = new int[len1][len2];
		int maxLength = 0; // 子字符串的最大长度
		int lastIndex = 0; // 最大子字符串中最后一个字符的索引
		
		for (int i = 0; i < len1; i++) {
			for (int j = 0; j < len2; j++) {
				
				if (s2.charAt(j) == s1.charAt(i)) {
					if (i > 0 && j > 0 && match[i-1][j-1] != 0) {
						match[i][j] = match[i-1][j-1] + 1;
					} else {
						match[i][j] = 1;
					}
					
					if (match[i][j] > maxLength) {
						maxLength = match[i][j];
						lastIndex = i;
					}
				} else {
					match[i][j] = 0;
				}				
			}
		}
		
		// 这里打印出构造出的矩阵
		for (int i = 0; i < len1; i++) {
			for (int j = 0; j < len2; j++) {
				System.out.print(match[i][j] + " ");
			}
			System.out.println();
		}
				
		if (maxLength == 0) {
			return "";
		}
		
		StringBuilder sb = new StringBuilder();
		// 根据最大索引的位置，回朔出最长子字符串
		for (int i = lastIndex-maxLength+1; i <= lastIndex; i++) {
			sb.append(s1.charAt(i));
		}
		
		return sb.toString();
	}
		
	public static void main(String[] args) {
		String s1 = "xcdef";
		String s2 = "abcdefg";
		
		System.out.println(new LongestCommonSubstring().search(s1, s2));
	}
}
