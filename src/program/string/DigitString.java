package program.string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Check if a given String is an only digit String
 * http://javarevisited.blogspot.sg/2012/10/regular-expression-example-in-java-to-check-String-number.html
 * 
 * @author skedia
 *
 */
public class DigitString {

	public static void main(String[] args) {
		String digitStr = "12345.44";
		Pattern p = Pattern.compile("-?[\\d]+(\\.\\d+)?");
		Matcher m = p.matcher(digitStr);
		if (m.matches())
			System.out.println("Input is Digit String");
		else
			System.out.println("Input is Not a Digit String");

	}

}
