package program.string;

/**
 * Reverse a String using both iteration and recursion.
 * http://javarevisited.blogspot.sg/2012/01/how-to-reverse-string-in-java-using.html
 * 
 * @author skedia
 *
 */
public class ReverseString {

	public static void main(String[] args) {
		String input = "hakunamatata";

		System.out.println("## ITERATION ##");
		System.out.println(reverseStringUsingIteration(input));
		System.out.println("\n## RECURSION ##");
		System.out.println(reverseStringUsingRecursion(input, 0));
	}

	public static String reverseStringUsingIteration(String input) {
		String reversedString = "";
		for (int i = 0; i < input.length(); i++) {
			reversedString = input.charAt(i) + reversedString;
		}
		return reversedString;
	}

	public static String reverseStringUsingRecursion(String input, int index) {
		if (index == input.length() - 1) {
			return input.charAt(index) + "";
		}
		if (input == null || input.equals(""))
			return "";

		char c = input.charAt(index);
		String reversedString = reverseStringUsingRecursion(input, index + 1);
		return reversedString + c;
	}

}
