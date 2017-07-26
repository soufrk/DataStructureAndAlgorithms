package algorithm.patternsearch;

public class NaivePatternSearch {

	public static void main(String[] args) {
		String s = "1011111101111";
		String p = "101";
		System.out.println(match(s, p));

	}

	public static int match(String s, String p) {
		int sn = s.length();
		int pn = p.length();
		int result = 0;

		for (int i = 0; i <= sn - pn; i++) {
			int j = 0;
			for (j = 0; j < pn; j++) {
				if (s.charAt(i + j) != p.charAt(j))
					break;
			}

			if (j == pn)
				result++;
		}
		return result;
	}

}
