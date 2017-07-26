package algorithm.search;

public class InterpolationSearch {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int key = 3;

		int pos = interpolationSearch(arr, key, 0, arr.length - 1);
		System.out.println(pos);
	}

	private static int interpolationSearch(int[] arr, int key, int lo, int hi) {
		// interpolation formula
		int pos = 0;
		while (lo < hi) {
			pos = lo + ((key - arr[lo]) * (hi - lo) / (arr[hi] - arr[lo]));
			if (key == arr[pos])
				return key;
			else if (key > arr[pos])
				lo = pos + 1;
			else
				hi = pos - 1;
		}
		return pos;
	}

}
