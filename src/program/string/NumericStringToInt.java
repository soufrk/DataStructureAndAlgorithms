package program.string;

/**
 * Convert Numeric String to Integer
 * 
 * @author skedia
 *
 */
public class NumericStringToInt {

	public static void main(String[] args) {
		String no = "123455";
		int res = 0;
		for (int i = 0; i < no.length(); i++) {
			res = res * 10 + (no.charAt(i) - '0');
		}
		System.out.println(res);

	}

}
