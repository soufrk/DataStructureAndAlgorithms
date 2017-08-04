package program.string;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Print first non repeated character of a given string
 * 
 * @author skedia
 *
 */
public class FirstNonRepeatedChar {

	public static void main(String[] args) {
		String input = "Morning";
		input = input.toLowerCase().replaceAll(" ", "");

		if (input != null && !input.equals("")) {
			Map<Character, Integer> charMap = new LinkedHashMap<>();
			char[] charArray = input.toCharArray();

			for (Character c : charArray) {
				if (charMap.containsKey(c))
					charMap.put(c, charMap.get(c) + 1);
				else
					charMap.put(c, 1);
			}

			for (Map.Entry<Character, Integer> entry : charMap.entrySet()) {
				if (entry.getValue() == 1) {
					System.out.println(entry.getKey());
					break;
				}
			}
		}
	}

}
