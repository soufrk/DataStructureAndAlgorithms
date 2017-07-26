package algorithm.sort;

import java.util.Arrays;

public class CountingSort {

	public static void main(String[] args) {
		// unsorted input array
		int[] arr = { 5, 2, 1, 0, 34, 88, 12, 3, 8, 33, 76 };

		arr = countingSort(arr);

		System.out.println(Arrays.toString(arr));

	}

	private static int[] countingSort(int[] arr) {
		// initialize count array and output array
		int cArr[] = new int[arr.length * arr.length];
		Arrays.fill(cArr, 0);
		int oArr[] = new int[arr.length];

		// find count of each element
		for (int i = 0; i < arr.length; i++) {
			++cArr[arr[i]];
		}

		// build the sumCount Array
		for (int i = 1; i < cArr.length; i++)
			cArr[i] += cArr[i - 1];

		// place the number in its place in output array
		for (int i = 0; i < arr.length; i++) {
			oArr[cArr[arr[i]] - 1] = arr[i];
			cArr[arr[i]] -= 1;
		}
		return oArr;
	}

}
