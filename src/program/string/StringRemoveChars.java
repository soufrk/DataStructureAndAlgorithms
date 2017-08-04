package program.string;

import java.util.Arrays;
import java.util.List;

/**
 * Remove all occurrences of given letters from a given String
 * 
 * @author skedia
 *
 */
public class StringRemoveChars {

	public static void main(String[] args) {
		String input = "programmer";
		Character[] rmChars = { 'r', 'm' };
		List<Character> charList = Arrays.asList(rmChars);

		String outputString = "";
		for (Character c : input.toCharArray()) {
			if (!charList.contains(c))
				outputString += c;
		}

		System.out.println(outputString);
	}

}
