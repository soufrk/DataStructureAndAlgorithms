package program.string;

import java.util.HashSet;
import java.util.Set;

/**
 * Find all permutations of a given string
 * 
 * @author skedia
 *
 */
public class StringPermutation {

	public static void main(String[] args) {
		String input = "saurabh";

		Set<String> permSet = new HashSet<>();
		findPerms(input, 0, input.length(), permSet);
		System.out.println(permSet);
	}

	private static void findPerms(String input, int start, int end, Set<String> permSet) {
		if (start == end)
			permSet.add(input);
		for (int i = start; i < end; i++) {
			input = swap(input, start, i);
			findPerms(input, start + 1, end, permSet);
			input = swap(input, i, start);
		}
	}

	private static String swap(String input, int start, int i) {
		char[] cArr = input.toCharArray();
		char temp = cArr[start];
		cArr[start] = cArr[i];
		cArr[i] = temp;
		return new String(cArr);
	}

}
