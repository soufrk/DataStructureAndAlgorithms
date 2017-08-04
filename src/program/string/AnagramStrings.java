package program.string;

import java.util.Arrays;

/**
 * Check if given two strings are anagrams or not
 * http://javarevisited.blogspot.sg/2013/03/Anagram-how-to-check-if-two-string-are-anagrams-example-tutorial.html
 * 
 * @author skedia
 *
 */
public class AnagramStrings {

	public static void main(String[] args) {
		String iStr1 = "mary";
		String iStr2 = "Army";

		iStr1 = iStr1.toLowerCase().replaceAll(" ", "");
		iStr2 = iStr2.toLowerCase().replaceAll(" ", "");

		if (isAnagram(iStr1, iStr2)) {
			System.out.println("Strings are anagrams");
		} else
			System.out.println("Strings are not anagrams");
	}

	private static boolean isAnagram(String iStr1, String iStr2) {
		if (iStr1.length() != iStr2.length()) {
			return false;
		}
		char[] charArr1 = iStr1.toCharArray();
		char[] charArr2 = iStr2.toCharArray();

		Arrays.sort(charArr1);
		Arrays.sort(charArr2);

		String oStr1 = new String(charArr1);
		String oStr2 = new String(charArr2);

		if (oStr1.equals(oStr2))
			return true;
		else
			return false;
	}

}
