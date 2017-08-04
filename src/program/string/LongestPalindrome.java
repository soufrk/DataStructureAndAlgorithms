package program.string;

public class LongestPalindrome {

	public static void main(String[] args) {
		String input = "abcabcacbaaabcac";
		// find the longest substring
		int maxlength = 0;
		for (int i = 0; i < input.length(); i++) {
			int length = 0;
			// for odd palindromes
			length = findPalindromeLength(input, i, i);
			maxlength = length > maxlength ? length : maxlength;
			// for even length palindromes
			length = findPalindromeLength(input, i, i + 1);
			maxlength = length > maxlength ? length : maxlength;
		}
		System.out.println(maxlength);

	}

	private static int findPalindromeLength(String input, int a, int b) {
		int length = 0;
		for (int j = a, k = b; j >= 0 && k < input.length(); j--, k++) {
			if (input.charAt(j) != input.charAt(k))
				break;
			if (j == k) {
				System.out.print(input.charAt(j) + "\t");
				length += 1;
			} else {
				System.out.print(input.charAt(j) + "\t" + input.charAt(k) + "\t");
				length += 2;
			}
		}
		return length;
	}

	public static boolean isPalindrome(String s) {
		boolean isPalindrome = true;
		for (int i = 0; i <= s.length() / 2; i++) {
			if (s.charAt(i) != s.charAt(s.length() - 1 - i))
				isPalindrome = false;
		}
		return isPalindrome;
	}

}
