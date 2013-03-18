package org.buzheng.study.algorithm.lcs;

/**
 * 公共子串
 */
public class LongestCommonSubsequence {

	public String search(String s1, String s2) {
		if (s1 == null || s1.isEmpty() || s2 == null || s2.isEmpty()) {
			return "";
		}

		int[][] tmp = new int[s1.length() + 1][s2.length() + 1];

		for (int i = 1; i <= s1.length(); i++) {
			for (int j = 1; j <= s2.length(); j++) {
				if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
					tmp[i][j] = tmp[i - 1][j - 1] + 1;
				} else {
					tmp[i][j] = Math.max(tmp[i - 1][j], tmp[i][j - 1]);
				}
			}
		}

		for (int i = 0; i < tmp.length; i++) {
			for (int j = 0; j < tmp[i].length; j++) {
				System.out.print(tmp[i][j] + " ");
			}
			System.out.println();
		}

		StringBuilder sb = new StringBuilder();

		int i = s1.length(), j = s2.length();

		while (i > 0 && j > 0) {
			if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
				sb.append(s1.charAt(i - 1));
				i--;
				j--;
			} else if (tmp[i][j - 1] >= tmp[i - 1][j]) {
				j--;
			} else {
				i--;
			}
		}

		return sb.reverse().toString();
	}

	public String search2(String s1, String s2) {

		if (s1 == null || s1.isEmpty() || s2 == null || s2.isEmpty()) {
			return "";
		}

		int[][] tmp = new int[s1.length() + 1][s2.length() + 1];

		for (int i = s1.length() - 1; i >= 0; i--) {
			for (int j = s2.length() - 1; j >= 0; j--) {
				if (s1.charAt(i) == s2.charAt(j)) {
					tmp[i][j] = tmp[i+1][j+1] + 1;
				} else {
					tmp[i][j] = Math.max(tmp[i+1][j], tmp[i][j+1]);
				}
			}
		}
		
		output(tmp);
		
		int i = 0, j = 0, len1 = s1.length(), len2 = s2.length();
		StringBuilder sb = new StringBuilder();
		
		while (i < len1 && j < len2) {
			if (s1.charAt(i) == s2.charAt(j)) {
				sb.append(s1.charAt(i));
				i++;
				j++;
			} else if (tmp[i][j+1] >= tmp[i+1][j]) {
				j++;
			} else {
				i++;
			}
		}

		return sb.toString();
	}

	private void output(int[][] tmp) {
		for (int i = 0; i < tmp.length; i++) {
			for (int j = 0; j < tmp[i].length; j++) {
				System.out.print(tmp[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {

//		 String s1 = "GCGCAATG";
//		 String s2 = "GCCCTAGCG";

		String s1 = "GBTA";
		String s2 = "GCTA";

		System.out.println(new LongestCommonSubsequence().search(s1, s2));
		System.out.println(new LongestCommonSubsequence().search2(s1, s2));
	}

}
