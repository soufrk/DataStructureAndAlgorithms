package program.string;

import java.util.HashMap;
import java.util.Map;

/**
 * Print duplicate characters in a given String. Try to handle all the
 * cases.<br/>
 * http://java67.blogspot.sg/2014/03/how-to-find-duplicate-characters-in-String-Java-program.html
 * 
 * @author skedia
 *
 */
public class DuplicateChars {

	public static void main(String[] args) {
		String input = "programming";
		Map<Character, Integer> charMap = new HashMap<>();
		if (input != null && !input.equals("")) {
			char[] charArray = input.toCharArray();
			for (Character c : charArray) {
				if (charMap.containsKey(c))
					charMap.put(c, charMap.get(c) + 1);
				else
					charMap.put(c, 1);
			}

			for (Map.Entry<Character, Integer> entry : charMap.entrySet()) {
				if (entry.getValue() > 1)
					System.out.print(entry.getKey() + "\t");
			}
		} else {
			System.out.println("Invalid String");
		}
	}

}
