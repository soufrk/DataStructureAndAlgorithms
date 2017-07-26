package algorithm.backtracking;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LongestPalindromicSubsequence {

	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			int n = in.nextInt();
			for (int i = 0; i < n; i++) {
				String s = in.next();
				Map<Character, Integer> charMap = new HashMap<>();
				for (int j = 0; j < s.length(); j++) {
					if (charMap.containsKey(s.charAt(j))) {
						charMap.put(s.charAt(j), charMap.get(s.charAt(j)) + 1);
					} else {
						charMap.put(s.charAt(j), 1);
					}
				}
				String uniqueCharString = "";
				for (Character c : charMap.keySet()) {
					uniqueCharString += c;
				}
				System.out.println(longestSubsequence(uniqueCharString, charMap, 0));
			}
		}
	}

	public static int longestSubsequence(String uniqueCharString, Map<Character, Integer> charMap, int x) {
		int length = 0;
		boolean isSingleCharPresent = false;
		for (int i = x; i < uniqueCharString.length(); i++) {
			int val = charMap.get(uniqueCharString.charAt(i));
			if (val % 2 == 0)
				length += val;
			else
				isSingleCharPresent = true;
		}
		return isSingleCharPresent ? length + 1 : length;
	}

}
