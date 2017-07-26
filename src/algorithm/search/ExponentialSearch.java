package algorithm.search;

public class ExponentialSearch {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int key = 3;

		int pos = exponentialSearch(arr, key);
		System.out.println(pos);
	}

	private static int exponentialSearch(int[] arr, int key) {
		int i =1;
		while (i < arr.length && arr[i] <= key)
			i *= 2;

		System.out.println(i);
		return BinarySearch.binarySearch(arr, key, i / 2, Math.min(i, arr.length));
	}

}
