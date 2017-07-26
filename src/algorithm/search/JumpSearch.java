package algorithm.search;

public class JumpSearch {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int key = 2;

		int pos = interpolationSearch(arr, key);
		System.out.println("Position: " + pos);
	}

	private static int interpolationSearch(int[] arr, int key) {
		int a = 0;
		Long sqrt = Math.round(Math.sqrt(arr.length));
		int b = sqrt.intValue();

		while (arr[Math.min(b,arr.length) - 1] < key) {
			a = b;
			b += sqrt.intValue();
		}

		for (int i = a; i < Math.min(b, arr.length); i++) {
			if (arr[i] == key)
				return i + 1;
		}
		return -1;
	}

}
